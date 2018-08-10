package com.songzhi.carInsure.service.vo.request;

import javax.xml.bind.annotation.XmlElement;

/**
 * 车型查询接口请求报文基本信息
 * 
 *
 */
public class RequestBasePart {
	
	//机构代码
	private String c_dpt_cde;
	
	//产品代码
	private String c_prod_no;
	
	//业务来源
	private String c_bsns_type;
	
	//操作员
	private String c_opr_cde= "";
	
	private String c_opr_nme;
	
	private String operId = "";
	
	private String operName= "";
	
	private String seqBuidingOper;
	
	private String paySequnce;
	
	/**
	 * 投保单号
	 */
	private String cAppNo;
	
	/**
	 * 产品号
	 */
	private String cProdNo;
	
	/**
	 * 订单号
	 */
	private String cOrderNo;
	
	/**
	 * 投保查询码
	 */
	private String cQryCde;
	
	/**
	 * 投保预确认码
	 */
	private String cConfirmCde;
	
	/**
	 * 系统标志
	 */
	private String cSystemFlag;
	
	/**
	 * 网销销售渠道
	 */
	private String saleChannel;
	
	/**
	 * 网银服务费比例
	 */
	private String serviceCostRatio;
	
	/**
	 * 网银服务费金额
	 */
	private String serviceCostAmt;
	
	@XmlElement(name = "C_APP_NO")
	public String getcAppNo() {
		return cAppNo;
	}

	public void setcAppNo(String cAppNo) {
		this.cAppNo = cAppNo;
	}
	
	@XmlElement(name = "C_PROD_NO")
	public String getcProdNo() {
		return cProdNo;
	}

	public void setcProdNo(String cProdNo) {
		this.cProdNo = cProdNo;
	}

	public String getC_opr_nme() {
		return c_opr_nme;
	}

	public void setC_opr_nme(String c_opr_nme) {
		this.c_opr_nme = c_opr_nme;
	}

	@XmlElement(name = "C_PAY_SEQUENCE")
	public String getPaySequnce() {
		return paySequnce;
	}

	public void setPaySequnce(String paySequnce) {
		this.paySequnce = paySequnce;
	}

	@XmlElement(name = "C_SEQ_BUIDING_OPER")
	public String getSeqBuidingOper() {
		return seqBuidingOper;
	}

	public void setSeqBuidingOper(String seqBuidingOper) {
		this.seqBuidingOper = seqBuidingOper;
	}

	@XmlElement(name = "C_OPER_ID")
	public String getOperId() {
		return operId;
	}

	public void setOperId(String operId) {
		this.operId = operId;
	}

	@XmlElement(name = "C_OPER_NME")
	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}
	
	@XmlElement(name = "C_DPT_CDE")
	public String getC_dpt_cde() {
		return c_dpt_cde;
	}

	public void setC_dpt_cde(String c_dpt_cde) {
		this.c_dpt_cde = c_dpt_cde;
	}

	@XmlElement(name = "C_PROD_NO")
	public String getC_prod_no() {
		return c_prod_no;
	}

	public void setC_prod_no(String c_prod_no) {
		this.c_prod_no = c_prod_no;
	}

	@XmlElement(name = "C_BSNS_TYP")
	public String getC_bsns_type() {
		return c_bsns_type;
	}

	public void setC_bsns_type(String c_bsns_type) {
		this.c_bsns_type = c_bsns_type;
	}

	@XmlElement(name = "C_OPR_CDE")
	public String getC_opr_cde() {
		return c_opr_cde;
	}

	public void setC_opr_cde(String c_opr_cde) {
		this.c_opr_cde = c_opr_cde;
	}
	
	// payment
	
	@XmlElement(name = "C_ORDER_NO")
	public String getcOrderNo() {
		return cOrderNo;
	}

	public void setcOrderNo(String cOrderNo) {
		this.cOrderNo = cOrderNo;
	}

	@XmlElement(name = "C_QRY_CDE")
	public String getcQryCde() {
		return cQryCde;
	}

	public void setcQryCde(String cQryCde) {
		this.cQryCde = cQryCde;
	}

	@XmlElement(name = "C_CONFIRM_CDE")
	public String getcConfirmCde() {
		return cConfirmCde;
	}

	public void setcConfirmCde(String cConfirmCde) {
		this.cConfirmCde = cConfirmCde;
	}

	@XmlElement(name = "C_SYSTEM_FLAG")
	public String getcSystemFlag() {
		return cSystemFlag;
	}

	public void setcSystemFlag(String cSystemFlag) {
		this.cSystemFlag = cSystemFlag;
	}

	@XmlElement(name = "SALE_CHANNEL")
	public String getSaleChannel() {
		return saleChannel;
	}

	public void setSaleChannel(String saleChannel) {
		this.saleChannel = saleChannel;
	}

	@XmlElement(name = "SERVICE_COST_RATIO")
	public String getServiceCostRatio() {
		return serviceCostRatio;
	}

	public void setServiceCostRatio(String serviceCostRatio) {
		this.serviceCostRatio = serviceCostRatio;
	}

	@XmlElement(name = "SERVICE_COST_AMT")
	public String getServiceCostAmt() {
		return serviceCostAmt;
	}

	public void setServiceCostAmt(String serviceCostAmt) {
		this.serviceCostAmt = serviceCostAmt;
	}
	
}
