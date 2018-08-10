package com.songzhi.carInsure.web.vo.request;

//险别明细
public class CbizListBody {
	private int n_seq_no;
	private String risk_code036006;
	private String risk_name;
	private Double insurance_amount;
	private Double insurance_money;
	private String glass_code;
	private String glass_category;
	private int seat_num;
	private int compensate_day;
	private double compensate_moeny;
	private int chinese_other;
	private double repair_num;

	public int getN_seq_no() {
		return n_seq_no;
	}

	public void setN_seq_no(int n_seq_no) {
		this.n_seq_no = n_seq_no;
	}

	public String getRisk_code036006() {
		return risk_code036006;
	}

	public void setRisk_code036006(String risk_code036006) {
		this.risk_code036006 = risk_code036006;
	}

	public String getRisk_name() {
		return risk_name;
	}

	public void setRisk_name(String risk_name) {
		this.risk_name = risk_name;
	}

	public Double getInsurance_amount() {
		return insurance_amount;
	}

	public void setInsurance_amount(Double insurance_amount) {
		this.insurance_amount = insurance_amount;
	}

	public Double getInsurance_money() {
		return insurance_money;
	}

	public void setInsurance_money(Double insurance_money) {
		this.insurance_money = insurance_money;
	}

	public String getGlass_code() {
		return glass_code;
	}

	public void setGlass_code(String glass_code) {
		this.glass_code = glass_code;
	}

	public String getGlass_category() {
		return glass_category;
	}

	public void setGlass_category(String glass_category) {
		this.glass_category = glass_category;
	}

	public int getSeat_num() {
		return seat_num;
	}

	public void setSeat_num(int seat_num) {
		this.seat_num = seat_num;
	}

	public int getCompensate_day() {
		return compensate_day;
	}

	public void setCompensate_day(int compensate_day) {
		this.compensate_day = compensate_day;
	}

	public double getCompensate_moeny() {
		return compensate_moeny;
	}

	public void setCompensate_moeny(double compensate_moeny) {
		this.compensate_moeny = compensate_moeny;
	}

	public int getChinese_other() {
		return chinese_other;
	}

	public void setChinese_other(int chinese_other) {
		this.chinese_other = chinese_other;
	}

	public double getRepair_num() {
		return repair_num;
	}

	public void setRepair_num(double repair_num) {
		this.repair_num = repair_num;
	}

}
