package com.songzhi.carInsure.web.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.songzhi.carInsure.web.po.TUser;

public interface UserService {
	
	TUser selectById(Integer id) throws Exception;
    
	List<TUser> selectList(TUser record) throws Exception;
	
	List<TUser> selectAllList() throws Exception;
	    
    int insert(TUser record) throws Exception;
    
    int update(TUser record) throws Exception;
    
    int deleteById(Integer id) throws Exception;
    
    Map<String,Object> login(String email,String password) throws Exception;
    
    boolean checkPhoneUnique(TUser record) throws Exception;
    
    boolean checkEmailUnique(TUser record) throws Exception;
}
