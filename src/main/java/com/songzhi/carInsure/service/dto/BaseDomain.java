package com.songzhi.carInsure.service.dto;

import java.io.Serializable;
import java.util.Date;

public class BaseDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7894228821215274614L;
	
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private String deletedFlag;
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getDeletedFlag() {
		return deletedFlag;
	}
	public void setDeletedFlag(String deletedFlag) {
		this.deletedFlag = deletedFlag;
	}
	
	

}
