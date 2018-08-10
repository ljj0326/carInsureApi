package com.songzhi.carInsure.web.service;

import com.songzhi.carInsure.web.po.TCar;
import com.songzhi.carInsure.web.po.TCarExample;
import com.songzhi.carInsure.web.po.TOrder;
import com.songzhi.carInsure.web.po.TOrderExample;

public interface ToderService {
	
	 int insert(TOrder record) throws Exception;
	 
	 int insert(TCar record) throws Exception;
	 
	 int checkIncludeIDIsValid(String includeid)throws Exception;
	 
	 TOrder getOrderByIncludeID(String includeid) throws Exception;
	 
	 int selectCountByVin(String vin)throws Exception;
	 
	 int updateOrder(TOrder record,TOrderExample example)throws Exception;
	 
	 int updateOrder(TOrder record)throws Exception;
	 
	 int updateCar(TCar record,TCarExample example)throws Exception;
}
