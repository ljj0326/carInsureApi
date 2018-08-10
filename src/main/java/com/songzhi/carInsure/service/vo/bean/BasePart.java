package com.songzhi.carInsure.service.vo.bean;

import javax.xml.bind.annotation.XmlElement;

import com.songzhi.carInsure.service.vo.bean.BaseDomain;

public class BasePart extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7656529502789824293L;

	private String c_model_code;

	private String c_search_no;

	private String c_plate_no;

	private String c_plate_typ;

	private String c_frm_no;

	private String c_eng_no;

	private String c_owner_nme;

	private String t_fst_reg_ym;

	private String t_qry_tm;

	private String t_issue_tm;

	private String c_qry_cde;

	private String c_offer_no;

	private String c_app_no;

	private String c_app_no_tpf;
	
	private String c_app_no_biz;
	
	private String c_app_status_tpf;
	
	private String c_app_status_biz;

	private String c_expolicy_before;// 上年是否无保单
	
	private String n_expect_payrate;// 预期赔付率
	
	private String t_past_end_date;// 查询码有效止期

	private String c_app_status;

	private String n_risk_cost;

	private String n_target_prm;

	private String n_total_coef;

	private String n_prm;

	private String n_amt;

	private String n_total_prm;

	private String n_excl_tax_prm;

	private String n_add_tax_prm;

	private String n_discount_amount;

	private String n_profit_ratio;

	private String n_pay_ratio;
	
	private String c_orig_ply_no_biz;
	
	private String c_orig_ply_no_tpf;

	private String n_cost_rate;

	private String n_cost_ratio;

	private String c_cost_ratio_level;

	private String c_reinsure_flag;

	private String t_last_bill_date;

	private String t_last_start_date;

	private String t_last_end_date;

	private String c_app_typ;

	private String c_trun_mrk;

	private String c_pay_ratio_level;

	private String c_service_code;

	private String n_comrat_upper;

	private String n_comm_add_tax_rate;

	private String c_act_flag;

	private String n_bch_prm;

	private String n_target_coef;

	private String c_last_ply_no;

	private String c_last_prod_code;

	private String c_calculation_flag;

	private String c_prm_calc_pro_typ;

	private String c_offer_plan;

	private String n_ratio_coef;

	private String n_noshort_bchprm;

	private String n_rate_product;

	private String c_prisk_prem_flag;

	private String c_conti_offer_mrk;

	private String n_rate_pro_show;

	private String n_car_loss_prm;

	private String c_transfer_mrk;

	private String c_high_risk_flag;

	private String t_effect_reason;

	private String t_lastyear_start_date;

	private String t_lastyear_end_date;

	private String c_lastyear_company_id;

	private String c_traff_end_tm;

	private String c_pay_sequence;

	private String check_code;

	private String amount;

	private String remark;

	private String t_insrnc_bgn_tm_tpf;
	private String t_insrnc_end_tm_tpf;
	private String t_insrnc_bgn_tm_biz;
	private String t_insrnc_end_tm_biz;
	private String c_immeff_mrk_tpf;
	private String c_immeff_mrk_biz;
	private String c_dpt_cde;
	private String c_bsns_typ;
	private String c_offer_mrk;
	private String c_opr_cde;
	private String c_opr_nme;
	private String c_sls_cde;
	private String c_sls_nme;
	private String c_brkr_cde;
	private String c_prod_type;
	private String c_agency_cde;
	private String c_agt_agr_no;
	private String c_ply_dpt_cde;
	private String c_brkr_nme;
	private String c_record_code;
	private String c_computer_ip;
	private String c_pos_no;
	private String c_usb_key;
	private String c_agant_per;
	private String c_sls_id;
	private String c_third_bussiness;
	private String c_multi_app_flag;
	private String c_dispt_sttl_org;
	private String c_system_flag;
	private String c_disp_sttl_code;
	private String c_sls_tel;
	private String c_renew_mrk;
	private String c_appoint_area_cde;
	private String c_undr_mrk;
	private String c_machine_code;
	private String c_read_mrk;// 阅读标识
	private String c_link_address;// 链接地址
	// 2017年9月11日17:51:04
	private String c_ply_no;// 投保单号
	private String c_prod_no;// 产品号
	private String t_undr_tm;// 核保通过时间
	private String c_sale_nme = "";

	@XmlElement(name = "C_READ_MRK")
	public String getC_read_mrk() {
		return c_read_mrk;
	}

	public void setC_read_mrk(String c_read_mrk) {
		this.c_read_mrk = c_read_mrk;
	}

	@XmlElement(name = "C_LINK_ADDRESS")
	public String getC_link_address() {
		return c_link_address;
	}

	public void setC_link_address(String c_link_address) {
		this.c_link_address = c_link_address;
	}

	public String getC_orig_ply_no_biz() {
		return c_orig_ply_no_biz;
	}

	public void setC_orig_ply_no_biz(String c_orig_ply_no_biz) {
		this.c_orig_ply_no_biz = c_orig_ply_no_biz;
	}

	public String getC_orig_ply_no_tpf() {
		return c_orig_ply_no_tpf;
	}

	public void setC_orig_ply_no_tpf(String c_orig_ply_no_tpf) {
		this.c_orig_ply_no_tpf = c_orig_ply_no_tpf;
	}

	public String getC_machine_code() {
		return c_machine_code;
	}

	public void setC_machine_code(String c_machine_code) {
		this.c_machine_code = c_machine_code;
	}

	@XmlElement(name = "C_UNDR_MRK")
	public String getC_undr_mrk() {
		return c_undr_mrk;
	}

	public void setC_undr_mrk(String c_undr_mrk) {
		this.c_undr_mrk = c_undr_mrk;
	}

	@XmlElement(name = "C_APPOINT_AREA_CDE")
	public String getC_appoint_area_cde() {
		return c_appoint_area_cde;
	}

	public void setC_appoint_area_cde(String c_appoint_area_cde) {
		this.c_appoint_area_cde = c_appoint_area_cde;
	}

	@XmlElement(name = "C_RENEW_MRK")
	public String getC_renew_mrk() {
		return c_renew_mrk;
	}

	public void setC_renew_mrk(String c_renew_mrk) {
		this.c_renew_mrk = c_renew_mrk;
	}

	public String getC_opr_nme() {
		return c_opr_nme;
	}

	public void setC_opr_nme(String c_opr_nme) {
		this.c_opr_nme = c_opr_nme;
	}

	public String getC_sls_tel() {
		return c_sls_tel;
	}

	public void setC_sls_tel(String c_sls_tel) {
		this.c_sls_tel = c_sls_tel;
	}

	@XmlElement(name = "C_DPT_CDE")
	public String getC_dpt_cde() {
		return c_dpt_cde;
	}

	public void setC_dpt_cde(String c_dpt_cde) {
		this.c_dpt_cde = c_dpt_cde;
	}

	public String getC_bsns_typ() {
		return c_bsns_typ;
	}

	public void setC_bsns_typ(String c_bsns_typ) {
		this.c_bsns_typ = c_bsns_typ;
	}

	public String getC_offer_mrk() {
		return c_offer_mrk;
	}

	public void setC_offer_mrk(String c_offer_mrk) {
		this.c_offer_mrk = c_offer_mrk;
	}

	public String getC_opr_cde() {
		return c_opr_cde;
	}

	public void setC_opr_cde(String c_opr_cde) {
		this.c_opr_cde = c_opr_cde;
	}

	public String getC_sls_cde() {
		return c_sls_cde;
	}

	public void setC_sls_cde(String c_sls_cde) {
		this.c_sls_cde = c_sls_cde;
	}

	public String getC_sls_nme() {
		return c_sls_nme;
	}

	public void setC_sls_nme(String c_sls_nme) {
		this.c_sls_nme = c_sls_nme;
	}

	public String getC_brkr_cde() {
		return c_brkr_cde;
	}

	public void setC_brkr_cde(String c_brkr_cde) {
		this.c_brkr_cde = c_brkr_cde;
	}

	public String getC_prod_type() {
		return c_prod_type;
	}

	public void setC_prod_type(String c_prod_type) {
		this.c_prod_type = c_prod_type;
	}

	public String getC_agency_cde() {
		return c_agency_cde;
	}

	public void setC_agency_cde(String c_agency_cde) {
		this.c_agency_cde = c_agency_cde;
	}

	public String getC_agt_agr_no() {
		return c_agt_agr_no;
	}

	public void setC_agt_agr_no(String c_agt_agr_no) {
		this.c_agt_agr_no = c_agt_agr_no;
	}

	public String getC_ply_dpt_cde() {
		return c_ply_dpt_cde;
	}

	public void setC_ply_dpt_cde(String c_ply_dpt_cde) {
		this.c_ply_dpt_cde = c_ply_dpt_cde;
	}

	public String getC_brkr_nme() {
		return c_brkr_nme;
	}

	public void setC_brkr_nme(String c_brkr_nme) {
		this.c_brkr_nme = c_brkr_nme;
	}

	public String getC_record_code() {
		return c_record_code;
	}

	public void setC_record_code(String c_record_code) {
		this.c_record_code = c_record_code;
	}

	public String getC_computer_ip() {
		return c_computer_ip;
	}

	public void setC_computer_ip(String c_computer_ip) {
		this.c_computer_ip = c_computer_ip;
	}

	public String getC_pos_no() {
		return c_pos_no;
	}

	public void setC_pos_no(String c_pos_no) {
		this.c_pos_no = c_pos_no;
	}

	public String getC_usb_key() {
		return c_usb_key;
	}

	public void setC_usb_key(String c_usb_key) {
		this.c_usb_key = c_usb_key;
	}

	public String getC_agant_per() {
		return c_agant_per;
	}

	public void setC_agant_per(String c_agant_per) {
		this.c_agant_per = c_agant_per;
	}

	public String getC_sls_id() {
		return c_sls_id;
	}

	public void setC_sls_id(String c_sls_id) {
		this.c_sls_id = c_sls_id;
	}

	public String getC_third_bussiness() {
		return c_third_bussiness;
	}

	public void setC_third_bussiness(String c_third_bussiness) {
		this.c_third_bussiness = c_third_bussiness;
	}

	public String getC_multi_app_flag() {
		return c_multi_app_flag;
	}

	public void setC_multi_app_flag(String c_multi_app_flag) {
		this.c_multi_app_flag = c_multi_app_flag;
	}

	public String getC_dispt_sttl_org() {
		return c_dispt_sttl_org;
	}

	public void setC_dispt_sttl_org(String c_dispt_sttl_org) {
		this.c_dispt_sttl_org = c_dispt_sttl_org;
	}

	public String getC_system_flag() {
		return c_system_flag;
	}

	public void setC_system_flag(String c_system_flag) {
		this.c_system_flag = c_system_flag;
	}

	public String getC_disp_sttl_code() {
		return c_disp_sttl_code;
	}

	public void setC_disp_sttl_code(String c_disp_sttl_code) {
		this.c_disp_sttl_code = c_disp_sttl_code;
	}

	public String getC_app_status_tpf() {
		return c_app_status_tpf;
	}

	public void setC_app_status_tpf(String c_app_status_tpf) {
		this.c_app_status_tpf = c_app_status_tpf;
	}

	public String getC_app_status_biz() {
		return c_app_status_biz;
	}

	public void setC_app_status_biz(String c_app_status_biz) {
		this.c_app_status_biz = c_app_status_biz;
	}

	public String getC_app_no_tpf() {
		return c_app_no_tpf;
	}

	public void setC_app_no_tpf(String c_app_no_tpf) {
		this.c_app_no_tpf = c_app_no_tpf;
	}

	public String getC_app_no_biz() {
		return c_app_no_biz;
	}

	public void setC_app_no_biz(String c_app_no_biz) {
		this.c_app_no_biz = c_app_no_biz;
	}

	@XmlElement(name = "C_APP_STATUS")
	public String getC_app_status() {
		return c_app_status;
	}

	public void setC_app_status(String c_app_status) {
		this.c_app_status = c_app_status;
	}

	public String getT_insrnc_bgn_tm_tpf() {
		return t_insrnc_bgn_tm_tpf;
	}

	public void setT_insrnc_bgn_tm_tpf(String t_insrnc_bgn_tm_tpf) {
		this.t_insrnc_bgn_tm_tpf = t_insrnc_bgn_tm_tpf;
	}

	public String getT_insrnc_end_tm_tpf() {
		return t_insrnc_end_tm_tpf;
	}

	public void setT_insrnc_end_tm_tpf(String t_insrnc_end_tm_tpf) {
		this.t_insrnc_end_tm_tpf = t_insrnc_end_tm_tpf;
	}

	public String getT_insrnc_bgn_tm_biz() {
		return t_insrnc_bgn_tm_biz;
	}

	public void setT_insrnc_bgn_tm_biz(String t_insrnc_bgn_tm_biz) {
		this.t_insrnc_bgn_tm_biz = t_insrnc_bgn_tm_biz;
	}

	public String getT_insrnc_end_tm_biz() {
		return t_insrnc_end_tm_biz;
	}

	public void setT_insrnc_end_tm_biz(String t_insrnc_end_tm_biz) {
		this.t_insrnc_end_tm_biz = t_insrnc_end_tm_biz;
	}

	public String getC_immeff_mrk_tpf() {
		return c_immeff_mrk_tpf;
	}

	public void setC_immeff_mrk_tpf(String c_immeff_mrk_tpf) {
		this.c_immeff_mrk_tpf = c_immeff_mrk_tpf;
	}

	public String getC_immeff_mrk_biz() {
		return c_immeff_mrk_biz;
	}

	public void setC_immeff_mrk_biz(String c_immeff_mrk_biz) {
		this.c_immeff_mrk_biz = c_immeff_mrk_biz;
	}

	@XmlElement(name = "REMARK")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@XmlElement(name = "AMOUNT")
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@XmlElement(name = "CHECK_CODE")
	public String getCheck_code() {
		return check_code;
	}

	public void setCheck_code(String check_code) {
		this.check_code = check_code;
	}

	@XmlElement(name = "C_PAY_SEQUENCE")
	public String getC_pay_sequence() {
		return c_pay_sequence;
	}

	public void setC_pay_sequence(String c_pay_sequence) {
		this.c_pay_sequence = c_pay_sequence;
	}

	@XmlElement(name = "C_TRAFF_END_TM")
	public String getC_traff_end_tm() {
		return c_traff_end_tm;
	}

	public void setC_traff_end_tm(String c_traff_end_tm) {
		this.c_traff_end_tm = c_traff_end_tm;
	}

	@XmlElement(name = "C_LASTYEAR_COMPANY_ID")
	public String getC_lastyear_company_id() {
		return c_lastyear_company_id;
	}

	public void setC_lastyear_company_id(String c_lastyear_company_id) {
		this.c_lastyear_company_id = c_lastyear_company_id;
	}

	@XmlElement(name = "T_LASTYEAR_END_DATE")
	public String getT_lastyear_end_date() {
		return t_lastyear_end_date;
	}

	public void setT_lastyear_end_date(String t_lastyear_end_date) {
		this.t_lastyear_end_date = t_lastyear_end_date;
	}

	@XmlElement(name = "T_LASTYEAR_START_DATE")
	public String getT_lastyear_start_date() {
		return t_lastyear_start_date;
	}

	public void setT_lastyear_start_date(String t_lastyear_start_date) {
		this.t_lastyear_start_date = t_lastyear_start_date;
	}

	@XmlElement(name = "T_EFFECT_REASON")
	public String getT_effect_reason() {
		return t_effect_reason;
	}

	public void setT_effect_reason(String t_effect_reason) {
		this.t_effect_reason = t_effect_reason;
	}

	@XmlElement(name = "C_HIGH_RISK_FLAG")
	public String getC_high_risk_flag() {
		return c_high_risk_flag;
	}

	public void setC_high_risk_flag(String c_high_risk_flag) {
		this.c_high_risk_flag = c_high_risk_flag;
	}

	@XmlElement(name = "C_TRANSFER_MRK")
	public String getC_transfer_mrk() {
		return c_transfer_mrk;
	}

	public void setC_transfer_mrk(String c_transfer_mrk) {
		this.c_transfer_mrk = c_transfer_mrk;
	}

	@XmlElement(name = "N_CAR_LOSS_PRM")
	public String getN_car_loss_prm() {
		return n_car_loss_prm;
	}

	public void setN_car_loss_prm(String n_car_loss_prm) {
		this.n_car_loss_prm = n_car_loss_prm;
	}

	@XmlElement(name = "N_RATE_PRO_SHOW")
	public String getN_rate_pro_show() {
		return n_rate_pro_show;
	}

	public void setN_rate_pro_show(String n_rate_pro_show) {
		this.n_rate_pro_show = n_rate_pro_show;
	}

	@XmlElement(name = "C_CONTI_OFFER_MRK")
	public String getC_conti_offer_mrk() {
		return c_conti_offer_mrk;
	}

	public void setC_conti_offer_mrk(String c_conti_offer_mrk) {
		this.c_conti_offer_mrk = c_conti_offer_mrk;
	}

	@XmlElement(name = "C_PRISK_PREM_FLAG")
	public String getC_prisk_prem_flag() {
		return c_prisk_prem_flag;
	}

	public void setC_prisk_prem_flag(String c_prisk_prem_flag) {
		this.c_prisk_prem_flag = c_prisk_prem_flag;
	}

	@XmlElement(name = "N_RATE_PRODUCT")
	public String getN_rate_product() {
		return n_rate_product;
	}

	public void setN_rate_product(String n_rate_product) {
		this.n_rate_product = n_rate_product;
	}

	@XmlElement(name = "N_NOSHORT_BCHPRM")
	public String getN_noshort_bchprm() {
		return n_noshort_bchprm;
	}

	public void setN_noshort_bchprm(String n_noshort_bchprm) {
		this.n_noshort_bchprm = n_noshort_bchprm;
	}

	@XmlElement(name = "N_RATIO_COEF")
	public String getN_ratio_coef() {
		return n_ratio_coef;
	}

	public void setN_ratio_coef(String n_ratio_coef) {
		this.n_ratio_coef = n_ratio_coef;
	}

	@XmlElement(name = "C_OFFER_PLAN")
	public String getC_offer_plan() {
		return c_offer_plan;
	}

	public void setC_offer_plan(String c_offer_plan) {
		this.c_offer_plan = c_offer_plan;
	}

	@XmlElement(name = "C_PRM_CALC_PRO_TYP")
	public String getC_prm_calc_pro_typ() {
		return c_prm_calc_pro_typ;
	}

	public void setC_prm_calc_pro_typ(String c_prm_calc_pro_typ) {
		this.c_prm_calc_pro_typ = c_prm_calc_pro_typ;
	}

	@XmlElement(name = "C_CALCULATION_FLAG")
	public String getC_calculation_flag() {
		return c_calculation_flag;
	}

	public void setC_calculation_flag(String c_calculation_flag) {
		this.c_calculation_flag = c_calculation_flag;
	}

	@XmlElement(name = "C_LAST_PROD_CODE")
	public String getC_last_prod_code() {
		return c_last_prod_code;
	}

	public void setC_last_prod_code(String c_last_prod_code) {
		this.c_last_prod_code = c_last_prod_code;
	}

	@XmlElement(name = "C_LAST_PLY_NO")
	public String getC_last_ply_no() {
		return c_last_ply_no;
	}

	public void setC_last_ply_no(String c_last_ply_no) {
		this.c_last_ply_no = c_last_ply_no;
	}

	@XmlElement(name = "N_TARGET_COEF")
	public String getN_target_coef() {
		return n_target_coef;
	}

	public void setN_target_coef(String n_target_coef) {
		this.n_target_coef = n_target_coef;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@XmlElement(name = "N_BCH_PRM")
	public String getN_bch_prm() {
		return n_bch_prm;
	}

	public void setN_bch_prm(String n_bch_prm) {
		this.n_bch_prm = n_bch_prm;
	}

	@XmlElement(name = "C_ACT_FLAG")
	public String getC_act_flag() {
		return c_act_flag;
	}

	public void setC_act_flag(String c_act_flag) {
		this.c_act_flag = c_act_flag;
	}

	@XmlElement(name = "N_COMM_ADD_TAX_RATE")
	public String getN_comm_add_tax_rate() {
		return n_comm_add_tax_rate;
	}

	public void setN_comm_add_tax_rate(String n_comm_add_tax_rate) {
		this.n_comm_add_tax_rate = n_comm_add_tax_rate;
	}

	@XmlElement(name = "N_COMRAT_UPPER")
	public String getN_comrat_upper() {
		return n_comrat_upper;
	}

	public void setN_comrat_upper(String n_comrat_upper) {
		this.n_comrat_upper = n_comrat_upper;
	}

	@XmlElement(name = "C_SERVICE_CODE")
	public String getC_service_code() {
		return c_service_code;
	}

	public void setC_service_code(String c_service_code) {
		this.c_service_code = c_service_code;
	}

	@XmlElement(name = "C_PAY_RATIO_LEVEL")
	public String getC_pay_ratio_level() {
		return c_pay_ratio_level;
	}

	public void setC_pay_ratio_level(String c_pay_ratio_level) {
		this.c_pay_ratio_level = c_pay_ratio_level;
	}

	@XmlElement(name = "C_TRUN_MRK")
	public String getC_trun_mrk() {
		return c_trun_mrk;
	}

	public void setC_trun_mrk(String c_trun_mrk) {
		this.c_trun_mrk = c_trun_mrk;
	}

	@XmlElement(name = "C_APP_TYP")
	public String getC_app_typ() {
		return c_app_typ;
	}

	public void setC_app_typ(String c_app_typ) {
		this.c_app_typ = c_app_typ;
	}

	@XmlElement(name = "T_LAST_END_DATE")
	public String getT_last_end_date() {
		return t_last_end_date;
	}

	public void setT_last_end_date(String t_last_end_date) {
		this.t_last_end_date = t_last_end_date;
	}

	@XmlElement(name = "T_LAST_START_DATE")
	public String getT_last_start_date() {
		return t_last_start_date;
	}

	public void setT_last_start_date(String t_last_start_date) {
		this.t_last_start_date = t_last_start_date;
	}

	@XmlElement(name = "T_LAST_BILL_DATE")
	public String getT_last_bill_date() {
		return t_last_bill_date;
	}

	public void setT_last_bill_date(String t_last_bill_date) {
		this.t_last_bill_date = t_last_bill_date;
	}

	@XmlElement(name = "C_REINSURE_FLAG")
	public String getC_reinsure_flag() {
		return c_reinsure_flag;
	}

	public void setC_reinsure_flag(String c_reinsure_flag) {
		this.c_reinsure_flag = c_reinsure_flag;
	}

	@XmlElement(name = "C_COST_RATIO_LEVEL")
	public String getC_cost_ratio_level() {
		return c_cost_ratio_level;
	}

	public void setC_cost_ratio_level(String c_cost_ratio_level) {
		this.c_cost_ratio_level = c_cost_ratio_level;
	}

	@XmlElement(name = "N_COST_RATIO")
	public String getN_cost_ratio() {
		return n_cost_ratio;
	}

	public void setN_cost_ratio(String n_cost_ratio) {
		this.n_cost_ratio = n_cost_ratio;
	}

	@XmlElement(name = "N_COST_RATE")
	public String getN_cost_rate() {
		return n_cost_rate;
	}

	public void setN_cost_rate(String n_cost_rate) {
		this.n_cost_rate = n_cost_rate;
	}

	@XmlElement(name = "N_PAY_RATIO")
	public String getN_pay_ratio() {
		return n_pay_ratio;
	}

	public void setN_pay_ratio(String n_pay_ratio) {
		this.n_pay_ratio = n_pay_ratio;
	}

	@XmlElement(name = "N_PROFIT_RATIO")
	public String getN_profit_ratio() {
		return n_profit_ratio;
	}

	public void setN_profit_ratio(String n_profit_ratio) {
		this.n_profit_ratio = n_profit_ratio;
	}

	@XmlElement(name = "N_DISCOUNT_AMOUNT")
	public String getN_discount_amount() {
		return n_discount_amount;
	}

	public void setN_discount_amount(String n_discount_amount) {
		this.n_discount_amount = n_discount_amount;
	}

	@XmlElement(name = "N_ADD_TAX_PRM")
	public String getN_add_tax_prm() {
		return n_add_tax_prm;
	}

	public void setN_add_tax_prm(String n_add_tax_prm) {
		this.n_add_tax_prm = n_add_tax_prm;
	}

	@XmlElement(name = "N_EXCL_TAX_PRM")
	public String getN_excl_tax_prm() {
		return n_excl_tax_prm;
	}

	public void setN_excl_tax_prm(String n_excl_tax_prm) {
		this.n_excl_tax_prm = n_excl_tax_prm;
	}

	@XmlElement(name = "N_TOTAL_PRM")
	public String getN_total_prm() {
		return n_total_prm;
	}

	public void setN_total_prm(String n_total_prm) {
		this.n_total_prm = n_total_prm;
	}

	@XmlElement(name = "N_AMT")
	public String getN_amt() {
		return n_amt;
	}

	public void setN_amt(String n_amt) {
		this.n_amt = n_amt;
	}

	@XmlElement(name = "N_PRM")
	public String getN_prm() {
		return n_prm;
	}

	public void setN_prm(String n_prm) {
		this.n_prm = n_prm;
	}

	@XmlElement(name = "N_TOTAL_COEF")
	public String getN_total_coef() {
		return n_total_coef;
	}

	public void setN_total_coef(String n_total_coef) {
		this.n_total_coef = n_total_coef;
	}

	@XmlElement(name = "N_TARGET_PRM")
	public String getN_target_prm() {
		return n_target_prm;
	}

	public void setN_target_prm(String n_target_prm) {
		this.n_target_prm = n_target_prm;
	}

	@XmlElement(name = "N_RISK_COST")
	public String getN_risk_cost() {
		return n_risk_cost;
	}

	public void setN_risk_cost(String n_risk_cost) {
		this.n_risk_cost = n_risk_cost;
	}

	@XmlElement(name = "C_APP_NO")
	public String getC_app_no() {
		return c_app_no;
	}

	public void setC_app_no(String c_app_no) {
		this.c_app_no = c_app_no;
	}

	@XmlElement(name = "C_OFFER_NO")
	public String getC_offer_no() {
		return c_offer_no;
	}

	public void setC_offer_no(String c_offer_no) {
		this.c_offer_no = c_offer_no;
	}

	@XmlElement(name = "C_QRY_CDE")
	public String getC_qry_cde() {
		return c_qry_cde;
	}

	public void setC_qry_cde(String c_qry_cde) {
		this.c_qry_cde = c_qry_cde;
	}

	@XmlElement(name = "T_ISSUE_TM")
	public String getT_issue_tm() {
		return t_issue_tm;
	}

	public void setT_issue_tm(String t_issue_tm) {
		this.t_issue_tm = t_issue_tm;
	}

	@XmlElement(name = "T_QRY_TM")
	public String getT_qry_tm() {
		return t_qry_tm;
	}

	public void setT_qry_tm(String t_qry_tm) {
		this.t_qry_tm = t_qry_tm;
	}

	@XmlElement(name = "C_SEARCH_NO")
	public String getC_search_no() {
		return c_search_no;
	}

	public void setC_search_no(String c_search_no) {
		this.c_search_no = c_search_no;
	}

	@XmlElement(name = "C_PLATE_NO")
	public String getC_plate_no() {
		return c_plate_no;
	}

	public void setC_plate_no(String c_plate_no) {
		this.c_plate_no = c_plate_no;
	}

	@XmlElement(name = "C_PLATE_TYP")
	public String getC_plate_typ() {
		return c_plate_typ;
	}

	public void setC_plate_typ(String c_plate_typ) {
		this.c_plate_typ = c_plate_typ;
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

	@XmlElement(name = "C_OWNER_NME")
	public String getC_owner_nme() {
		return c_owner_nme;
	}

	public void setC_owner_nme(String c_owner_nme) {
		this.c_owner_nme = c_owner_nme;
	}

	@XmlElement(name = "T_FST_REG_YM")
	public String getT_fst_reg_ym() {
		return t_fst_reg_ym;
	}

	public void setT_fst_reg_ym(String t_fst_reg_ym) {
		this.t_fst_reg_ym = t_fst_reg_ym;
	}

	@XmlElement(name = "C_EXPOLICY_BEFORE")
	public String getC_expolicy_before() {
		return c_expolicy_before;
	}

	public void setC_expolicy_before(String c_expolicy_before) {
		this.c_expolicy_before = c_expolicy_before;
	}

	@XmlElement(name = "N_EXPECT_PAYRATE")
	public String getN_expect_payrate() {
		return n_expect_payrate;
	}

	public void setN_expect_payrate(String n_expect_payrate) {
		this.n_expect_payrate = n_expect_payrate;
	}

	@XmlElement(name = "T_PAST_END_DATE")
	public String getT_past_end_date() {
		return t_past_end_date;
	}

	public void setT_past_end_date(String t_past_end_date) {
		this.t_past_end_date = t_past_end_date;
	}

	@XmlElement(name = "C_MODEL_CODE")
	public String getC_model_code() {
		return c_model_code;
	}

	public void setC_model_code(String c_model_code) {
		this.c_model_code = c_model_code;
	}

	@XmlElement(name = "C_PLY_NO")
	public String getC_ply_no() {
		return c_ply_no;
	}

	public void setC_ply_no(String c_ply_no) {
		this.c_ply_no = c_ply_no;
	}

	@XmlElement(name = "C_PROD_NO")
	public String getC_prod_no() {
		return c_prod_no;
	}

	public void setC_prod_no(String c_prod_no) {
		this.c_prod_no = c_prod_no;
	}

	public String getT_undr_tm() {
		return t_undr_tm;
	}

	public void setT_undr_tm(String t_undr_tm) {
		this.t_undr_tm = t_undr_tm;
	}

	public String getC_sale_nme() {
		return c_sale_nme;
	}

	public void setC_sale_nme(String c_sale_nme) {
		this.c_sale_nme = c_sale_nme;
	}

}
