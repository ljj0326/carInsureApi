package com.songzhi.carInsure.service.dto;

import java.util.Map;

 /**
  * 响应消息之文本消息
  * 
  * */
public class TextMessage extends BaseMessage{
	 /**
	  *  回复的消息内容  
	  */
   private Map<String,String> text;
   

	public Map<String, String> getText() {
		return text;
	}

	public void setText(Map<String, String> text) {
		this.text = text;
	}
}
