package com.songzhi.carInsure.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.songzhi.carInsure.core.util.MD5;
import com.songzhi.carInsure.web.constants.SessionConstants;
import com.songzhi.carInsure.web.po.TUser;
import com.songzhi.carInsure.web.service.UserService;
import com.songzhi.carInsure.web.vo.request.Body;
import com.songzhi.carInsure.web.vo.request.Head;
import com.songzhi.carInsure.web.vo.request.RequestVo;
import com.songzhi.carInsure.web.vo.response.ResponseVO;

@Controller
@RequestMapping
public class UserController {

	private static Logger logger = Logger.getLogger(UserController.class); 	
	
    @Resource	
	private UserService userService;
   
    
    //用户登录接口
    @RequestMapping(value="/api/userManager/cpLogin.do",method=RequestMethod.POST,produces = "application/json;charset=UTF-8")
	@ResponseBody
    public ResponseVO userLogin(@RequestBody RequestVo requestVo,HttpServletRequest request,
			HttpServletResponse response,HttpSession session){
    	ResponseVO resVO=new ResponseVO();
    	try {
		   Head head=requestVo.getHead();
		   Body body=requestVo.getBody();
		   
		   String username=body.getUsername();
		   if("".equals(username)||null==username) {
			   //登录账号或密码不能为空
			   resVO.setResponseCode(1001);
			   resVO.setResponseMsg("登录账号不能为空");
			   return resVO;
		   }
		   
		   String password=body.getPassword();
		   if("".equals(password)||null==password) {
			   //密码不能为空
			   resVO.setResponseCode(1002);
			   resVO.setResponseMsg("密码不能为空");
			   
			   return resVO;
		   }
		 
		   //密码加密
		   password=MD5.md5(password);
		   
		   //手机号码不能重复
		   Map errMap=userService.login(username, password);
		   
		   //登录成功
		   if("000".equals(errMap.get("errcode"))) {
			   
			   session.setAttribute(SessionConstants.userInfo, errMap.get("userInfo"));
			   Map<String,Object> userMap=new HashMap<String,Object>();
			   userMap.put("user_id", ((TUser)errMap.get("userInfo")).getId());
			   userMap.put("user_name", ((TUser)errMap.get("userInfo")).getUsername());
			   userMap.put("token", session.getId());
			   resVO.setResponseCode(1000);
			   resVO.setResponseMsg("登录成功");
			   resVO.setResponseObj(userMap);
			   
			   return resVO;  
		   }else {
			   //账号或密码错误!
			   resVO.setResponseCode(1003);
			   resVO.setResponseMsg((String)errMap.get("errMsg"));
			   
			   return resVO;			   
		   }
    	
    	}catch (Exception e) {
			// TODO: handle exception
    		logger.debug(e);
    		resVO.setResponseCode(1012);
			resVO.setResponseMsg("系统异常,登录失败");
			   
			return resVO; 
		}
    	
	}
    
    	
    //用户注册
    @RequestMapping(value="/api/userManager/cpRegister.do",method=RequestMethod.POST,produces = "application/json;charset=UTF-8")
	@ResponseBody
    public ResponseVO userRegistered(@RequestBody RequestVo requestVo,HttpServletRequest request,
			HttpServletResponse response,HttpSession session){
    	
    	ResponseVO resVO=new ResponseVO();
    	
    	try {
    	   Head head=requestVo.getHead();
 		   Body body=requestVo.getBody();
	    	
		   
		   String username=body.getUsername();
		   if("".equals(username)||null==username) {
			   //姓名不能为空
			   resVO.setResponseCode(1001);
			   resVO.setResponseMsg("姓名不能为空");
			   
			   return resVO;
		   }
		   
		   String password=body.getPassword();
		   if("".equals(password)||null==password) {
			   //密码不能为空
			   resVO.setResponseCode(1002);
			   resVO.setResponseMsg("密码不能为空");
			   
			   return resVO;
		   }
		 
		   
		   String repassword=body.getRepassword();
		   if("".equals(repassword)||null==repassword) {
			   //确认密码不能为空
			   resVO.setResponseCode(1003);
			   resVO.setResponseMsg("确认密码不能为空");
			   
			   return resVO;
		   }
		   
		   if(!password.equals(repassword)) {
			   //2次输入的密码不相同
			   resVO.setResponseCode(1004);
			   resVO.setResponseMsg("2次输入的密码不相同");
			   
			   return resVO;
		   }		   
		   
		   String sex=body.getSex();
		   if("".equals(sex)||null==sex) {
			   //性别不能为空
			   resVO.setResponseCode(1005);
			   resVO.setResponseMsg("性别不能为空");
			   
			   return resVO;   
		   }
		   
		   String phone=body.getPhone();
		   if("".equals(phone)||null==phone) {
			   //手机号码不能为空
			   resVO.setResponseCode(1006);
			   resVO.setResponseMsg("手机号码不能为空");
			   
			   return resVO;   
		   }
		   
		   String idNumber=body.getIdNumber();
		   if("".equals(idNumber)||null==idNumber) {
			   //身份证号码不能为空
			   resVO.setResponseCode(1007);
			   resVO.setResponseMsg("身份证号码不能为空");
			   
			   return resVO;   
		   }
		   
		   String email=body.getEmail();
		   if("".equals(email)||null==email) {
			   //电子邮箱不能为空
			   resVO.setResponseCode(1008);
			   resVO.setResponseMsg("电子邮箱不能为空");
			   
			   return resVO;    
		   }
		   
		   TUser record =new TUser();
		   
		   record.setUsername(username);
		   //密码加密
		   password=MD5.md5(password);
		   record.setPassword(password);
		   record.setSex(new Integer(sex));
		   record.setPhone(phone);
		   record.setIdnumber(idNumber);
		   record.setEmail(email);
		   
		   //手机号码不能重复
		   boolean flag1=userService.checkPhoneUnique(record);
		   if(flag1==true) {
			   resVO.setResponseCode(1009);
			   resVO.setResponseMsg("手机号码已注册,注册失败！");
			   
			   return resVO;  
		   }
				   
		   //邮箱不能重复
		   boolean flag2=userService.checkEmailUnique(record);
		   if(flag2==true) {
			   resVO.setResponseCode(1010);
			   resVO.setResponseMsg("邮箱已注册,注册失败！");
			   
			   return resVO;  
		   }		   
		   
		   //保存数据
		   int result = userService.insert(record);
		   
		   if(result>0) {
			   resVO.setResponseCode(1000);
			   resVO.setResponseMsg("注册成功！");
			   
			   return resVO;   
		   }else {
			   resVO.setResponseCode(1011);
			   resVO.setResponseMsg("保存失败,注册失败");
			   
			   return resVO; 
		   }
    	
    	}catch (Exception e) {
			// TODO: handle exception
    		logger.debug(e);
    		resVO.setResponseCode(1012);
			resVO.setResponseMsg("系统异常,注册失败");
			   
			return resVO; 
		}
    	
	}
    
    //用户注销
    @RequestMapping(value="/api/userManager/cpLogout.do",method=RequestMethod.POST,produces = "application/json;charset=UTF-8")
	@ResponseBody
    public ResponseVO userLogout(@RequestBody RequestVo requestVo,HttpServletRequest request,
			HttpServletResponse response,HttpSession session){
    	
    	ResponseVO resVO=new ResponseVO();
    	
    	try {
    	   Head head=requestVo.getHead();
 		   Body body=requestVo.getBody();
	      
 		   String token = head.getToken();
 		   if("".equals(token)||null==token) {
 			   //会话不存在
			   resVO.setResponseCode(1001);
			   resVO.setResponseMsg("会话不存在");
			   
			   return resVO;
 		   }
 		   
 		   if(!token.equals(session.getId())) {
 			   //会话无效
			   resVO.setResponseCode(1001);
			   resVO.setResponseMsg("会话无效");
			   
			   return resVO;
 			   
 		   }else {
 			  session.removeAttribute(SessionConstants.userInfo); 
 			  //失效session 
 			  session.invalidate();
 			  resVO.setResponseCode(1000);
 			  resVO.setResponseMsg("注销成功");
 			  return resVO;
 			  
 		   }		  
    	
    	}catch (Exception e) {
			// TODO: handle exception
    		logger.debug(e);
    		resVO.setResponseCode(1012);
			resVO.setResponseMsg("系统异常,注册失败");
			
			return resVO; 
		}
    	
	}
    
}
