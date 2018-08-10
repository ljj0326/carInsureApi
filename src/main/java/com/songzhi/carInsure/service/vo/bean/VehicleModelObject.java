package com.songzhi.carInsure.service.vo.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

/**
 * 车辆实体类
 */
public class VehicleModelObject {
	// 行业车型编码
	private String c_hy_model_cde;

	// 车款名称
	private String c_hy_model_nme;

	// 车型代码
	private String c_model_cde;

	// 车型名称
	private String c_model_nme;

	// 车系名称
	private String c_vehicle_family;

	// 公告型号
	private String c_vehicle_model;

	// 车型描述
	private String c_model_desc;

	// 品牌名称
	private String c_brand_name;

	// 年款
	private String c_market_timestamp;

	// 车型种类(国产/进口/合资)
	private String c_import_flag;

	// 核定载客数
	private String n_limit_load_person;

	// 整备质量(单位千克)
	private String n_po_weight;

	// 核定载质量(单位千克)
	private String n_tonage;

	// 排量(单位毫升)
	private String n_displacement;

	// 是否有abs(0：无abs;1：有abs)
	private String c_abs_flag;

	// 是否有防盗装备(0：无防盗装备;1：有防盗装备)
	private String c_alarm_flag;

	// 安全气囊数
	private String n_airbag_num;

	// 平台新车购置价
	private String n_plam_purchase_price;

	// 新车购置价
	private String n_purchase_price;

	// 新车含税购置价
	private String n_purchase_price_tax;

	// 类比价
	private String n_kindred_price;

	// 含税类比价
	private String n_kindred_price_tax;

	// 指定购置价
	private String n_assign_price;

	// 上市年月
	private String t_market_date;

	// 新车购置价浮动上限
	private String n_float_price_max;

	// 新车购置价浮动上限下发修改标志(0:否,1:是)
	private String c_snmodify_prices;

	// 新车购置价浮动下限
	private String n_float_price_min;

	// 新车购置价浮动下限下发修改标志(0:否,1:是)
	private String c_xnmodify_prices;

	// 备注
	private String c_remark;

	// 驱动形式
	private String c_gearbox_type;

	// 进出口标志
	private String c_import_type;

	// 厂家名称
	private String c_factory_name;

	// 商业险编码
	private String c_insurance_sy_code;

	// 商业险名称
	private String c_insurance_sy_name;

	// 交强险编码
	private String c_insurance_jq_code;

	// 交强险名称
	private String c_insurance_jq_name;

	// 速查码
	private String c_search_code;

	// 厂家编码
	private String c_factory_code;

	// 车系编码
	private String c_family_code;

	// 品牌编码
	private String c_brand_code;

	// 车辆种类
	private String c_vehicle_alias;

	//
	private String c_vehicle_class;

	// 状态
	private String c_status;

	// 动力类型
	private String c_power_type;

	// 创建时间
	private Date t_created_date;

	// 修改时间
	private Date t_updated_date;

	// 能源类型编码
	private String c_hfcode;

	// 能源类型名称
	private String c_hfname;

	private String c_vehicle_brand;

	private String n_vehicle_tonnage;

	private String c_fuel_type;

	private String c_transmis_type;

	private String c_vehicle_desc;

	private String n_vehicle_price;

	private String n_new_purchase_value;

	private String c_ref_code1;

	private String c_ref_code2;

	private String c_market_date;

	private String c_is_priced;

	private String c_risk_flag;

	private String c_mode_lid_code;

	private String c_trade_name;

	private String c_trade_code;

	private String c_brand;

	private String c_series;

	private String c_series_code;

	private String c_car_name;

	private String c_notice_typ;

	private String c_config_type;

	private String c_category_name;

	private String c_category_code;

	private String c_dept_name;

	private String c_dept_code;

	private String n_pure_risk_premium;

	private String c_pure_risk_premium_flag;

	private String c_datasource;

	private String c_modelflag;

	private String c_plate_no;

	private String c_plate_typ;

	private String c_new_mrk;

	private String c_new_vhl_flag;

	private String c_ecdemic_mrk;

	private String t_fst_reg_ym;

	private String c_eng_no;

	private String c_frm_no;

	private String c_vin;

	private String c_plate_color;

	private String c_tfi_special_mrk;

	private String c_use_year;

	private String n_year_run_miles;

	private String c_travel_area_cde;

	private String c_nat_of_busines;

	private String c_usage_cde;

	private String c_vhl_typ;

	private String c_mfg_year;

	private String n_displacement_lvl;

	private String c_new_purchase_value;

	private String c_new_purchase_value_def;

	private String c_prod_place;

	private String c_body_color;

	private String c_mon_desp_rate;

	private String c_reg_dri_typ;

	private String c_reg_vhl_typ;

	private String c_loan_vehicle_flag;

	private String n_car_age;

	private String c_glass_typ;

	private String t_transfer_date;

	private String c_change;

	private String n_of_prov_num;

	private String c_pri_amt;

	private String c_pri_expr;

	private String n_prefl_day;

	private String c_high_risk_car;

	private String n_haulage;

	private String c_industry_class;

	private String c_transfer_mrk;

	private String c_resv_txt_6;

	private String c_fleet_mrk;

	private String c_vhl_pkg_no;

	private String c_model_code;

	private String n_discus_useval;

	private String c_model_id_code;

	private String c_last_model_code;

	private String c_last_model;

	private String n_last_replacement_value;

	private String bjNewCarRecord;// 北京新车备案标志
	// 请求
	private String n_actual_value;
	private String c_card_detail;

	private String c_pay_loan;

	// 2017年8月8日11:23:22 B102返回
	private String c_reg_owner;// 行驶证车主

	private String n_seat_num;// 核定载客人数

	private String n_drag_weight;// 准牵引总质量

	private String t_rerv_txt1;// 审验有效期止(取的是检验有效日期止)

	private String c_alias_id;// 中文品牌

	private String c_brand_id;// 车辆品牌2

	public String getC_new_purchase_value_def() {
		return c_new_purchase_value_def;
	}

	public void setC_new_purchase_value_def(String c_new_purchase_value_def) {
		this.c_new_purchase_value_def = c_new_purchase_value_def;
	}

	public String getBjNewCarRecord() {
		return bjNewCarRecord;
	}

	public void setBjNewCarRecord(String bjNewCarRecord) {
		this.bjNewCarRecord = bjNewCarRecord;
	}

	public String getC_pay_loan() {
		return c_pay_loan;
	}

	public void setC_pay_loan(String c_pay_loan) {
		this.c_pay_loan = c_pay_loan;
	}

	public String getN_actual_value() {
		return n_actual_value;
	}

	public void setN_actual_value(String n_actual_value) {
		this.n_actual_value = n_actual_value;
	}

	public String getC_card_detail() {
		return c_card_detail;
	}

	public void setC_card_detail(String c_card_detail) {
		this.c_card_detail = c_card_detail;
	}

	@XmlElement(name = "N_LAST_REPLACEMENT_VALUE")
	public String getN_last_replacement_value() {
		return n_last_replacement_value;
	}

	public void setN_last_replacement_value(String n_last_replacement_value) {
		this.n_last_replacement_value = n_last_replacement_value;
	}

	@XmlElement(name = "C_LAST_MODEL")
	public String getC_last_model() {
		return c_last_model;
	}

	public void setC_last_model(String c_last_model) {
		this.c_last_model = c_last_model;
	}

	@XmlElement(name = "C_LAST_MODEL_CODE")
	public String getC_last_model_code() {
		return c_last_model_code;
	}

	public void setC_last_model_code(String c_last_model_code) {
		this.c_last_model_code = c_last_model_code;
	}

	@XmlElement(name = "C_MODEL_ID_CODE")
	public String getC_model_id_code() {
		return c_model_id_code;
	}

	public void setC_model_id_code(String c_model_id_code) {
		this.c_model_id_code = c_model_id_code;
	}

	@XmlElement(name = "N_DISCUS_USEVAL")
	public String getN_discus_useval() {
		return n_discus_useval;
	}

	public void setN_discus_useval(String n_discus_useval) {
		this.n_discus_useval = n_discus_useval;
	}

	@XmlElement(name = "C_MODEL_CODE")
	public String getC_model_code() {
		return c_model_code;
	}

	public void setC_model_code(String c_model_code) {
		this.c_model_code = c_model_code;
	}

	@XmlElement(name = "C_VHL_PKG_NO")
	public String getC_vhl_pkg_no() {
		return c_vhl_pkg_no;
	}

	public void setC_vhl_pkg_no(String c_vhl_pkg_no) {
		this.c_vhl_pkg_no = c_vhl_pkg_no;
	}

	@XmlElement(name = "C_FLEET_MRK")
	public String getC_fleet_mrk() {
		return c_fleet_mrk;
	}

	public void setC_fleet_mrk(String c_fleet_mrk) {
		this.c_fleet_mrk = c_fleet_mrk;
	}

	@XmlElement(name = "C_RESV_TXT_6")
	public String getC_resv_txt_6() {
		return c_resv_txt_6;
	}

	public void setC_resv_txt_6(String c_resv_txt_6) {
		this.c_resv_txt_6 = c_resv_txt_6;
	}

	@XmlElement(name = "C_TRANSFER_MRK")
	public String getC_transfer_mrk() {
		return c_transfer_mrk;
	}

	public void setC_transfer_mrk(String c_transfer_mrk) {
		this.c_transfer_mrk = c_transfer_mrk;
	}

	@XmlElement(name = "C_MODE_LID_CODE")
	public String getC_mode_lid_code() {
		return c_mode_lid_code;
	}

	public void setC_mode_lid_code(String c_mode_lid_code) {
		this.c_mode_lid_code = c_mode_lid_code;
	}

	@XmlElement(name = "C_INDUSTRY_CLASS")
	public String getC_industry_class() {
		return c_industry_class;
	}

	public void setC_industry_class(String c_industry_class) {
		this.c_industry_class = c_industry_class;
	}

	@XmlElement(name = "N_HAULAGE")
	public String getN_haulage() {
		return n_haulage;
	}

	public void setN_haulage(String n_haulage) {
		this.n_haulage = n_haulage;
	}

	@XmlElement(name = "C_HIGH_RISK_CAR")
	public String getC_high_risk_car() {
		return c_high_risk_car;
	}

	public void setC_high_risk_car(String c_high_risk_car) {
		this.c_high_risk_car = c_high_risk_car;
	}

	@XmlElement(name = "N_PREFL_DAY")
	public String getN_prefl_day() {
		return n_prefl_day;
	}

	public void setN_prefl_day(String n_prefl_day) {
		this.n_prefl_day = n_prefl_day;
	}

	@XmlElement(name = "C_PRI_EXPR")
	public String getC_pri_expr() {
		return c_pri_expr;
	}

	public void setC_pri_expr(String c_pri_expr) {
		this.c_pri_expr = c_pri_expr;
	}

	@XmlElement(name = "C_PRI_AMT")
	public String getC_pri_amt() {
		return c_pri_amt;
	}

	public void setC_pri_amt(String c_pri_amt) {
		this.c_pri_amt = c_pri_amt;
	}

	@XmlElement(name = "N_OF_PROV_NUM")
	public String getN_of_prov_num() {
		return n_of_prov_num;
	}

	public void setN_of_prov_num(String n_of_prov_num) {
		this.n_of_prov_num = n_of_prov_num;
	}

	@XmlElement(name = "C_CHANGE")
	public String getC_change() {
		return c_change;
	}

	public void setC_change(String c_change) {
		this.c_change = c_change;
	}

	@XmlElement(name = "T_TRANSFER_DATE")
	public String getT_transfer_date() {
		return t_transfer_date;
	}

	public void setT_transfer_date(String t_transfer_date) {
		this.t_transfer_date = t_transfer_date;
	}

	@XmlElement(name = "C_GLASS_TYP")
	public String getC_glass_typ() {
		return c_glass_typ;
	}

	public void setC_glass_typ(String c_glass_typ) {
		this.c_glass_typ = c_glass_typ;
	}

	@XmlElement(name = "N_CAR_AGE")
	public String getN_car_age() {
		return n_car_age;
	}

	public void setN_car_age(String n_car_age) {
		this.n_car_age = n_car_age;
	}

	@XmlElement(name = "C_LOAN_VEHICLE_FLAG")
	public String getC_loan_vehicle_flag() {
		return c_loan_vehicle_flag;
	}

	public void setC_loan_vehicle_flag(String c_loan_vehicle_flag) {
		this.c_loan_vehicle_flag = c_loan_vehicle_flag;
	}

	@XmlElement(name = "C_REG_VHL_TYP")
	public String getC_reg_vhl_typ() {
		return c_reg_vhl_typ;
	}

	public void setC_reg_vhl_typ(String c_reg_vhl_typ) {
		this.c_reg_vhl_typ = c_reg_vhl_typ;
	}

	@XmlElement(name = "C_REG_DRI_TYP")
	public String getC_reg_dri_typ() {
		return c_reg_dri_typ;
	}

	public void setC_reg_dri_typ(String c_reg_dri_typ) {
		this.c_reg_dri_typ = c_reg_dri_typ;
	}

	@XmlElement(name = "C_MON_DESP_RATE")
	public String getC_mon_desp_rate() {
		return c_mon_desp_rate;
	}

	public void setC_mon_desp_rate(String c_mon_desp_rate) {
		this.c_mon_desp_rate = c_mon_desp_rate;
	}

	@XmlElement(name = "C_BODY_COLOR")
	public String getC_body_color() {
		return c_body_color;
	}

	public void setC_body_color(String c_body_color) {
		this.c_body_color = c_body_color;
	}

	@XmlElement(name = "C_PROD_PLACE")
	public String getC_prod_place() {
		return c_prod_place;
	}

	public void setC_prod_place(String c_prod_place) {
		this.c_prod_place = c_prod_place;
	}

	@XmlElement(name = "C_NEW_PURCHASE_VALUE")
	public String getC_new_purchase_value() {
		return c_new_purchase_value;
	}

	public void setC_new_purchase_value(String c_new_purchase_value) {
		this.c_new_purchase_value = c_new_purchase_value;
	}

	@XmlElement(name = "N_DISPLACEMENT_LVL")
	public String getN_displacement_lvl() {
		return n_displacement_lvl;
	}

	public void setN_displacement_lvl(String n_displacement_lvl) {
		this.n_displacement_lvl = n_displacement_lvl;
	}

	@XmlElement(name = "C_MFG_YEAR")
	public String getC_mfg_year() {
		return c_mfg_year;
	}

	public void setC_mfg_year(String c_mfg_year) {
		this.c_mfg_year = c_mfg_year;
	}

	@XmlElement(name = "C_VHL_TYP")
	public String getC_vhl_typ() {
		return c_vhl_typ;
	}

	public void setC_vhl_typ(String c_vhl_typ) {
		this.c_vhl_typ = c_vhl_typ;
	}

	@XmlElement(name = "C_USAGE_CDE")
	public String getC_usage_cde() {
		return c_usage_cde;
	}

	public void setC_usage_cde(String c_usage_cde) {
		this.c_usage_cde = c_usage_cde;
	}

	@XmlElement(name = "C_NAT_OF_BUSINES")
	public String getC_nat_of_busines() {
		return c_nat_of_busines;
	}

	public void setC_nat_of_busines(String c_nat_of_busines) {
		this.c_nat_of_busines = c_nat_of_busines;
	}

	@XmlElement(name = "C_TRAVEL_AREA_CDE")
	public String getC_travel_area_cde() {
		return c_travel_area_cde;
	}

	public void setC_travel_area_cde(String c_travel_area_cde) {
		this.c_travel_area_cde = c_travel_area_cde;
	}

	@XmlElement(name = "N_YEAR_RUN_MILES")
	public String getN_year_run_miles() {
		return n_year_run_miles;
	}

	public void setN_year_run_miles(String n_year_run_miles) {
		this.n_year_run_miles = n_year_run_miles;
	}

	@XmlElement(name = "C_USE_YEAR")
	public String getC_use_year() {
		return c_use_year;
	}

	public void setC_use_year(String c_use_year) {
		this.c_use_year = c_use_year;
	}

	@XmlElement(name = "C_TFI_SPECIAL_MRK")
	public String getC_tfi_special_mrk() {
		return c_tfi_special_mrk;
	}

	public void setC_tfi_special_mrk(String c_tfi_special_mrk) {
		this.c_tfi_special_mrk = c_tfi_special_mrk;
	}

	@XmlElement(name = "C_PLATE_COLOR")
	public String getC_plate_color() {
		return c_plate_color;
	}

	public void setC_plate_color(String c_plate_color) {
		this.c_plate_color = c_plate_color;
	}

	@XmlElement(name = "C_VIN")
	public String getC_vin() {
		return c_vin;
	}

	public void setC_vin(String c_vin) {
		this.c_vin = c_vin;
	}

	@XmlElement(name = "C_FRM_NO")
	public String getC_frm_no() {
		return c_frm_no;
	}

	public void setC_frm_no(String c_frm_no) {
		this.c_frm_no = c_frm_no;
	}

	@XmlElement(name = "C_ENG_NO")
	public String getC_eng_no() {
		return c_eng_no;
	}

	public void setC_eng_no(String c_eng_no) {
		this.c_eng_no = c_eng_no;
	}

	@XmlElement(name = "T_FST_REG_YM")
	public String getT_fst_reg_ym() {
		return t_fst_reg_ym;
	}

	public void setT_fst_reg_ym(String t_fst_reg_ym) {
		this.t_fst_reg_ym = t_fst_reg_ym;
	}

	@XmlElement(name = "C_ECDEMIC_MRK")
	public String getC_ecdemic_mrk() {
		return c_ecdemic_mrk;
	}

	public void setC_ecdemic_mrk(String c_ecdemic_mrk) {
		this.c_ecdemic_mrk = c_ecdemic_mrk;
	}

	@XmlElement(name = "C_NEW_VHL_FLAG")
	public String getC_new_vhl_flag() {
		return c_new_vhl_flag;
	}

	public void setC_new_vhl_flag(String c_new_vhl_flag) {
		this.c_new_vhl_flag = c_new_vhl_flag;
	}

	@XmlElement(name = "C_NEW_MRK")
	public String getC_new_mrk() {
		return c_new_mrk;
	}

	public void setC_new_mrk(String c_new_mrk) {
		this.c_new_mrk = c_new_mrk;
	}

	@XmlElement(name = "C_PLATE_TYP")
	public String getC_plate_typ() {
		return c_plate_typ;
	}

	public void setC_plate_typ(String c_plate_typ) {
		this.c_plate_typ = c_plate_typ;
	}

	@XmlElement(name = "C_PLATE_NO")
	public String getC_plate_no() {
		return c_plate_no;
	}

	public void setC_plate_no(String c_plate_no) {
		this.c_plate_no = c_plate_no;
	}

	@XmlElement(name = "C_ModelFlag")
	public String getC_modelflag() {
		return c_modelflag;
	}

	public void setC_modelflag(String c_modelflag) {
		this.c_modelflag = c_modelflag;
	}

	@XmlElement(name = "C_DataSource")
	public String getC_datasource() {
		return c_datasource;
	}

	public void setC_datasource(String c_datasource) {
		this.c_datasource = c_datasource;
	}

	@XmlElement(name = "C_PURE_RISK_PREMIUM_FLAG")
	public String getC_pure_risk_premium_flag() {
		return c_pure_risk_premium_flag;
	}

	public void setC_pure_risk_premium_flag(String c_pure_risk_premium_flag) {
		this.c_pure_risk_premium_flag = c_pure_risk_premium_flag;
	}

	@XmlElement(name = "C_DEPT_CODE")
	public String getC_dept_code() {
		return c_dept_code;
	}

	public void setC_dept_code(String c_dept_code) {
		this.c_dept_code = c_dept_code;
	}

	@XmlElement(name = "N_PURE_RISK_PREMIUM")
	public String getN_pure_risk_premium() {
		return n_pure_risk_premium;
	}

	public void setN_pure_risk_premium(String n_pure_risk_premium) {
		this.n_pure_risk_premium = n_pure_risk_premium;
	}

	@XmlElement(name = "C_DEPT_NAME")
	public String getC_dept_name() {
		return c_dept_name;
	}

	public void setC_dept_name(String c_dept_name) {
		this.c_dept_name = c_dept_name;
	}

	@XmlElement(name = "C_CATEGORY_CODE")
	public String getC_category_code() {
		return c_category_code;
	}

	public void setC_category_code(String c_category_code) {
		this.c_category_code = c_category_code;
	}

	@XmlElement(name = "C_CATEGORY_NAME")
	public String getC_category_name() {
		return c_category_name;
	}

	public void setC_category_name(String c_category_name) {
		this.c_category_name = c_category_name;
	}

	@XmlElement(name = "C_CONFIG_TYPE")
	public String getC_config_type() {
		return c_config_type;
	}

	public void setC_config_type(String c_config_type) {
		this.c_config_type = c_config_type;
	}

	@XmlElement(name = "C_NOTICE_TYP")
	public String getC_notice_typ() {
		return c_notice_typ;
	}

	public void setC_notice_typ(String c_notice_typ) {
		this.c_notice_typ = c_notice_typ;
	}

	@XmlElement(name = "C_CAR_NAME")
	public String getC_car_name() {
		return c_car_name;
	}

	public void setC_car_name(String c_car_name) {
		this.c_car_name = c_car_name;
	}

	@XmlElement(name = "C_SERIES_CODE")
	public String getC_series_code() {
		return c_series_code;
	}

	public void setC_series_code(String c_series_code) {
		this.c_series_code = c_series_code;
	}

	@XmlElement(name = "C_SERIES")
	public String getC_series() {
		return c_series;
	}

	public void setC_series(String c_series) {
		this.c_series = c_series;
	}

	@XmlElement(name = "C_BRAND")
	public String getC_brand() {
		return c_brand;
	}

	public void setC_brand(String c_brand) {
		this.c_brand = c_brand;
	}

	@XmlElement(name = "C_TRADE_CODE")
	public String getC_trade_code() {
		return c_trade_code;
	}

	public void setC_trade_code(String c_trade_code) {
		this.c_trade_code = c_trade_code;
	}

	@XmlElement(name = "C_TRADE_NAME")
	public String getC_trade_name() {
		return c_trade_name;
	}

	public void setC_trade_name(String c_trade_name) {
		this.c_trade_name = c_trade_name;
	}

	@XmlElement(name = "C_RISK_FLAG")
	public String getC_risk_flag() {
		return c_risk_flag;
	}

	public void setC_risk_flag(String c_risk_flag) {
		this.c_risk_flag = c_risk_flag;
	}

	@XmlElement(name = "C_IS_PRICED")
	public String getC_is_priced() {
		return c_is_priced;
	}

	public void setC_is_priced(String c_is_priced) {
		this.c_is_priced = c_is_priced;
	}

	@XmlElement(name = "C_MARKET_DATE")
	public String getC_market_date() {
		return c_market_date;
	}

	public void setC_market_date(String c_market_date) {
		this.c_market_date = c_market_date;
	}

	@XmlElement(name = "C_REF_CODE2")
	public String getC_ref_code2() {
		return c_ref_code2;
	}

	public void setC_ref_code2(String c_ref_code2) {
		this.c_ref_code2 = c_ref_code2;
	}

	@XmlElement(name = "C_REF_CODE1")
	public String getC_ref_code1() {
		return c_ref_code1;
	}

	public void setC_ref_code1(String c_ref_code1) {
		this.c_ref_code1 = c_ref_code1;
	}

	@XmlElement(name = "N_NEW_PURCHASE_VALUE")
	public String getN_new_purchase_value() {
		return n_new_purchase_value;
	}

	public void setN_new_purchase_value(String n_new_purchase_value) {
		this.n_new_purchase_value = n_new_purchase_value;
	}

	@XmlElement(name = "N_VEHICLE_PRICE")
	public String getN_vehicle_price() {
		return n_vehicle_price;
	}

	public void setN_vehicle_price(String n_vehicle_price) {
		this.n_vehicle_price = n_vehicle_price;
	}

	@XmlElement(name = "C_VEHICLE_DESC")
	public String getC_vehicle_desc() {
		return c_vehicle_desc;
	}

	public void setC_vehicle_desc(String c_vehicle_desc) {
		this.c_vehicle_desc = c_vehicle_desc;
	}

	@XmlElement(name = "C_TRANSMIS_TYPE")
	public String getC_transmis_type() {
		return c_transmis_type;
	}

	public void setC_transmis_type(String c_transmis_type) {
		this.c_transmis_type = c_transmis_type;
	}

	@XmlElement(name = "C_FUEL_TYPE")
	public String getC_fuel_type() {
		return c_fuel_type;
	}

	public void setC_fuel_type(String c_fuel_type) {
		this.c_fuel_type = c_fuel_type;
	}

	@XmlElement(name = "N_VEHICLE_TONNAGE")
	public String getN_vehicle_tonnage() {
		return n_vehicle_tonnage;
	}

	public void setN_vehicle_tonnage(String n_vehicle_tonnage) {
		this.n_vehicle_tonnage = n_vehicle_tonnage;
	}

	@XmlElement(name = "C_VEHICLE_BRAND")
	public String getC_vehicle_brand() {
		return c_vehicle_brand;
	}

	public void setC_vehicle_brand(String c_vehicle_brand) {
		this.c_vehicle_brand = c_vehicle_brand;
	}

	@XmlElement(name = "C_HY_MODEL_CDE")
	public String getC_hy_model_cde() {
		return c_hy_model_cde;
	}

	public void setC_hy_model_cde(String c_hy_model_cde) {
		this.c_hy_model_cde = c_hy_model_cde;
	}

	@XmlElement(name = "C_HY_MODEL_NME")
	public String getC_hy_model_nme() {
		return c_hy_model_nme;
	}

	public void setC_hy_model_nme(String c_hy_model_nme) {
		this.c_hy_model_nme = c_hy_model_nme;
	}

	@XmlElement(name = "C_MODEL_CDE")
	public String getC_model_cde() {
		return c_model_cde;
	}

	public void setC_model_cde(String c_model_cde) {
		this.c_model_cde = c_model_cde;
	}

	@XmlElement(name = "C_MODEL_NME")
	public String getC_model_nme() {
		return c_model_nme;
	}

	public void setC_model_nme(String c_model_nme) {
		this.c_model_nme = c_model_nme;
	}

	@XmlElement(name = "C_VEHICLE_FAMILY")
	public String getC_vehicle_family() {
		return c_vehicle_family;
	}

	public void setC_vehicle_family(String c_vehicle_family) {
		this.c_vehicle_family = c_vehicle_family;
	}

	@XmlElement(name = "C_VEHICLE_MODEL")
	public String getC_vehicle_model() {
		return c_vehicle_model;
	}

	public void setC_vehicle_model(String c_vehicle_model) {
		this.c_vehicle_model = c_vehicle_model;
	}

	@XmlElement(name = "C_MODEL_DESC")
	public String getC_model_desc() {
		return c_model_desc;
	}

	public void setC_model_desc(String c_model_desc) {
		this.c_model_desc = c_model_desc;
	}

	@XmlElement(name = "C_BRAND_NAME")
	public String getC_brand_name() {
		return c_brand_name;
	}

	public void setC_brand_name(String c_brand_name) {
		this.c_brand_name = c_brand_name;
	}

	@XmlElement(name = "C_MARKET_TIMESTAMP")
	public String getC_market_timestamp() {
		return c_market_timestamp;
	}

	public void setC_market_timestamp(String c_market_timestamp) {
		this.c_market_timestamp = c_market_timestamp;
	}

	@XmlElement(name = "C_IMPORT_FLAG")
	public String getC_import_flag() {
		return c_import_flag;
	}

	public void setC_import_flag(String c_import_flag) {
		this.c_import_flag = c_import_flag;
	}

	@XmlElement(name = "N_LIMIT_LOAD_PERSON")
	public String getN_limit_load_person() {
		return n_limit_load_person;
	}

	public void setN_limit_load_person(String n_limit_load_person) {
		this.n_limit_load_person = n_limit_load_person;
	}

	@XmlElement(name = "N_PO_WEIGHT")
	public String getN_po_weight() {
		return n_po_weight;
	}

	public void setN_po_weight(String n_po_weight) {
		this.n_po_weight = n_po_weight;
	}

	@XmlElement(name = "N_TONAGE")
	public String getN_tonage() {
		return n_tonage;
	}

	public void setN_tonage(String n_tonage) {
		this.n_tonage = n_tonage;
	}

	@XmlElement(name = "N_DISPLACEMENT")
	public String getN_displacement() {
		return n_displacement;
	}

	public void setN_displacement(String n_displacement) {
		this.n_displacement = n_displacement;
	}

	@XmlElement(name = "C_ABS_FLAG")
	public String getC_abs_flag() {
		return c_abs_flag;
	}

	public void setC_abs_flag(String c_abs_flag) {
		this.c_abs_flag = c_abs_flag;
	}

	@XmlElement(name = "C_ALARM_FLAG")
	public String getC_alarm_flag() {
		return c_alarm_flag;
	}

	public void setC_alarm_flag(String c_alarm_flag) {
		this.c_alarm_flag = c_alarm_flag;
	}

	@XmlElement(name = "N_AIRBAG_NUM")
	public String getN_airbag_num() {
		return n_airbag_num;
	}

	public void setN_airbag_num(String n_airbag_num) {
		this.n_airbag_num = n_airbag_num;
	}

	@XmlElement(name = "N_PLAM_PURCHASE_PRICE")
	public String getN_plam_purchase_price() {
		return n_plam_purchase_price;
	}

	public void setN_plam_purchase_price(String n_plam_purchase_price) {
		this.n_plam_purchase_price = n_plam_purchase_price;
	}

	@XmlElement(name = "N_PURCHASE_PRICE")
	public String getN_purchase_price() {
		return n_purchase_price;
	}

	public void setN_purchase_price(String n_purchase_price) {
		this.n_purchase_price = n_purchase_price;
	}

	@XmlElement(name = "N_PURCHASE_PRICE_TAX")
	public String getN_purchase_price_tax() {
		return n_purchase_price_tax;
	}

	public void setN_purchase_price_tax(String n_purchase_price_tax) {
		this.n_purchase_price_tax = n_purchase_price_tax;
	}

	@XmlElement(name = "N_KINDRED_PRICE")
	public String getN_kindred_price() {
		return n_kindred_price;
	}

	public void setN_kindred_price(String n_kindred_price) {
		this.n_kindred_price = n_kindred_price;
	}

	@XmlElement(name = "N_KINDRED_PRICE_TAX")
	public String getN_kindred_price_tax() {
		return n_kindred_price_tax;
	}

	public void setN_kindred_price_tax(String n_kindred_price_tax) {
		this.n_kindred_price_tax = n_kindred_price_tax;
	}

	@XmlElement(name = "N_ASSIGN_PRICE")
	public String getN_assign_price() {
		return n_assign_price;
	}

	public void setN_assign_price(String n_assign_price) {
		this.n_assign_price = n_assign_price;
	}

	@XmlElement(name = "T_MARKET_DATE")
	public String getT_market_date() {
		return t_market_date;
	}

	public void setT_market_date(String t_market_date) {
		this.t_market_date = t_market_date;
	}

	@XmlElement(name = "N_FLOAT_PRICE_MAX")
	public String getN_float_price_max() {
		return n_float_price_max;
	}

	public void setN_float_price_max(String n_float_price_max) {
		this.n_float_price_max = n_float_price_max;
	}

	@XmlElement(name = "C_SNMODIFY_PRICES")
	public String getC_snmodify_prices() {
		return c_snmodify_prices;
	}

	public void setC_snmodify_prices(String c_snmodify_prices) {
		this.c_snmodify_prices = c_snmodify_prices;
	}

	@XmlElement(name = "N_FLOAT_PRICE_MIN")
	public String getN_float_price_min() {
		return n_float_price_min;
	}

	public void setN_float_price_min(String n_float_price_min) {
		this.n_float_price_min = n_float_price_min;
	}

	@XmlElement(name = "C_XNMODIFY_PRICES")
	public String getC_xnmodify_prices() {
		return c_xnmodify_prices;
	}

	public void setC_xnmodify_prices(String c_xnmodify_prices) {
		this.c_xnmodify_prices = c_xnmodify_prices;
	}

	@XmlElement(name = "C_REMARK")
	public String getC_remark() {
		return c_remark;
	}

	public void setC_remark(String c_remark) {
		this.c_remark = c_remark;
	}

	@XmlElement(name = "C_GEARBOX_TYPE")
	public String getC_gearbox_type() {
		return c_gearbox_type;
	}

	public void setC_gearbox_type(String c_gearbox_type) {
		this.c_gearbox_type = c_gearbox_type;
	}

	@XmlElement(name = "C_IMPORT_TYPE")
	public String getC_import_type() {
		return c_import_type;
	}

	public void setC_import_type(String c_import_type) {
		this.c_import_type = c_import_type;
	}

	@XmlElement(name = "C_FACTORY_NAME")
	public String getC_factory_name() {
		return c_factory_name;
	}

	public void setC_factory_name(String c_factory_name) {
		this.c_factory_name = c_factory_name;
	}

	@XmlElement(name = "C_INSURANCE_SY_CODE")
	public String getC_insurance_sy_code() {
		return c_insurance_sy_code;
	}

	public void setC_insurance_sy_code(String c_insurance_sy_code) {
		this.c_insurance_sy_code = c_insurance_sy_code;
	}

	@XmlElement(name = "C_INSURANCE_SY_NAME")
	public String getC_insurance_sy_name() {
		return c_insurance_sy_name;
	}

	public void setC_insurance_sy_name(String c_insurance_sy_name) {
		this.c_insurance_sy_name = c_insurance_sy_name;
	}

	@XmlElement(name = "C_INSURANCE_JQ_CODE")
	public String getC_insurance_jq_code() {
		return c_insurance_jq_code;
	}

	public void setC_insurance_jq_code(String c_insurance_jq_code) {
		this.c_insurance_jq_code = c_insurance_jq_code;
	}

	@XmlElement(name = "C_INSURANCE_JQ_NAME")
	public String getC_insurance_jq_name() {
		return c_insurance_jq_name;
	}

	public void setC_insurance_jq_name(String c_insurance_jq_name) {
		this.c_insurance_jq_name = c_insurance_jq_name;
	}

	@XmlElement(name = "C_SEARCH_CODE")
	public String getC_search_code() {
		return c_search_code;
	}

	public void setC_search_code(String c_search_code) {
		this.c_search_code = c_search_code;
	}

	@XmlElement(name = "C_FACTORY_CODE")
	public String getC_factory_code() {
		return c_factory_code;
	}

	public void setC_factory_code(String c_factory_code) {
		this.c_factory_code = c_factory_code;
	}

	@XmlElement(name = "C_FAMILY_CODE")
	public String getC_family_code() {
		return c_family_code;
	}

	public void setC_family_code(String c_family_code) {
		this.c_family_code = c_family_code;
	}

	@XmlElement(name = "C_BRAND_CODE")
	public String getC_brand_code() {
		return c_brand_code;
	}

	public void setC_brand_code(String c_brand_code) {
		this.c_brand_code = c_brand_code;
	}

	@XmlElement(name = "C_VEHICLE_ALIAS")
	public String getC_vehicle_alias() {
		return c_vehicle_alias;
	}

	public void setC_vehicle_alias(String c_vehicle_alias) {
		this.c_vehicle_alias = c_vehicle_alias;
	}

	@XmlElement(name = "C_VEHICLE_CLASS")
	public String getC_vehicle_class() {
		return c_vehicle_class;
	}

	public void setC_vehicle_class(String c_vehicle_class) {
		this.c_vehicle_class = c_vehicle_class;
	}

	@XmlElement(name = "C_STATUS")
	public String getC_status() {
		return c_status;
	}

	public void setC_status(String c_status) {
		this.c_status = c_status;
	}

	@XmlElement(name = "C_POWER_TYPE")
	public String getC_power_type() {
		return c_power_type;
	}

	public void setC_power_type(String c_power_type) {
		this.c_power_type = c_power_type;
	}

	@XmlElement(name = "T_CREATED_DATE")
	public Date getT_created_date() {
		return t_created_date;
	}

	public void setT_created_date(Date t_created_date) {
		this.t_created_date = t_created_date;
	}

	@XmlElement(name = "T_UPDATED_DATE")
	public Date getT_updated_date() {
		return t_updated_date;
	}

	public void setT_updated_date(Date t_updated_date) {
		this.t_updated_date = t_updated_date;
	}

	@XmlElement(name = "C_HFCODE")
	public String getC_hfcode() {
		return c_hfcode;
	}

	public void setC_hfcode(String c_hfcode) {
		this.c_hfcode = c_hfcode;
	}

	@XmlElement(name = "C_HFNAME")
	public String getC_hfname() {
		return c_hfname;
	}

	public void setC_hfname(String c_hfname) {
		this.c_hfname = c_hfname;
	}

	public String getC_reg_owner() {
		return c_reg_owner;
	}

	public void setC_reg_owner(String c_reg_owner) {
		this.c_reg_owner = c_reg_owner;
	}

	public String getN_seat_num() {
		return n_seat_num;
	}

	public void setN_seat_num(String n_seat_num) {
		this.n_seat_num = n_seat_num;
	}

	public String getN_drag_weight() {
		return n_drag_weight;
	}

	public void setN_drag_weight(String n_drag_weight) {
		this.n_drag_weight = n_drag_weight;
	}

	public String getT_rerv_txt1() {
		return t_rerv_txt1;
	}

	public void setT_rerv_txt1(String t_rerv_txt1) {
		this.t_rerv_txt1 = t_rerv_txt1;
	}

	public String getC_alias_id() {
		return c_alias_id;
	}

	public void setC_alias_id(String c_alias_id) {
		this.c_alias_id = c_alias_id;
	}

	public String getC_brand_id() {
		return c_brand_id;
	}

	public void setC_brand_id(String c_brand_id) {
		this.c_brand_id = c_brand_id;
	}

}
