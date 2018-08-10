package com.songzhi.carInsure.web.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public interface UserManagerService {
	//用户登录
		public String login(@WebParam(name="name")String name,@WebParam(name="password")String password);
}
