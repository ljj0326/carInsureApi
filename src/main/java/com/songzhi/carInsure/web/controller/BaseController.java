package com.songzhi.carInsure.web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;


public class BaseController {
private static Logger logger = Logger.getLogger(BaseController.class);
	
	public static String readRequestStream(HttpServletRequest request){
		StringBuilder builder = new StringBuilder();
		String str = "";
		try {
			InputStream input = request.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(input,"UTF-8"));
			while((str = br.readLine()) != null){
				builder.append(str);
			}
			byte[] builderByte = builder.toString().getBytes();
			if(builderByte.length < 10*1024){
				logger.debug(builder.toString());
			}
		} catch (IOException e) {
			logger.error("调用BaseController从request中获取Json参数异常！");
			logger.error(e);
		} catch (NullPointerException e) {
			logger.error("调用BaseController从request中获取Json参数为空！");
			logger.error(e);
		}
		return builder.toString();
	}
	
	
	/**
	   * ajax反馈
	   * 
	   * @param response
	   * @param responseString response反馈信息
	   */
	  public static void writerResponse(HttpServletResponse response, String responseString) {
		  PrintWriter writer = null;
	        response.setCharacterEncoding("UTF-8");
	        response.setContentType("text/html; charset=utf-8");
	        try {
	            writer = response.getWriter();
	            writer.print(responseString);

	        } catch (IOException e) {
	            logger.error("response error",e);
	        } finally {
	            if (writer != null)
	                writer.close();
	        }
	  }
}
