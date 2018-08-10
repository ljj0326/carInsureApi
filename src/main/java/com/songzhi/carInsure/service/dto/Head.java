package com.songzhi.carInsure.service.dto;

public class Head  extends BaseDomain{

	private static final long serialVersionUID = -5123180107379301914L;
	private Long requestId;	
	private String departmentCode;	
	
	private String requestFilePath;	
	private String responseFilePath;	
	private String responseCode;	
	private String errorCode;	
	private String errorMessage;	
	private String splitFlag;

	//
	private String transType = "";
	private String user ="";
	private String password = "";	
	private String serialDecimal = "";
	
	//暂存ID
	private String temporaryId;
	
	
	public String getTemporaryId() {
		return temporaryId;
	}
	public void setTemporaryId(String temporaryId) {
		this.temporaryId = temporaryId;
	}
	public String getSerialDecimal() {
		return serialDecimal;
	}
	public void setSerialDecimal(String serialDecimal) {
		this.serialDecimal = serialDecimal;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRequestFilePath() {
		return requestFilePath;
	}
	public void setRequestFilePath(String requestFilePath) {
		this.requestFilePath = requestFilePath;
	}
	public String getResponseFilePath() {
		return responseFilePath;
	}
	public void setResponseFilePath(String responseFilePath) {
		this.responseFilePath = responseFilePath;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getSplitFlag() {
		return splitFlag;
	}
	public void setSplitFlag(String splitFlag) {
		this.splitFlag = splitFlag;
	}


}
