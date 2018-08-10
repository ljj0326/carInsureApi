package com.songzhi.carInsure.web.po;

import java.io.Serializable;
import java.util.Date;

public class TCar implements Serializable {
    private Integer id;

    private Integer orderId;

    private String carNo;

    private String vin;

    private String engineNo;

    private String cPlateTypeCode;

    private String cPlateType;

    private Date tFstRegYm;

    private String cUsageCdeCode;

    private String cUsageCde;

    private String cOpenCdeCode;

    private String cOpenCde;

    private String cCarTypeCode;

    private String cCarType;

    private String cRefineCode;

    private String cRefine;

    private String cDriTypCode;

    private String cDriTyp;

    private String cModelName;

    private String fChinaName;

    private String cChinaName;

    private String nPower;

    private Date cMadeTime;

    private Date cGiveTime;

    private String gRoadAway;

    private Date cFromTime;

    private Date cStartTime;

    private String cUseYear;

    private String nDisplacement;

    private String nPoWeight;

    private String nTonage;

    private String nLimitLoadPerson;

    private String cNewPurchaseValue;

    private String nActualValue;

    private String nDiscusUseval;

    private String cChooseTypeCode;

    private String cChooseType;

    private String cFuelTypeCode;

    private String cFuelType;

    private Integer cProdPlace;

    private Integer cRepay;

    private String cPayYears;

    private String cTransferMrk;

    private Integer isChecked;

    private String checker;

    private Date checkTime;

    private Date transferTime;

    private String cArgumentDeal;

    private Integer isNeedCheck;

    private String courtName;

    private String cPersonalMark;

    private String cFleetMrk;

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

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo == null ? null : engineNo.trim();
    }

    public String getcPlateTypeCode() {
        return cPlateTypeCode;
    }

    public void setcPlateTypeCode(String cPlateTypeCode) {
        this.cPlateTypeCode = cPlateTypeCode == null ? null : cPlateTypeCode.trim();
    }

    public String getcPlateType() {
        return cPlateType;
    }

    public void setcPlateType(String cPlateType) {
        this.cPlateType = cPlateType == null ? null : cPlateType.trim();
    }

    public Date gettFstRegYm() {
        return tFstRegYm;
    }

    public void settFstRegYm(Date tFstRegYm) {
        this.tFstRegYm = tFstRegYm;
    }

    public String getcUsageCdeCode() {
        return cUsageCdeCode;
    }

    public void setcUsageCdeCode(String cUsageCdeCode) {
        this.cUsageCdeCode = cUsageCdeCode == null ? null : cUsageCdeCode.trim();
    }

    public String getcUsageCde() {
        return cUsageCde;
    }

    public void setcUsageCde(String cUsageCde) {
        this.cUsageCde = cUsageCde == null ? null : cUsageCde.trim();
    }

    public String getcOpenCdeCode() {
        return cOpenCdeCode;
    }

    public void setcOpenCdeCode(String cOpenCdeCode) {
        this.cOpenCdeCode = cOpenCdeCode == null ? null : cOpenCdeCode.trim();
    }

    public String getcOpenCde() {
        return cOpenCde;
    }

    public void setcOpenCde(String cOpenCde) {
        this.cOpenCde = cOpenCde == null ? null : cOpenCde.trim();
    }

    public String getcCarTypeCode() {
        return cCarTypeCode;
    }

    public void setcCarTypeCode(String cCarTypeCode) {
        this.cCarTypeCode = cCarTypeCode == null ? null : cCarTypeCode.trim();
    }

    public String getcCarType() {
        return cCarType;
    }

    public void setcCarType(String cCarType) {
        this.cCarType = cCarType == null ? null : cCarType.trim();
    }

    public String getcRefineCode() {
        return cRefineCode;
    }

    public void setcRefineCode(String cRefineCode) {
        this.cRefineCode = cRefineCode == null ? null : cRefineCode.trim();
    }

    public String getcRefine() {
        return cRefine;
    }

    public void setcRefine(String cRefine) {
        this.cRefine = cRefine == null ? null : cRefine.trim();
    }

    public String getcDriTypCode() {
        return cDriTypCode;
    }

    public void setcDriTypCode(String cDriTypCode) {
        this.cDriTypCode = cDriTypCode == null ? null : cDriTypCode.trim();
    }

    public String getcDriTyp() {
        return cDriTyp;
    }

    public void setcDriTyp(String cDriTyp) {
        this.cDriTyp = cDriTyp == null ? null : cDriTyp.trim();
    }

    public String getcModelName() {
        return cModelName;
    }

    public void setcModelName(String cModelName) {
        this.cModelName = cModelName == null ? null : cModelName.trim();
    }

    public String getfChinaName() {
        return fChinaName;
    }

    public void setfChinaName(String fChinaName) {
        this.fChinaName = fChinaName == null ? null : fChinaName.trim();
    }

    public String getcChinaName() {
        return cChinaName;
    }

    public void setcChinaName(String cChinaName) {
        this.cChinaName = cChinaName == null ? null : cChinaName.trim();
    }

    public String getnPower() {
        return nPower;
    }

    public void setnPower(String nPower) {
        this.nPower = nPower == null ? null : nPower.trim();
    }

    public Date getcMadeTime() {
        return cMadeTime;
    }

    public void setcMadeTime(Date cMadeTime) {
        this.cMadeTime = cMadeTime;
    }

    public Date getcGiveTime() {
        return cGiveTime;
    }

    public void setcGiveTime(Date cGiveTime) {
        this.cGiveTime = cGiveTime;
    }

    public String getgRoadAway() {
        return gRoadAway;
    }

    public void setgRoadAway(String gRoadAway) {
        this.gRoadAway = gRoadAway == null ? null : gRoadAway.trim();
    }

    public Date getcFromTime() {
        return cFromTime;
    }

    public void setcFromTime(Date cFromTime) {
        this.cFromTime = cFromTime;
    }

    public Date getcStartTime() {
        return cStartTime;
    }

    public void setcStartTime(Date cStartTime) {
        this.cStartTime = cStartTime;
    }

    public String getcUseYear() {
        return cUseYear;
    }

    public void setcUseYear(String cUseYear) {
        this.cUseYear = cUseYear == null ? null : cUseYear.trim();
    }

    public String getnDisplacement() {
        return nDisplacement;
    }

    public void setnDisplacement(String nDisplacement) {
        this.nDisplacement = nDisplacement == null ? null : nDisplacement.trim();
    }

    public String getnPoWeight() {
        return nPoWeight;
    }

    public void setnPoWeight(String nPoWeight) {
        this.nPoWeight = nPoWeight == null ? null : nPoWeight.trim();
    }

    public String getnTonage() {
        return nTonage;
    }

    public void setnTonage(String nTonage) {
        this.nTonage = nTonage == null ? null : nTonage.trim();
    }

    public String getnLimitLoadPerson() {
        return nLimitLoadPerson;
    }

    public void setnLimitLoadPerson(String nLimitLoadPerson) {
        this.nLimitLoadPerson = nLimitLoadPerson == null ? null : nLimitLoadPerson.trim();
    }

    public String getcNewPurchaseValue() {
        return cNewPurchaseValue;
    }

    public void setcNewPurchaseValue(String cNewPurchaseValue) {
        this.cNewPurchaseValue = cNewPurchaseValue == null ? null : cNewPurchaseValue.trim();
    }

    public String getnActualValue() {
        return nActualValue;
    }

    public void setnActualValue(String nActualValue) {
        this.nActualValue = nActualValue == null ? null : nActualValue.trim();
    }

    public String getnDiscusUseval() {
        return nDiscusUseval;
    }

    public void setnDiscusUseval(String nDiscusUseval) {
        this.nDiscusUseval = nDiscusUseval == null ? null : nDiscusUseval.trim();
    }

    public String getcChooseTypeCode() {
        return cChooseTypeCode;
    }

    public void setcChooseTypeCode(String cChooseTypeCode) {
        this.cChooseTypeCode = cChooseTypeCode == null ? null : cChooseTypeCode.trim();
    }

    public String getcChooseType() {
        return cChooseType;
    }

    public void setcChooseType(String cChooseType) {
        this.cChooseType = cChooseType == null ? null : cChooseType.trim();
    }

    public String getcFuelTypeCode() {
        return cFuelTypeCode;
    }

    public void setcFuelTypeCode(String cFuelTypeCode) {
        this.cFuelTypeCode = cFuelTypeCode == null ? null : cFuelTypeCode.trim();
    }

    public String getcFuelType() {
        return cFuelType;
    }

    public void setcFuelType(String cFuelType) {
        this.cFuelType = cFuelType == null ? null : cFuelType.trim();
    }

    public Integer getcProdPlace() {
        return cProdPlace;
    }

    public void setcProdPlace(Integer cProdPlace) {
        this.cProdPlace = cProdPlace;
    }

    public Integer getcRepay() {
        return cRepay;
    }

    public void setcRepay(Integer cRepay) {
        this.cRepay = cRepay;
    }

    public String getcPayYears() {
        return cPayYears;
    }

    public void setcPayYears(String cPayYears) {
        this.cPayYears = cPayYears == null ? null : cPayYears.trim();
    }

    public String getcTransferMrk() {
        return cTransferMrk;
    }

    public void setcTransferMrk(String cTransferMrk) {
        this.cTransferMrk = cTransferMrk == null ? null : cTransferMrk.trim();
    }

    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }

    public String getcArgumentDeal() {
        return cArgumentDeal;
    }

    public void setcArgumentDeal(String cArgumentDeal) {
        this.cArgumentDeal = cArgumentDeal == null ? null : cArgumentDeal.trim();
    }

    public Integer getIsNeedCheck() {
        return isNeedCheck;
    }

    public void setIsNeedCheck(Integer isNeedCheck) {
        this.isNeedCheck = isNeedCheck;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName == null ? null : courtName.trim();
    }

    public String getcPersonalMark() {
        return cPersonalMark;
    }

    public void setcPersonalMark(String cPersonalMark) {
        this.cPersonalMark = cPersonalMark == null ? null : cPersonalMark.trim();
    }

    public String getcFleetMrk() {
        return cFleetMrk;
    }

    public void setcFleetMrk(String cFleetMrk) {
        this.cFleetMrk = cFleetMrk == null ? null : cFleetMrk.trim();
    }
}