package com.songzhi.carInsure.core.constants;

import java.util.Map;
import java.util.HashMap;

public class SystemCodeConstants {
   static Map<String, String> codeMsgMap;
   
   static {
	   codeMsgMap=new HashMap<String, String>();
	   //操作成功
	   codeMsgMap.put("1000", "操作成功！");
	   
	   //操作失败
	   codeMsgMap.put("1001", "操作失败！");
	   
	   
   }
}
