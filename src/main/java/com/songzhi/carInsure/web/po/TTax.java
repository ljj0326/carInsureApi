package com.songzhi.carInsure.web.po;

import java.io.Serializable;
import java.util.Date;

public class TTax implements Serializable {
    private Integer id;

    private Integer orderId;

    private String taxVsTaxMrkCode;

    private String taxVsTaxMrk;

    private String taxPaytaxTypCode;

    private String taxPaytaxTyp;

    private Integer isCutTax;

    private String taxNTaxableMonths;

    private String taxCTaxable1Amt;

    private String taxPreviousTaxYear;

    private String taxNExhaustCapacity;

    private String taxCCurbWt;

    private String taxCutReasonCode;

    private String taxCutReason;

    private String taxVsTaxToolCode;

    private String taxVsTaxTool;

    private String abateProp;

    private String taxTaxfree;

    private String taxTaxcertno2;

    private String taxItemCode;

    private String taxItem;

    private Date taxTBillDate;

    private Integer taxTaxpayerId;

    private String taxTaxpayerCertTypCode;

    private String taxTaxpayerCertTyp;

    private Integer taxTaxpayerCertNum;

    private String taxTaxpayerName;

    private String taxTaxpayerAddr;

    private Integer taxTaxPaymentRecptNum;

    private String taxNOverdueAmt;

    private String taxNLastyeart;

    private String taxNtaxableAnt;

    private String cTaxOrgNolocalCode;

    private String cTaxOrgNolocal;

    private String taxTaxAuthorities;

    private Double taxTotalTaxes;

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

    public String getTaxVsTaxMrkCode() {
        return taxVsTaxMrkCode;
    }

    public void setTaxVsTaxMrkCode(String taxVsTaxMrkCode) {
        this.taxVsTaxMrkCode = taxVsTaxMrkCode == null ? null : taxVsTaxMrkCode.trim();
    }

    public String getTaxVsTaxMrk() {
        return taxVsTaxMrk;
    }

    public void setTaxVsTaxMrk(String taxVsTaxMrk) {
        this.taxVsTaxMrk = taxVsTaxMrk == null ? null : taxVsTaxMrk.trim();
    }

    public String getTaxPaytaxTypCode() {
        return taxPaytaxTypCode;
    }

    public void setTaxPaytaxTypCode(String taxPaytaxTypCode) {
        this.taxPaytaxTypCode = taxPaytaxTypCode == null ? null : taxPaytaxTypCode.trim();
    }

    public String getTaxPaytaxTyp() {
        return taxPaytaxTyp;
    }

    public void setTaxPaytaxTyp(String taxPaytaxTyp) {
        this.taxPaytaxTyp = taxPaytaxTyp == null ? null : taxPaytaxTyp.trim();
    }

    public Integer getIsCutTax() {
        return isCutTax;
    }

    public void setIsCutTax(Integer isCutTax) {
        this.isCutTax = isCutTax;
    }

    public String getTaxNTaxableMonths() {
        return taxNTaxableMonths;
    }

    public void setTaxNTaxableMonths(String taxNTaxableMonths) {
        this.taxNTaxableMonths = taxNTaxableMonths == null ? null : taxNTaxableMonths.trim();
    }

    public String getTaxCTaxable1Amt() {
        return taxCTaxable1Amt;
    }

    public void setTaxCTaxable1Amt(String taxCTaxable1Amt) {
        this.taxCTaxable1Amt = taxCTaxable1Amt == null ? null : taxCTaxable1Amt.trim();
    }

    public String getTaxPreviousTaxYear() {
        return taxPreviousTaxYear;
    }

    public void setTaxPreviousTaxYear(String taxPreviousTaxYear) {
        this.taxPreviousTaxYear = taxPreviousTaxYear == null ? null : taxPreviousTaxYear.trim();
    }

    public String getTaxNExhaustCapacity() {
        return taxNExhaustCapacity;
    }

    public void setTaxNExhaustCapacity(String taxNExhaustCapacity) {
        this.taxNExhaustCapacity = taxNExhaustCapacity == null ? null : taxNExhaustCapacity.trim();
    }

    public String getTaxCCurbWt() {
        return taxCCurbWt;
    }

    public void setTaxCCurbWt(String taxCCurbWt) {
        this.taxCCurbWt = taxCCurbWt == null ? null : taxCCurbWt.trim();
    }

    public String getTaxCutReasonCode() {
        return taxCutReasonCode;
    }

    public void setTaxCutReasonCode(String taxCutReasonCode) {
        this.taxCutReasonCode = taxCutReasonCode == null ? null : taxCutReasonCode.trim();
    }

    public String getTaxCutReason() {
        return taxCutReason;
    }

    public void setTaxCutReason(String taxCutReason) {
        this.taxCutReason = taxCutReason == null ? null : taxCutReason.trim();
    }

    public String getTaxVsTaxToolCode() {
        return taxVsTaxToolCode;
    }

    public void setTaxVsTaxToolCode(String taxVsTaxToolCode) {
        this.taxVsTaxToolCode = taxVsTaxToolCode == null ? null : taxVsTaxToolCode.trim();
    }

    public String getTaxVsTaxTool() {
        return taxVsTaxTool;
    }

    public void setTaxVsTaxTool(String taxVsTaxTool) {
        this.taxVsTaxTool = taxVsTaxTool == null ? null : taxVsTaxTool.trim();
    }

    public String getAbateProp() {
        return abateProp;
    }

    public void setAbateProp(String abateProp) {
        this.abateProp = abateProp == null ? null : abateProp.trim();
    }

    public String getTaxTaxfree() {
        return taxTaxfree;
    }

    public void setTaxTaxfree(String taxTaxfree) {
        this.taxTaxfree = taxTaxfree == null ? null : taxTaxfree.trim();
    }

    public String getTaxTaxcertno2() {
        return taxTaxcertno2;
    }

    public void setTaxTaxcertno2(String taxTaxcertno2) {
        this.taxTaxcertno2 = taxTaxcertno2 == null ? null : taxTaxcertno2.trim();
    }

    public String getTaxItemCode() {
        return taxItemCode;
    }

    public void setTaxItemCode(String taxItemCode) {
        this.taxItemCode = taxItemCode == null ? null : taxItemCode.trim();
    }

    public String getTaxItem() {
        return taxItem;
    }

    public void setTaxItem(String taxItem) {
        this.taxItem = taxItem == null ? null : taxItem.trim();
    }

    public Date getTaxTBillDate() {
        return taxTBillDate;
    }

    public void setTaxTBillDate(Date taxTBillDate) {
        this.taxTBillDate = taxTBillDate;
    }

    public Integer getTaxTaxpayerId() {
        return taxTaxpayerId;
    }

    public void setTaxTaxpayerId(Integer taxTaxpayerId) {
        this.taxTaxpayerId = taxTaxpayerId;
    }

    public String getTaxTaxpayerCertTypCode() {
        return taxTaxpayerCertTypCode;
    }

    public void setTaxTaxpayerCertTypCode(String taxTaxpayerCertTypCode) {
        this.taxTaxpayerCertTypCode = taxTaxpayerCertTypCode == null ? null : taxTaxpayerCertTypCode.trim();
    }

    public String getTaxTaxpayerCertTyp() {
        return taxTaxpayerCertTyp;
    }

    public void setTaxTaxpayerCertTyp(String taxTaxpayerCertTyp) {
        this.taxTaxpayerCertTyp = taxTaxpayerCertTyp == null ? null : taxTaxpayerCertTyp.trim();
    }

    public Integer getTaxTaxpayerCertNum() {
        return taxTaxpayerCertNum;
    }

    public void setTaxTaxpayerCertNum(Integer taxTaxpayerCertNum) {
        this.taxTaxpayerCertNum = taxTaxpayerCertNum;
    }

    public String getTaxTaxpayerName() {
        return taxTaxpayerName;
    }

    public void setTaxTaxpayerName(String taxTaxpayerName) {
        this.taxTaxpayerName = taxTaxpayerName == null ? null : taxTaxpayerName.trim();
    }

    public String getTaxTaxpayerAddr() {
        return taxTaxpayerAddr;
    }

    public void setTaxTaxpayerAddr(String taxTaxpayerAddr) {
        this.taxTaxpayerAddr = taxTaxpayerAddr == null ? null : taxTaxpayerAddr.trim();
    }

    public Integer getTaxTaxPaymentRecptNum() {
        return taxTaxPaymentRecptNum;
    }

    public void setTaxTaxPaymentRecptNum(Integer taxTaxPaymentRecptNum) {
        this.taxTaxPaymentRecptNum = taxTaxPaymentRecptNum;
    }

    public String getTaxNOverdueAmt() {
        return taxNOverdueAmt;
    }

    public void setTaxNOverdueAmt(String taxNOverdueAmt) {
        this.taxNOverdueAmt = taxNOverdueAmt == null ? null : taxNOverdueAmt.trim();
    }

    public String getTaxNLastyeart() {
        return taxNLastyeart;
    }

    public void setTaxNLastyeart(String taxNLastyeart) {
        this.taxNLastyeart = taxNLastyeart == null ? null : taxNLastyeart.trim();
    }

    public String getTaxNtaxableAnt() {
        return taxNtaxableAnt;
    }

    public void setTaxNtaxableAnt(String taxNtaxableAnt) {
        this.taxNtaxableAnt = taxNtaxableAnt == null ? null : taxNtaxableAnt.trim();
    }

    public String getcTaxOrgNolocalCode() {
        return cTaxOrgNolocalCode;
    }

    public void setcTaxOrgNolocalCode(String cTaxOrgNolocalCode) {
        this.cTaxOrgNolocalCode = cTaxOrgNolocalCode == null ? null : cTaxOrgNolocalCode.trim();
    }

    public String getcTaxOrgNolocal() {
        return cTaxOrgNolocal;
    }

    public void setcTaxOrgNolocal(String cTaxOrgNolocal) {
        this.cTaxOrgNolocal = cTaxOrgNolocal == null ? null : cTaxOrgNolocal.trim();
    }

    public String getTaxTaxAuthorities() {
        return taxTaxAuthorities;
    }

    public void setTaxTaxAuthorities(String taxTaxAuthorities) {
        this.taxTaxAuthorities = taxTaxAuthorities == null ? null : taxTaxAuthorities.trim();
    }

    public Double getTaxTotalTaxes() {
        return taxTotalTaxes;
    }

    public void setTaxTotalTaxes(Double taxTotalTaxes) {
        this.taxTotalTaxes = taxTotalTaxes;
    }
}