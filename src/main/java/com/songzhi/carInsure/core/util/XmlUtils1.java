package com.songzhi.carInsure.core.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.exolab.castor.xml.XMLContext;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

import com.thoughtworks.xstream.XStream;

public class XmlUtils1 {
	
	private static XStream xstreamInit(Class clazz){
    	XStream xstream = new XStream();
    	xstream.alias(clazz.getSimpleName(), clazz);
    	return xstream;
    }
	
	public static String objToXML(Object obj) {
    	return xstreamInit(obj.getClass()).toXML(obj);   
    } 
	
	public static String objToXML(Object obj, String mappingPath) throws IOException, MappingException, MarshalException, ValidationException{
    	XMLContext context = castorXMLContextInit(mappingPath);
	    Writer writer = new StringWriter();
	    Marshaller marshaller = context.createMarshaller();
	    marshaller.setWriter(writer);
	    marshaller.marshal(obj);
	    return writer.toString().substring(writer.toString().indexOf("\n")+1);
    }
	
	public static String objsToXML(Object[] objs) {
    	StringBuilder xml = new StringBuilder();
    	XStream xstream = xstreamInit(objs[0].getClass());
    	for(Object obj : objs)
    		xml.append(xstream.toXML(obj));
    	return xml.toString();   
    }  
	
	public static String objsToXML(Object[] objs, String mappingPath) throws IOException, MappingException, MarshalException, ValidationException{
    	XMLContext context = castorXMLContextInit(mappingPath);
	    Writer writer = new StringWriter();
	    Marshaller marshaller = context.createMarshaller();
	    marshaller.setWriter(writer);
	    for(Object obj : objs)
	    	marshaller.marshal(obj);
	    return writer.toString().substring(writer.toString().indexOf("\n")+1);
    }
	
	public static Object XMLToObj(String xml, Class clazz){  
    	return xstreamInit(clazz).fromXML(xml);
    } 
	
	public static Object XMLToObj(String xml, Class clazz, String mappingPath) throws MarshalException, ValidationException, IOException, MappingException{  
    	XMLContext context = castorXMLContextInit(mappingPath);
    	Unmarshaller unmarshaller = context.createUnmarshaller();
    	unmarshaller.setClass(clazz);
    	return unmarshaller.unmarshal(new StringReader(xml));
    }  
	
	
	public static Object[] XMLToObjs(String xml, Class clazz) throws JDOMException, IOException{  
    	String[] xmls = xmlSplit(xml);
    	Object[] objs = new Object[xmls.length];
    	XStream xstream = xstreamInit(clazz);
    	for(int i = 0; i < xmls.length; i++)
    		objs[i] = xstream.fromXML(xmls[i]);
    	return objs;
    }  
	
	public static Object[] XMLToObjs(String xml, Class clazz, String mappingPath) throws MarshalException, ValidationException, IOException, MappingException, JDOMException{  
    	String[] xmls = xmlSplit(xml);
    	XMLContext context = castorXMLContextInit(mappingPath);
    	Unmarshaller unmarshaller = context.createUnmarshaller();
    	unmarshaller.setClass(clazz);
    	Object[] objs = new Object[xmls.length];
    	for(int i = 0; i < xmls.length; i++)
    		objs[i] = unmarshaller.unmarshal(new StringReader(xmls[i]));
    	return objs;
    }  
	
	private static String[] xmlSplit(String xml) throws JDOMException, IOException{
    	SAXBuilder builder = new SAXBuilder();
    	InputStream is = new ByteArrayInputStream(("<Root>"+xml+"</Root>").getBytes("UTF-8"));
    	Document document = builder.build(is);
    	Element root = document.getRootElement();
    	List<Element> list = root.getChildren();
    	XMLOutputter outputter = new XMLOutputter();
    	String[] elements = new String[list.size()];
    	for(int i = 0; i < list.size(); i++){
    		elements[i] = outputter.outputString(list.get(i));
    	}
    	return elements;
    }
	
	private static XMLContext castorXMLContextInit(String mappingPath) throws IOException, MappingException{
    	Mapping mapping = new Mapping();
    	mapping.loadMapping(mappingPath);
    	XMLContext context = new XMLContext();
    	context.addMapping(mapping);
    	return context;
    }
	
}
