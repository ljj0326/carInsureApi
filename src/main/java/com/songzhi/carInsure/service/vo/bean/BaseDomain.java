package com.songzhi.carInsure.service.vo.bean;

import java.io.Serializable;
import java.lang.reflect.Field;
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
	/**
	 * toString组装
	 * 
	 * @param obj
	 * @param clazz
	 * @param sb
	 */
	private void toStringUtil(Object obj, Class<?> clazz, StringBuffer sb) {

		if (null != clazz&&!"BaseDomain".equals(clazz.getSimpleName())) {
			toStringUtil(obj, clazz.getSuperclass(), sb);
			Field[] fields = clazz.getDeclaredFields();
			sb.append(clazz.getName() + "{\n");
			for (Field field : fields) {
				field.setAccessible(true);
				try {
					if (null != field.get(obj)
							&& !"serialVersionUID".equals(field.getName())) {
						sb.append(field.getName() + "=" + field.get(obj) + "\t");
					}
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			sb.append("\n}");
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		toStringUtil(this, this.getClass(), sb);
		return sb.toString();
	}
	

}
