package com.songzhi.carInsure.web.vo.response;

import java.util.Date;
import java.util.Map;

import com.songzhi.carInsure.web.vo.request.CbizListBody;
import com.sun.tools.javac.util.List;

public class OrdBody {
	private int id;
	private String includ_id;// 暂存单
	
	private CbizBody cbizBody;// 商业险险别
	
	private Map<String,CbizListBody> cbizListBody;//// 险别明细
	

	private CbusinessBody cbusinessBody;//// 业务来源
	private CcarBody ccarBody;// 车辆信息
	private CchezhuBody cchezhuBody;// 车主信息
	private CinsureBody cinsureBody;//// 投保人信息
	private CownBody cownBody;// 被保人信息
	private CtaxBoby ctaxBoby;// 车船税信息
	private CtpfBody ctpfBody;// 交强险险别
	private List<CspecLiBody> cspecLiBody;// 特约

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInclud_id() {
		return includ_id;
	}

	public void setInclud_id(String includ_id) {
		this.includ_id = includ_id;
	}

	
	public CbizBody getCbizBody() {
		return cbizBody;
	}
	public void setCbizListBody(Map<String, CbizListBody> cbizListBody) {
		this.cbizListBody = cbizListBody;
	}
	public void setCbizBody(CbizBody cbizBody) {
		this.cbizBody = cbizBody;
	}

	

	public Map getCbizListBody() {
		return cbizListBody;
	}

	
	public CbusinessBody getCbusinessBody() {
		return cbusinessBody;
	}

	public void setCbusinessBody(CbusinessBody cbusinessBody) {
		this.cbusinessBody = cbusinessBody;
	}

	public CcarBody getCcarBody() {
		return ccarBody;
	}

	public void setCcarBody(CcarBody ccarBody) {
		this.ccarBody = ccarBody;
	}

	public CchezhuBody getCchezhuBody() {
		return cchezhuBody;
	}

	public void setCchezhuBody(CchezhuBody cchezhuBody) {
		this.cchezhuBody = cchezhuBody;
	}

	public CinsureBody getCinsureBody() {
		return cinsureBody;
	}

	public void setCinsureBody(CinsureBody cinsureBody) {
		this.cinsureBody = cinsureBody;
	}

	public CownBody getCownBody() {
		return cownBody;
	}

	public void setCownBody(CownBody cownBody) {
		this.cownBody = cownBody;
	}

	public CtaxBoby getCtaxBoby() {
		return ctaxBoby;
	}

	public void setCtaxBoby(CtaxBoby ctaxBoby) {
		this.ctaxBoby = ctaxBoby;
	}

	public CtpfBody getCtpfBody() {
		return ctpfBody;
	}

	public void setCtpfBody(CtpfBody ctpfBody) {
		this.ctpfBody = ctpfBody;
	}

	public List<CspecLiBody> getCspecLiBody() {
		return cspecLiBody;
	}

	public void setCspecLiBody(List<CspecLiBody> cspecLiBody) {
		this.cspecLiBody = cspecLiBody;
	}

}
