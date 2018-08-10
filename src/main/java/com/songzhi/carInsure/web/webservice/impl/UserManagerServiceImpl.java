package com.songzhi.carInsure.web.webservice.impl;

import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import com.songzhi.carInsure.core.util.MD5;
import com.songzhi.carInsure.web.service.UserService;
import com.songzhi.carInsure.web.webservice.UserManagerService;


@WebService(endpointInterface = "com.songzhi.carInsure.web.webservice.UserManagerService", serviceName = "UserManagerService")  
public class UserManagerServiceImpl implements UserManagerService{
	
	private static Logger logger = Logger.getLogger(UserManagerServiceImpl.class); 	
	
	@Resource
	private UserService userService;
	
	//用户登录
	/**
	 * result
	 *         000   登录成功
	 *         001    用户名为空
	 *         002    密码为空
	 *         003    用户名或密码错误
	 *         
	 *         005    服务器异常
	 * 
	 * */
	public String login(String name,String password) {
		String result=null;
		
		try {		
			//用户名为空
			if(null==name || "".equals(name)) {
				result="001";
			}
			
			//密码为空
			if(null==password || "".equals(password)) {
				result="002";
			}
			
			logger.debug("name："+name);
			logger.debug("password："+password);
			
			String jiamipass=MD5.md5(password);
			
			Map<String,Object> errMsg=userService.login(name,jiamipass);
			
			if("000".equals(errMsg.get("errcode"))) {
				result="000";
			}else {
				result="003";
			}
			
			return result;
		}catch (Exception e) {
			// TODO: handle exception			
			result="005";
			logger.debug("服务器异常，登录失败！");
			logger.debug(e);
		}
		
		return result;
	}
}