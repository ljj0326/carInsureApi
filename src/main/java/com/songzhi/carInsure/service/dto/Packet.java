package com.songzhi.carInsure.service.dto;


public class Packet extends BaseDomain{

	private static final long serialVersionUID = 5257823367989412148L;
	private Head head;
	private RequestInfo body;
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public RequestInfo getBody() {
		return body;
	}
	public void setBody(RequestInfo body) {
		this.body = body;
	}
}
