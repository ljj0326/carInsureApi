package com.songzhi.carInsure.core.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
//import java.security.cert.X509Certificate;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.List;
import java.util.Map;
import java.util.Set;
//import java.util.Map.Entry;

//import javax.net.ssl.SSLContext;
//import javax.net.ssl.TrustManager;
//import javax.net.ssl.X509TrustManager;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.songzhi.carInsure.core.util.JaxbUtil.CollectionWrapper;
import com.songzhi.carInsure.service.vo.response.ResponseVo;

public class ClientUtil {
	private static final String METHOD_POST = "POST";  
    private static final String DEFAULT_CHARSET = "utf-8";  
    private static final String URL="http://10.196.20.148:6501/CarService";
    
	private static Logger logger =LoggerFactory.getLogger(ClientUtil.class);

    
    
    public static void main(String[] args) throws Exception {
    	
    	String xml="<?xml version='1.0' encoding='GBK' standalone='yes'?>"+
        		"<PACKET>"+
        		"	<HEAD>"+
        		"		<TRANS_TYPE>B104</TRANS_TYPE>"+
        		"		<USER>netsale_test</USER>"+
        		"		<PASSWORD>111111</PASSWORD>"+
        		"		<SERIALNO>vehicle</SERIALNO>"+
        		"	</HEAD>"+
        		"	<BODY>"+
        		"		<BASE_PART>"+
        		"			<C_DPT_CDE>339700D0</C_DPT_CDE>"+
        		"			<C_PROD_NO>0360</C_PROD_NO>"+
        		"			<C_BSNS_TYP>F0202</C_BSNS_TYP>"+
        		"			<C_OPR_CDE>070001</C_OPR_CDE>"+
        		"		</BASE_PART>"+
        		"		<VEHICLE>"+
        		"			<C_MODEL_NME>大众FV7187FBDWG轿车</C_MODEL_NME>"+
        		"		</VEHICLE>"+
        		"	</BODY>"+
        		"</PACKET>";
        
    	Map<String,String>  map=new HashMap<String, String>();
    	map.put("GW_CH_TX", "B104");
    	map.put("GW_CH_CODE", "ZHEB");
    	map.put("GW_CH_USER", "ZHEB");
    	map.put("GW_CH_PWD", "ZHEB");
    	map.put("GW_FACADE_FLAG", "2");
    	map.put("Content-Type", "text/xml; charset=GBK");
    	
    	String retXml = ClientUtil.post(null, xml, map,"GBK");
    	
		System.out.println(retXml);		
        
        System.out.println("xml:"+retXml);
          
        //将xml字符串转换为java对象  
        JaxbUtil resultBinder = new JaxbUtil(ResponseVo.class,  
                CollectionWrapper.class); 
        
//        ResponseVo respVo = resultBinder.fromXml(retXml);  
//        
//        ResponseHead respHead = respVo.getResponseHead();
//        
//        ResponseBody respBody = respVo.getResponseBody();
          
          
//        System.out.println("respObj:"+respVo.getType());  
	}
    
    /**
     * 接口入口
     * @param url 接口地址，如果不传获取默认的地址
     * @param xml 提交的报文内容
     * @param headerMap 需要通过头文件验证的信息
     * @param encoding 编码格式
     * @return
     * @throws Exception
     */
    public static String post(String url, String xml,Map<String,String> headerMap,String encoding) throws Exception {  
    	if(StringUtils.isBlank(url)){
    		url=URL;
    	}
    	long startTime = System.currentTimeMillis();
    	String startDate = DateUtils1.getDate("yyyy-MM-dd HH:mm:ss:SSS");
    	String  requestType = headerMap.get("GW_CH_TX");
    	if(null==headerMap||StringUtils.isBlank(headerMap.get("Content-Type"))){
    		//可以参考的值 map.put("Content-Type", "text/xml; charset=GBK");
    		throw new Exception("headerMap中缺少必要的属性Content-Type");
    	}
        HttpClient client = new DefaultHttpClient();  
//      client = WebClientDevWrapper.wrapClient(client);  
        HttpPost post = new HttpPost(url);  
        String contentType=headerMap.get("Content-Type");
        try {  
            StringEntity s = new StringEntity(xml,encoding);
            
           //s.setContentEncoding("GBK");  
           //s.setContentType("text/html;charset=GBK");  
            if(null==encoding || "".equals(encoding)) {
            	s.setContentEncoding("GBK");  
            }else {
            	  s.setContentEncoding(encoding);
            }
            
            if(null==contentType || "".equals(contentType)) {
            	s.setContentType("text/html;charset=GBK");   
            }else {
            	s.setContentType(contentType);
            }
            
           
            
            post.setEntity(s);  
            
            Set<String> keySet=headerMap.keySet();
            for (String string : keySet) {
            	post.setHeader(string,headerMap.get(string));
			}
            
            HttpResponse res = client.execute(post);  
            if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {  
                HttpEntity entity = res.getEntity();  
                String charset = EntityUtils.getContentCharSet(entity);  
                if(charset == null){  
                    charset = "UTF-8";  
                }  
                
        		StringBuilder sb = new StringBuilder();
                BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent(), charset));
                String line = null;
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
				System.out.println(true);
				long endTime = System.currentTimeMillis();
				
		    	String endDate = DateUtils1.getDate("yyyy-MM-dd HH:mm:ss:SSS");

				logger.info("请求核心接口"+requestType+"开始时间"+startDate+"结束时间"+endDate+":接口纯耗时时间:"+(endTime - startTime));
				
				return sb.toString();
            }  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
        return null;  
    }  
    
    /**
	 * 提交带文件的表单
	 * @param urlStr
	 * @param paramMap
	 * @return
     * @throws Exception 
	 */
	public static String post(String urlStr, Map<String, String> paramMap) throws Exception {
		String res = "";
		HttpURLConnection conn = null;
		try {
			URL url = new URL(urlStr);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(30000);
			conn.setDoOutput(true);	//是否输入参数
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.2.6)");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");

			OutputStream out = conn.getOutputStream();
			
			if (paramMap != null) {
				StringBuffer strBuf = new StringBuffer();
				Iterator<Map.Entry<String, String>> iter = paramMap.entrySet().iterator();
				while (iter.hasNext()) {
					Map.Entry<String, String> entry = iter.next();
					String inputName = (String) entry.getKey();
					String inputValue = URLEncoder.encode((String) entry.getValue(), "UTF-8");
					
					strBuf.append(inputName + "=" + inputValue + "&");
				}
				out.write(strBuf.toString().getBytes());
			}

			out.flush();
			out.close();

			// 读取返回数据  
			StringBuffer strBuf = new StringBuffer();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				strBuf.append(line);
			}
			res = strBuf.toString();
			reader.close();
			reader = null;
		} catch (Exception e) {
			System.out.println("发送POST请求出错。" + urlStr);
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
				conn = null;
			}
		}
		return res;
	}
  
//    public static class WebClientDevWrapper {  
//        public static HttpClient wrapClient(HttpClient base) {  
//            try {  
//                SSLContext ctx = SSLContext.getInstance("TLS");  
//                X509TrustManager tm = new X509TrustManager() {  
//                    @Override  
//                    public X509Certificate[] getAcceptedIssuers() {  
//                        return null;  
//                    }  
//  
//                    @Override  
//                    public void checkClientTrusted(  
//                            java.security.cert.X509Certificate[] chain,  
//                            String authType)  
//                            throws java.security.cert.CertificateException {  
//                          
//                    }  
//  
//                    @Override  
//                    public void checkServerTrusted(  
//                            java.security.cert.X509Certificate[] chain,  
//                            String authType)  
//                            throws java.security.cert.CertificateException {  
//                          
//                    }  
//                };  
//                ctx.init(null, new TrustManager[] { tm }, null);  
//                SSLSocketFactory ssf = new SSLSocketFactory(ctx, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);  
//                ClientConnectionManager ccm = base.getConnectionManager();  
//                SchemeRegistry sr = ccm.getSchemeRegistry();  
//                sr.register(new Scheme("https", 443, ssf));  
//                return new DefaultHttpClient(ccm, base.getParams());  
//            } catch (Exception ex) {  
//                ex.printStackTrace();  
//                return null;  
//            }  
//        }  
//    }  
    
//	/**
//	 * 微信消息推送
//	 * @param users 人员列表
//	 * @param agentId 企业ID编号
//	 * @param requestUrl 接口地址
//	 * @param content 消息内容
//	 * @return
//	 */
//	public static String WeChatMessage(String [] users,String agentId,String requestUrl,String content){
//	  TextMessage mes = new TextMessage();
//	  Map<String,String> text = new HashMap<String,String>();
//	  text.put("content", content);
//	  mes.setMsgtype("text");
//	  mes.setToparty("");
//	  mes.setTotag("");
//	  mes.setSafe("0");
//	  mes.setText(text);
//	  mes.setTouser( org.apache.commons.lang3.StringUtils.join(users, ","));
//	  mes.setAgentid(agentId);
//	  
//	  Map<String,String> mapParams = new HashMap<String,String>();
//	  mapParams.put("messageInfo", JSONUtil.object2json(mes).toString());
//	  
//	  return ClientUtil.postHttpClient(requestUrl, mapParams); 
//	}
//	
//	public static String postHttpClient(String url,Map<String, String> mapParams) {
//		String result = "";
//		List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
//		try {
//			HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
//			CloseableHttpClient client = httpClientBuilder.build();
//			RequestConfig rc = RequestConfig.custom().setConnectTimeout(1200).build();
//			HttpPost httpPost = new HttpPost(url);
//			httpPost.setConfig(rc);
//			for (Entry<String, String> entry : mapParams.entrySet()) {
//				params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
//			}
//			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params,
//					"UTF-8");
//			httpPost.setEntity(entity);
//			CloseableHttpResponse response = client.execute(httpPost);
//			
//			if (200 == response.getStatusLine().getStatusCode()) {
//				result = EntityUtils.toString(response.getEntity());
//				logger.info("HttpClientSent Response：{" + result + "}");
//			} else {
//				throw new Exception("接口调用失败！");
//			}
//			return result;
//		} catch (Exception e) {
//			logger.error(CrmCommonUtils.getTrace(e));
//		}finally{
//			params = null;
//		}
//		return result;
//	}
}
