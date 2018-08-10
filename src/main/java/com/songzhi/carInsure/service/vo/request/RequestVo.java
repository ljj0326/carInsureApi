package com.songzhi.carInsure.service.vo.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 请求接口报文
 * 
 * 
 */
@XmlRootElement(name = "PACKET")
@XmlType(propOrder = { "requestHead", "requestBody"})
public class RequestVo {

	private RequestHead requestHead;

	private RequestBody requestBody;

	@XmlElement(name = "HEAD")
	public RequestHead getRequestHead() {
		return requestHead;
	}

	public void setRequestHead(RequestHead requestHead) {
		this.requestHead = requestHead;
	}

	@XmlElement(name = "BODY")
	public RequestBody getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(RequestBody requestBody) {
		this.requestBody = requestBody;
	}

}
