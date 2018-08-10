package com.songzhi.carInsure.service.vo.response;

import javax.xml.bind.annotation.XmlElement;

/**
 * 返回报文head元素
 * 
 */

public class ResponseHead {
	private String transType;
	
	private String responseCode;
	
	private String responseMessage;
	
	private String serialNo;
	
	private String cJySerialBum;
	
	
	@XmlElement(name = "TRANS_TYPE")
	public String getTransType() {
		return transType;
	}
	
	public void setTransType(String transType) {
		this.transType = transType;
	}
	
	@XmlElement(name = "RESPONSE_CODE")
	public String getResponseCode() {
		return responseCode;
	}
	
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
	@XmlElement(name = "RESPONSE_MESSAGE")
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	@XmlElement(name = "SERIALNO")
	public String getSerialNo() {
		return serialNo;
	}
	
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	
	@XmlElement(name = "C_JY_SERIAL_BUM")
	public String getcJySerialBum() {
		return cJySerialBum;
	}
	
	public void setcJySerialBum(String cJySerialBum) {
		this.cJySerialBum = cJySerialBum;
	}
	
}
