package com.songzhi.carInsure.web.vo.response;

import java.sql.Date;

//商业险险别
public class CbizBody {
	private String business_insure;
	private String business_slip;
	private Date business_time;
	private Date business_jie_time;
	private double business_money;

	public String getBusiness_insure() {
		return business_insure;
	}

	public void setBusiness_insure(String business_insure) {
		this.business_insure = business_insure;
	}

	public String getBusiness_slip() {
		return business_slip;
	}

	public void setBusiness_slip(String business_slip) {
		this.business_slip = business_slip;
	}

	public Date getBusiness_time() {
		return business_time;
	}

	public void setBusiness_time(Date business_time) {
		this.business_time = business_time;
	}

	public Date getBusiness_jie_time() {
		return business_jie_time;
	}

	public void setBusiness_jie_time(Date business_jie_time) {
		this.business_jie_time = business_jie_time;
	}

	public double getBusiness_money() {
		return business_money;
	}

	public void setBusiness_money(double business_money) {
		this.business_money = business_money;
	}

}
