package com.songzhi.carInsure.core.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.songzhi.carInsure.service.dto.Packet;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class XmlUtils {
	private static final String HEAD = "<?xml version=\"1.0\" encoding=\"GBK\"?>";
	private static String getxml(String filename){
		InputStream in = CrmCommonUtils.class.getResourceAsStream("/xmltemplate/"+filename);
		BufferedReader readerb =null;
		try {
			readerb = new BufferedReader(new InputStreamReader(in,"GBK"));
		} catch (UnsupportedEncodingException e2) {
			e2.printStackTrace();
		}
        StringBuilder builder = new StringBuilder();

        String line = null;
        try {
            while ((line = readerb.readLine()) != null) {
                builder.append(line);
                builder.append("\n"); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		String xml = builder.toString();
		
		xml.replace("<PACKET>", "<PACKET type=\"REQUEST\" version=\"1.0\">");
		
		System.out.println(xml);
		return xml;
	}
	public static  String buildMessage(String trans_type,Packet pa,boolean isTpf){
		StringBuffer buffer = new StringBuffer();
		buffer.append(HEAD);
		buffer.append("\n");
		String fileName = "";
		if(isTpf){
			fileName = trans_type +"-TPF.xml";
		}else{
			fileName = trans_type +"-BIZ.xml";
		}
		String templateContent = readFileContent(fileName);
		SAXReader reader = new SAXReader();
		StringReader strReader = new StringReader(templateContent);
		
		Document document = null;
		try {
			document = reader.read(strReader);
		} catch (DocumentException e1) {
			
		}
		XStream xStream = new XStream(new DomDriver(null,new XmlFriendlyNameCoder("_-", "_")));
		if (document != null) {
			try {
				getAlias(document.getRootElement(),xStream, trans_type);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		String tempxml = xStream.toXML(pa);
		String tempxml01= filter(tempxml);
		buffer.append("<PACKET type=\"REQUEST\" version=\"1.0\">"+tempxml01.split("<PACKET>")[1]);
		String reStr = buffer.toString();
		return reStr;
	}
	 public static String filter(String xmlStr) { 
		 Document document = null; 
		 try {
			document = DocumentHelper.parseText(xmlStr);
            recursiveFixElement(document.getRootElement());      
            List<Node> nodeList = document.selectNodes("//@delete"); 
            for (Node node : nodeList) { 
                node.getParent().detach();  //剔除xml元素 
            } 
	        } catch (DocumentException e) { 
	            e.printStackTrace(); 
	        } 
	        OutputFormat format = OutputFormat.createPrettyPrint();
	        format.setExpandEmptyElements(false);
	        format.setIndent(" ");
	        
	        StringWriter out=null;
			try {
				out=new StringWriter();  
				XMLWriter writer=new XMLWriter(out,format);  
	            writer.write(document);
	            writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	        return out.toString().replace("&amp;", "&");
	 }
	 //递归算法：遍历xml，标识无效的元素节点 
	    private static void recursiveFixElement(Element element) { 
	        List<Element> elements = element.elements(); 
	        if (elements.size() > 0) { 
	            for (Iterator<Element> it = elements.iterator(); it.hasNext();) { 
	                Element e = it.next(); 
	                String tempas=e.getName();
	                char c = tempas.charAt(0);
	                if(Character.isLowerCase(c)){
	                	e.addAttribute("delete", "true");
	                }
	                recursiveFixElement(e); 
	            } 
	        } 
	    } 
	
	private static void getAlias(Element element, XStream xStream, String requestType)
			throws ClassNotFoundException {
		// 如果当前元素具有class属性，则为类型节点，设置类别名
		if (element.selectSingleNode("@class") != null) {
			Class clazz = Class.forName(element.selectSingleNode("@class")
					.getText().trim());
			// 带有class属性的节点名作为类的别名
			xStream.alias(element.getName().trim(), clazz);
		}
		if (element.selectSingleNode("@attribute") != null) {
			StringTokenizer st = new StringTokenizer(element
					.selectSingleNode("@attribute").getText().trim(), ",");
			while (st.hasMoreTokens()) {
				String att = (String) st.nextToken();
				xStream.useAttributeFor(
						Class.forName(element.selectSingleNode("@class")
								.getText().trim()), att);
			}
		}
		// 如果当前元素具有en属性，则为属性节点，设置属性的别名。
		if (element.selectSingleNode("@en") != null) {
			// 属性所属的类
			Class fatherClazz = Class.forName(element.getParent()
					.selectSingleNode("@class").getText().trim());
			Node node = element.selectSingleNode("@omit");
			if (node != null
					&& (node.getText().indexOf(requestType) != -1 || node
							.getText().equals("true"))) {
				if (element.selectSingleNode("@parent") != null) {
					xStream.omitField(fatherClazz.getSuperclass(), element
							.selectSingleNode("@en").getText());
				} else {
					xStream.omitField(fatherClazz,
							element.selectSingleNode("@en").getText());
				}

				return;
			} else {
				xStream.aliasField(element.getName().trim(), fatherClazz,
						element.selectSingleNode("@en").getText().trim());
			}
		}
		// 递归设置参数元素下所有元素的别名信息
		List<Element> eList = element.elements();
		if (eList.size() > 0) {
			for (Element e : eList) {
				getAlias(e, xStream, requestType);// 递归设置
			}
		}
	}
	
	private static String readFileContent(String template){
		InputStream in = CrmCommonUtils.class.getResourceAsStream("/xmltemplate/"+template);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte [] b = new byte [2048];
		int readSize = 0;
		try {
			while ((readSize = in.read(b)) > 0) {
				baos.write(b,0,readSize);
			}
		} catch (IOException e) {
			
		} finally{
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					
				}
			}
		}
		return baos.toString();
	}

	/** 
	* 判断是否是xml结构 
	*/ 
	public static boolean isXML(String value) { 
		try { 
			DocumentHelper.parseText(value); 
		} catch (DocumentException e) { 
			return false; 
		} 
			return true; 
	} 
	
}
