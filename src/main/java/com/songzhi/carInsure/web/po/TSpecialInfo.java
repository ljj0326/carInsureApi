package com.songzhi.carInsure.web.po;

import java.io.Serializable;

public class TSpecialInfo implements Serializable {
    private Integer siId;

    private Integer orderId;

    private String siSpecliCode;

    private String siSpecliInfo;

    private Integer siSpecliType;

    private String siStr;

    private static final long serialVersionUID = 1L;

    public Integer getSiId() {
        return siId;
    }

    public void setSiId(Integer siId) {
        this.siId = siId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getSiSpecliCode() {
        return siSpecliCode;
    }

    public void setSiSpecliCode(String siSpecliCode) {
        this.siSpecliCode = siSpecliCode == null ? null : siSpecliCode.trim();
    }

    public String getSiSpecliInfo() {
        return siSpecliInfo;
    }

    public void setSiSpecliInfo(String siSpecliInfo) {
        this.siSpecliInfo = siSpecliInfo == null ? null : siSpecliInfo.trim();
    }

    public Integer getSiSpecliType() {
        return siSpecliType;
    }

    public void setSiSpecliType(Integer siSpecliType) {
        this.siSpecliType = siSpecliType;
    }

    public String getSiStr() {
        return siStr;
    }

    public void setSiStr(String siStr) {
        this.siStr = siStr == null ? null : siStr.trim();
    }
}