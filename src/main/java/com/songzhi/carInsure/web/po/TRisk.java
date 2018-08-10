package com.songzhi.carInsure.web.po;

import java.io.Serializable;

public class TRisk implements Serializable {
    private Integer id;

    private Integer orderId;

    private String riskCode;

    private String riskName;

    private Double insuranceAmount;

    private Double insuranceMoney;

    private String glassCode;

    private String glassCategory;

    private Integer seatNum;

    private Integer compensateDay;

    private Double compensateMoeny;

    private Integer chineseOther;

    private Double repairNum;

    private Integer nSeqNo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode == null ? null : riskCode.trim();
    }

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName == null ? null : riskName.trim();
    }

    public Double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(Double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public Double getInsuranceMoney() {
        return insuranceMoney;
    }

    public void setInsuranceMoney(Double insuranceMoney) {
        this.insuranceMoney = insuranceMoney;
    }

    public String getGlassCode() {
        return glassCode;
    }

    public void setGlassCode(String glassCode) {
        this.glassCode = glassCode == null ? null : glassCode.trim();
    }

    public String getGlassCategory() {
        return glassCategory;
    }

    public void setGlassCategory(String glassCategory) {
        this.glassCategory = glassCategory == null ? null : glassCategory.trim();
    }

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public Integer getCompensateDay() {
        return compensateDay;
    }

    public void setCompensateDay(Integer compensateDay) {
        this.compensateDay = compensateDay;
    }

    public Double getCompensateMoeny() {
        return compensateMoeny;
    }

    public void setCompensateMoeny(Double compensateMoeny) {
        this.compensateMoeny = compensateMoeny;
    }

    public Integer getChineseOther() {
        return chineseOther;
    }

    public void setChineseOther(Integer chineseOther) {
        this.chineseOther = chineseOther;
    }

    public Double getRepairNum() {
        return repairNum;
    }

    public void setRepairNum(Double repairNum) {
        this.repairNum = repairNum;
    }

    public Integer getnSeqNo() {
        return nSeqNo;
    }

    public void setnSeqNo(Integer nSeqNo) {
        this.nSeqNo = nSeqNo;
    }
}