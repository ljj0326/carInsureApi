package com.songzhi.carInsure.web.vo.response;


import java.sql.Date;

//交强险险别
public class CtpfBody {
	private String strong_bao;
	private String strong_dan;
	private Date strong_time;
	private Date money_jiaoqiang_time;
	private double money_jiaoqiang;
	private double boats_tallage;

	public String getStrong_bao() {
		return strong_bao;
	}

	public void setStrong_bao(String strong_bao) {
		this.strong_bao = strong_bao;
	}

	public String getStrong_dan() {
		return strong_dan;
	}

	public void setStrong_dan(String strong_dan) {
		this.strong_dan = strong_dan;
	}

	public Date getStrong_time() {
		return strong_time;
	}

	public void setStrong_time(Date strong_time) {
		this.strong_time = strong_time;
	}

	public Date getMoney_jiaoqiang_time() {
		return money_jiaoqiang_time;
	}

	public void setMoney_jiaoqiang_time(Date money_jiaoqiang_time) {
		this.money_jiaoqiang_time = money_jiaoqiang_time;
	}

	public double getMoney_jiaoqiang() {
		return money_jiaoqiang;
	}

	public void setMoney_jiaoqiang(double money_jiaoqiang) {
		this.money_jiaoqiang = money_jiaoqiang;
	}

	public double getBoats_tallage() {
		return boats_tallage;
	}

	public void setBoats_tallage(double boats_tallage) {
		this.boats_tallage = boats_tallage;
	}
}
