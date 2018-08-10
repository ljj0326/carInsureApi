package com.songzhi.carInsure.core.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtils {
	public static String objToJson(Object object) {
		String content = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			 content = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}
	
	public static Object jsonToObj(String content, Class clazz) {
		ObjectMapper mapper = new ObjectMapper();
		Object object = null;
		try {
			object = mapper.readValue(content, clazz);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return object;
	}

	public static String toJsString(String string){
		if(string.indexOf("'")!=-1){
		    
		    string = string.replaceAll("'", "\\\\\'");
		}  
		if(string.indexOf("\"")!=-1){  

		    string = string.replaceAll("\"", "\\\\\"");  
		}  
		if(string.indexOf("\r\n")!=-1){  
		    
		    string = string.replaceAll("\r\n", "\\\\u000d\\\\u000a");  
		}  
		if(string.indexOf("\n")!=-1){  		   

		    string = string.replaceAll("\n", "\\\\u000a");  
		}  
		return string;
	}
}
