package com.songzhi.carInsure.service.dto;

public class BaseMessage {
private static final long serialVersionUID = 1L;
	
	/**
	 * 接收方帐号（收到的OpenID）
	 */
	private String touser;
	/**
	 * 部门ID列表
	 */
	private String toparty;
	/**
	 * 标签ID列表
	 */
	private String totag;
	/**
	 * 消息类型（text/music/news）
	 */
	private String msgtype;
	/**
	 * 企业应用的id
	 */
	private String agentid;
	/**
	 * 表示是否是保密消息，0表示否，1表示是，默认0
	 */
	private String safe ;
	
	public String getSafe() {
		return safe;
	}

	public void setSafe(String safe) {
		this.safe = safe;
	}

	public BaseMessage(){
		
	}

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public String getToparty() {
		return toparty;
	}

	public void setToparty(String toparty) {
		this.toparty = toparty;
	}

	public String getTotag() {
		return totag;
	}

	public void setTotag(String totag) {
		this.totag = totag;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getAgentid() {
		return agentid;
	}

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

}
