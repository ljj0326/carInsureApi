package com.songzhi.carInsure.core.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.util.URIUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.songzhi.carInsure.core.util.JSONUtil;
import com.songzhi.carInsure.service.dto.TextMessage;
import com.songzhi.carInsure.core.util.CrmCommonUtils;

public class HttpClientUtil {
	private static final String CONTENT_TYPE = "text/html;charset=UTF-8";
	public static final String ENCODING = "UTF-8";
	public static final String CHARSET_GBK = "GBK";
	public static final String CONTENT_TYPE_TEXT_HTML = "text/html";
	public static final String CONTENT_TYPE_APPLICATION_FORM = "application/x-www-form-urlencoded";
	private static final String HTTP_METHOD_GET = "GET";
	private static final String HTTP_METHOD_POST = "POST";

	private static Logger logger = Logger.getLogger(HttpClientUtil.class);

	/**
	 * http get
	 * 
	 * @param charSet
	 *            default utf-8
	 * @return
	 */
	private static String get(GetMethod get, String charSet) {
		HttpClient httpClient = new HttpClient();
		int status = 0;
		InputStream is = null;

		try {
			status = httpClient.executeMethod(get);
			is = get.getResponseBodyAsStream();
		} catch (IOException e) {
			logger.error(CrmCommonUtils.getTrace(e));
			logger.error(e, e);
		}
		logger.info("status :" + status);
		return getResponse(status, is, charSet);
	}

	private static String getResponse(int status, InputStream is, String charSet) {
		String encode = StringUtils.isNotEmpty(charSet) ? charSet
				: HttpClientUtil.ENCODING;
		StringBuilder sb = new StringBuilder();
		if (status == HttpStatus.SC_OK && is != null) {
			try {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(is, encode));
				String line = null;
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
			} catch (UnsupportedEncodingException e) {
				logger.error(CrmCommonUtils.getTrace(e));
				logger.error(e, e);
			} catch (IOException e) {
				logger.error(CrmCommonUtils.getTrace(e));
				logger.error(e, e);
			} finally {
				try {
					is.close();
				} catch (IOException e) {
					logger.error(CrmCommonUtils.getTrace(e));
				}
			}
		}
		return sb.toString();
	}

	public static String getRequest(String url, List<NameValuePair> list,
			String charSet, String contentType) {
		String encode = StringUtils.isNotEmpty(charSet) ? charSet
				: HttpClientUtil.ENCODING;
		String type = StringUtils.isNotEmpty(contentType) ? contentType
				: HttpClientUtil.CONTENT_TYPE_TEXT_HTML;

		String encodeUrl = url;
		try {
			encodeUrl = URIUtil.encodeQuery(url, encode);
		} catch (URIException e) {
			logger.error(CrmCommonUtils.getTrace(e));
		}
		GetMethod get = new GetMethod(encodeUrl);
		get.addRequestHeader("Content-Type", type + ";charset=" + encode);

		if (list != null && !list.isEmpty()) {
			NameValuePair[] arr = new NameValuePair[list.size()];
			get.setQueryString(list.toArray(arr));
		}
		logger.debug("url=" + url);
		return get(get, encode);
	}

	public static String getRequest(String url, List<NameValuePair> list) {
		return request(url, HTTP_METHOD_GET, list, "");
	}

	public static String getRequest(String url, String queryString) {
		return request(url, HTTP_METHOD_GET, null, queryString);
	}

	public static String postRequest(String url, List<NameValuePair> list) {
		return request(url, HTTP_METHOD_POST, list, "");
	}

	public static String postRequest(String url, String requestBody) {
		return request(url, HTTP_METHOD_POST, null, requestBody);
	}

	@SuppressWarnings("deprecation")
	private static String request(String url, String method,
			List<NameValuePair> list, String body) {
		StringBuilder sb = new StringBuilder();
		if (StringUtils.isEmpty(url)) {
			return "";
		}
		HttpClient httpClient = new HttpClient();
		int status = 0;
		InputStream is = null;
		if (method.equalsIgnoreCase("get")) {
			String encodeUrl = url;
			try {
				encodeUrl = URIUtil.encodeQuery(url, ENCODING);
			} catch (URIException e) {
				logger.error(CrmCommonUtils.getTrace(e));
			}
			GetMethod get = new GetMethod(encodeUrl);
			get.addRequestHeader("Content-Type", CONTENT_TYPE);

			if (list != null && !list.isEmpty()) {
				NameValuePair[] arr = new NameValuePair[list.size()];
				get.setQueryString(list.toArray(arr));
			} else if (StringUtils.isNotEmpty(body)) {
				get.setQueryString(body);
			}
			try {
				status = httpClient.executeMethod(get);
				is = get.getResponseBodyAsStream();
			} catch (IOException e) {
				logger.error(CrmCommonUtils.getTrace(e));
				logger.error(e, e);
			}
		} else if (method.equalsIgnoreCase("post")) {
			PostMethod post = new PostMethod(url);
			post.addRequestHeader("Content-Type", CONTENT_TYPE);
			if (list != null && !list.isEmpty()) {
				NameValuePair[] arr = new NameValuePair[list.size()];
				// post.setRequestBody(list.toArray(arr));
				post.addParameters(list.toArray(arr));
			} else if (StringUtils.isNotEmpty(body)) {
				post.setRequestBody(body);
			}
			try {
				status = httpClient.executeMethod(post);
				is = post.getResponseBodyAsStream();
			} catch (IOException e) {
				logger.error(CrmCommonUtils.getTrace(e));
				logger.error(e, e);
			}
		}

		if (status == HttpStatus.SC_OK && is != null) {
			try {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(is, ENCODING));
				String line = null;
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
			} catch (UnsupportedEncodingException e) {
				logger.error(CrmCommonUtils.getTrace(e));
				logger.error(e, e);
			} catch (IOException e) {
				logger.error(CrmCommonUtils.getTrace(e));
				logger.error(e, e);
			} finally {
				try {
					is.close();
				} catch (IOException e) {
					logger.error(CrmCommonUtils.getTrace(e));
				}
			}
		}
		return sb.toString();
	}

	public static String getRequest(String url, String queryString,
			String charSet, String contentType) {
		String encode = StringUtils.isNotEmpty(charSet) ? charSet
				: HttpClientUtil.ENCODING;
		String type = StringUtils.isNotEmpty(contentType) ? contentType
				: HttpClientUtil.CONTENT_TYPE_TEXT_HTML;

		String encodeUrl = url;
		try {
			encodeUrl = URIUtil.encodeQuery(url, encode);
		} catch (URIException e) {
			logger.error(CrmCommonUtils.getTrace(e));
		}
		GetMethod get = new GetMethod(encodeUrl);
		get.addRequestHeader("Content-Type", type + ";charset=" + encode);

		if (StringUtils.isNotEmpty(queryString)) {
			get.setQueryString(queryString);
		}
		return get(get, encode);
	}
	
	public static String postHttpClient(String url,Map<String, String> mapParams) {
		String result = "";
		List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
		try {
			HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
			CloseableHttpClient client = httpClientBuilder.build();
			RequestConfig rc = RequestConfig.custom().setConnectTimeout(1200).build();
			HttpPost httpPost = new HttpPost(url);
			httpPost.setConfig(rc);
			for (Entry<String, String> entry : mapParams.entrySet()) {
				params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
			}
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params,
					"UTF-8");
			httpPost.setEntity(entity);
			CloseableHttpResponse response = client.execute(httpPost);
			
			if (200 == response.getStatusLine().getStatusCode()) {
				result = EntityUtils.toString(response.getEntity());
				logger.info("HttpClientSent Response：{" + result + "}");
			} else {
				throw new Exception("接口调用失败！");
			}
			return result;
		} catch (Exception e) {
			logger.error(CrmCommonUtils.getTrace(e));
		}finally{
			params = null;
		}
		return result;
	}
	
	/**
	 * 提交带文件的表单
	 * @param urlStr
	 * @param paramMap
	 * @return
	 */
	public static String post(String urlStr, Map<String, String> paramMap) {
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
				strBuf.append(line).append("\n");
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
	
	
	/**
	 * 微信消息推送
	 * @param users 人员列表
	 * @param agentId 企业ID编号
	 * @param requestUrl 接口地址
	 * @param content 消息内容
	 * @return
	 */
	public static String WeChatMessage(String [] users,String agentId,String requestUrl,String content){
	  TextMessage mes = new TextMessage();
	  Map<String,String> text = new HashMap<String,String>();
	  text.put("content", content);
	  mes.setMsgtype("text");
	  mes.setToparty("");
	  mes.setTotag("");
	  mes.setSafe("0");
	  mes.setText(text);
	  mes.setTouser( org.apache.commons.lang3.StringUtils.join(users, ","));
	  mes.setAgentid(agentId);
	  
	  Map<String,String> mapParams = new HashMap<String,String>();
	  mapParams.put("messageInfo", JSONUtil.object2json(mes).toString());
	  
	  return  HttpClientUtil.postHttpClient(requestUrl, mapParams); 
	}

	public static void main(String[] args) throws IOException {			  
		  String requestUrl = "http://10.196.112.4:7001/QYWXManage/sendMsgToUser";  
		  String [] users=new String[]{"zybcs010"};
		  String agentId="67";
		  String content="中文乱码测试";
		  String out=HttpClientUtil.WeChatMessage(users, agentId, requestUrl, content);
		System.out.println(out);
	}

}
