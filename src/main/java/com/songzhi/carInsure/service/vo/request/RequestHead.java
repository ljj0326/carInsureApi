package com.songzhi.carInsure.service.vo.request;

import javax.xml.bind.annotation.XmlElement;

/**
 * 请求报文head
 * 
 *  
 */
public class RequestHead {
	
	//*****************车险接口请求报文头start****************************
	/**交易类型*/
	private String transType ;
	/**用户名*/
	private String user;
	/**密码*/
	private String password;
	/**交易流水号*/
	private String serialno;
	
	private String serialDecimal;
	//*****************车险接口请求报文头end******************************
	
	//*****************人险系统接口请求报文头start*************************
	/**交易码*/
    private String transRno ;
    /**用户名*/
	private String userName;
	/**密码*/
	private String userPsw;
	//*****************人险系统接口请求报文头end***************************
	
	//*****************理赔案件状态查询接口请求报文头***************************
	/**请求类型*/
	private String requestCode;
	/**用户名*/
	private String user_name;
	
	private String requestTime; 
	
	private String user_psw;
	
	

	@XmlElement(name = "USER_PSW")
	public String getUser_psw() {
		return user_psw;
	}

	public void setUser_psw(String user_psw) {
		this.user_psw = user_psw;
	}

	@XmlElement(name = "USER_NAME")
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@XmlElement(name = "REQUEST_TIME")
	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	@XmlElement(name = "REQUEST_CODE")
	public String getRequestCode() {
		return requestCode;
	}

	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}

	@XmlElement(name = "TRANS_TYPE")
	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}
	
	@XmlElement(name = "USER")
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@XmlElement(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@XmlElement(name = "SERIALNO")
	public String getSerialno() {
		return serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}
	
	@XmlElement(name = "TRANSRNO")
	public String getTransRno() {
		return transRno;
	}

	public void setTransRno(String transRno) {
		this.transRno = transRno;
	}

	@XmlElement(name = "USERNAME")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@XmlElement(name = "USERPSW")
	public String getUserPsw() {
		return userPsw;
	}

	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}

	@XmlElement(name = "SERIALDECIMAL")
	public String getSerialDecimal() {
		return serialDecimal;
	}

	public void setSerialDecimal(String serialDecimal) {
		this.serialDecimal = serialDecimal;
	}

}
