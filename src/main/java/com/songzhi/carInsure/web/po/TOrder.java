package com.songzhi.carInsure.web.po;

import java.io.Serializable;
import java.util.Date;

public class TOrder implements Serializable {
    private Integer id;

    private String includId;

    private String issueCode;

    private String issue;

    private String trenchCode;

    private String trench;

    private String businessCode;

    private String business;

    private String serviceCode;

    private String service;

    private String salesmanCode;

    private String salesman;

    private String catalogueCode;

    private String catalogue;

    private String agencyCode;

    private String agency;

    private String chezhuName;

    private String chenzhuCardCode;

    private String credentialsType;

    private String credentials;

    private String chezhuPhone;

    private String chezhuCode;

    private String chezhuCar;

    private String customerCode;

    private String customer;

    private String chezhuAgeCode;

    private String chezhuAge;

    private String chezhuSexCode;

    private String chezhuSex;

    private String chezhuPostcode;

    private String chezhuLocation;

    private String chezhuEmali;

    private String insureName;

    private String voucherCode;

    private String credentialsClass;

    private String credentialsPhone;

    private String relationPhone;

    private String fillingApplicationCode;

    private String insureNature;

    private String insureAgeCode;

    private String insureAge;

    private String insureSexCode;

    private String insureSex;

    private String insurePostcode;

    private String insureLocation;

    private String insureEmali;

    private String ownerName;

    private String credentialsCode;

    private String cardClass;

    private String cardPhone;

    private String ownerPhone;

    private String nameNatureCode;

    private String personNature;

    private String ownerAgeCode;

    private String ownerAge;

    private String ownerSexCode;

    private String ownerSex;

    private String ownerPostcode;

    private String ownerLocation;

    private String ownerEmali;

    private String businessInsure;

    private String businessSlip;

    private Date businessTime;

    private Date businessJieTime;

    private Double businessMoney;

    private String strongBao;

    private String strongDan;

    private Date strongTime;

    private Date moneyJiaoqiangTime;

    private Double moneyJiaoqiang;

    private Double boatsTallage;

    private Double rate;

    private Double sumCoefficient;

    private Double communicationTreatment;

    private Double transportationCoefficient;

    private Double underwritingProduct;

    private Double underwritingCoefficient;

    private Double ditchCoefficient;

    private Double fPriceShang;

    private Double fPriceJiao;

    private Double moneyHe;

    private Integer dianSlip;

    private Integer dianTicket;

    private String dianEmali;

    private Integer signBao;

    private String swNumber;

    private Integer orderStatus;

    private Integer payment;

    private String pfoNumber;

    private Integer paymentStatus;

    private Integer refundableStatus;

    private Date paymentTime;

    private Date refundableTime;

    private String createUser;

    private Date createTime;

    private String modifiedUser;

    private Date modifiedTime;

    private String carNo;

    private String vin;

    private String engineNo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIncludId() {
        return includId;
    }

    public void setIncludId(String includId) {
        this.includId = includId == null ? null : includId.trim();
    }

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode == null ? null : issueCode.trim();
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public String getTrenchCode() {
        return trenchCode;
    }

    public void setTrenchCode(String trenchCode) {
        this.trenchCode = trenchCode == null ? null : trenchCode.trim();
    }

    public String getTrench() {
        return trench;
    }

    public void setTrench(String trench) {
        this.trench = trench == null ? null : trench.trim();
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    public String getSalesmanCode() {
        return salesmanCode;
    }

    public void setSalesmanCode(String salesmanCode) {
        this.salesmanCode = salesmanCode == null ? null : salesmanCode.trim();
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman == null ? null : salesman.trim();
    }

    public String getCatalogueCode() {
        return catalogueCode;
    }

    public void setCatalogueCode(String catalogueCode) {
        this.catalogueCode = catalogueCode == null ? null : catalogueCode.trim();
    }

    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue == null ? null : catalogue.trim();
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode == null ? null : agencyCode.trim();
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency == null ? null : agency.trim();
    }

    public String getChezhuName() {
        return chezhuName;
    }

    public void setChezhuName(String chezhuName) {
        this.chezhuName = chezhuName == null ? null : chezhuName.trim();
    }

    public String getChenzhuCardCode() {
        return chenzhuCardCode;
    }

    public void setChenzhuCardCode(String chenzhuCardCode) {
        this.chenzhuCardCode = chenzhuCardCode == null ? null : chenzhuCardCode.trim();
    }

    public String getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(String credentialsType) {
        this.credentialsType = credentialsType == null ? null : credentialsType.trim();
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials == null ? null : credentials.trim();
    }

    public String getChezhuPhone() {
        return chezhuPhone;
    }

    public void setChezhuPhone(String chezhuPhone) {
        this.chezhuPhone = chezhuPhone == null ? null : chezhuPhone.trim();
    }

    public String getChezhuCode() {
        return chezhuCode;
    }

    public void setChezhuCode(String chezhuCode) {
        this.chezhuCode = chezhuCode == null ? null : chezhuCode.trim();
    }

    public String getChezhuCar() {
        return chezhuCar;
    }

    public void setChezhuCar(String chezhuCar) {
        this.chezhuCar = chezhuCar == null ? null : chezhuCar.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getChezhuAgeCode() {
        return chezhuAgeCode;
    }

    public void setChezhuAgeCode(String chezhuAgeCode) {
        this.chezhuAgeCode = chezhuAgeCode == null ? null : chezhuAgeCode.trim();
    }

    public String getChezhuAge() {
        return chezhuAge;
    }

    public void setChezhuAge(String chezhuAge) {
        this.chezhuAge = chezhuAge == null ? null : chezhuAge.trim();
    }

    public String getChezhuSexCode() {
        return chezhuSexCode;
    }

    public void setChezhuSexCode(String chezhuSexCode) {
        this.chezhuSexCode = chezhuSexCode == null ? null : chezhuSexCode.trim();
    }

    public String getChezhuSex() {
        return chezhuSex;
    }

    public void setChezhuSex(String chezhuSex) {
        this.chezhuSex = chezhuSex == null ? null : chezhuSex.trim();
    }

    public String getChezhuPostcode() {
        return chezhuPostcode;
    }

    public void setChezhuPostcode(String chezhuPostcode) {
        this.chezhuPostcode = chezhuPostcode == null ? null : chezhuPostcode.trim();
    }

    public String getChezhuLocation() {
        return chezhuLocation;
    }

    public void setChezhuLocation(String chezhuLocation) {
        this.chezhuLocation = chezhuLocation == null ? null : chezhuLocation.trim();
    }

    public String getChezhuEmali() {
        return chezhuEmali;
    }

    public void setChezhuEmali(String chezhuEmali) {
        this.chezhuEmali = chezhuEmali == null ? null : chezhuEmali.trim();
    }

    public String getInsureName() {
        return insureName;
    }

    public void setInsureName(String insureName) {
        this.insureName = insureName == null ? null : insureName.trim();
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode == null ? null : voucherCode.trim();
    }

    public String getCredentialsClass() {
        return credentialsClass;
    }

    public void setCredentialsClass(String credentialsClass) {
        this.credentialsClass = credentialsClass == null ? null : credentialsClass.trim();
    }

    public String getCredentialsPhone() {
        return credentialsPhone;
    }

    public void setCredentialsPhone(String credentialsPhone) {
        this.credentialsPhone = credentialsPhone == null ? null : credentialsPhone.trim();
    }

    public String getRelationPhone() {
        return relationPhone;
    }

    public void setRelationPhone(String relationPhone) {
        this.relationPhone = relationPhone == null ? null : relationPhone.trim();
    }

    public String getFillingApplicationCode() {
        return fillingApplicationCode;
    }

    public void setFillingApplicationCode(String fillingApplicationCode) {
        this.fillingApplicationCode = fillingApplicationCode == null ? null : fillingApplicationCode.trim();
    }

    public String getInsureNature() {
        return insureNature;
    }

    public void setInsureNature(String insureNature) {
        this.insureNature = insureNature == null ? null : insureNature.trim();
    }

    public String getInsureAgeCode() {
        return insureAgeCode;
    }

    public void setInsureAgeCode(String insureAgeCode) {
        this.insureAgeCode = insureAgeCode == null ? null : insureAgeCode.trim();
    }

    public String getInsureAge() {
        return insureAge;
    }

    public void setInsureAge(String insureAge) {
        this.insureAge = insureAge == null ? null : insureAge.trim();
    }

    public String getInsureSexCode() {
        return insureSexCode;
    }

    public void setInsureSexCode(String insureSexCode) {
        this.insureSexCode = insureSexCode == null ? null : insureSexCode.trim();
    }

    public String getInsureSex() {
        return insureSex;
    }

    public void setInsureSex(String insureSex) {
        this.insureSex = insureSex == null ? null : insureSex.trim();
    }

    public String getInsurePostcode() {
        return insurePostcode;
    }

    public void setInsurePostcode(String insurePostcode) {
        this.insurePostcode = insurePostcode == null ? null : insurePostcode.trim();
    }

    public String getInsureLocation() {
        return insureLocation;
    }

    public void setInsureLocation(String insureLocation) {
        this.insureLocation = insureLocation == null ? null : insureLocation.trim();
    }

    public String getInsureEmali() {
        return insureEmali;
    }

    public void setInsureEmali(String insureEmali) {
        this.insureEmali = insureEmali == null ? null : insureEmali.trim();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    public String getCredentialsCode() {
        return credentialsCode;
    }

    public void setCredentialsCode(String credentialsCode) {
        this.credentialsCode = credentialsCode == null ? null : credentialsCode.trim();
    }

    public String getCardClass() {
        return cardClass;
    }

    public void setCardClass(String cardClass) {
        this.cardClass = cardClass == null ? null : cardClass.trim();
    }

    public String getCardPhone() {
        return cardPhone;
    }

    public void setCardPhone(String cardPhone) {
        this.cardPhone = cardPhone == null ? null : cardPhone.trim();
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone == null ? null : ownerPhone.trim();
    }

    public String getNameNatureCode() {
        return nameNatureCode;
    }

    public void setNameNatureCode(String nameNatureCode) {
        this.nameNatureCode = nameNatureCode == null ? null : nameNatureCode.trim();
    }

    public String getPersonNature() {
        return personNature;
    }

    public void setPersonNature(String personNature) {
        this.personNature = personNature == null ? null : personNature.trim();
    }

    public String getOwnerAgeCode() {
        return ownerAgeCode;
    }

    public void setOwnerAgeCode(String ownerAgeCode) {
        this.ownerAgeCode = ownerAgeCode == null ? null : ownerAgeCode.trim();
    }

    public String getOwnerAge() {
        return ownerAge;
    }

    public void setOwnerAge(String ownerAge) {
        this.ownerAge = ownerAge == null ? null : ownerAge.trim();
    }

    public String getOwnerSexCode() {
        return ownerSexCode;
    }

    public void setOwnerSexCode(String ownerSexCode) {
        this.ownerSexCode = ownerSexCode == null ? null : ownerSexCode.trim();
    }

    public String getOwnerSex() {
        return ownerSex;
    }

    public void setOwnerSex(String ownerSex) {
        this.ownerSex = ownerSex == null ? null : ownerSex.trim();
    }

    public String getOwnerPostcode() {
        return ownerPostcode;
    }

    public void setOwnerPostcode(String ownerPostcode) {
        this.ownerPostcode = ownerPostcode == null ? null : ownerPostcode.trim();
    }

    public String getOwnerLocation() {
        return ownerLocation;
    }

    public void setOwnerLocation(String ownerLocation) {
        this.ownerLocation = ownerLocation == null ? null : ownerLocation.trim();
    }

    public String getOwnerEmali() {
        return ownerEmali;
    }

    public void setOwnerEmali(String ownerEmali) {
        this.ownerEmali = ownerEmali == null ? null : ownerEmali.trim();
    }

    public String getBusinessInsure() {
        return businessInsure;
    }

    public void setBusinessInsure(String businessInsure) {
        this.businessInsure = businessInsure == null ? null : businessInsure.trim();
    }

    public String getBusinessSlip() {
        return businessSlip;
    }

    public void setBusinessSlip(String businessSlip) {
        this.businessSlip = businessSlip == null ? null : businessSlip.trim();
    }

    public Date getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(Date businessTime) {
        this.businessTime = businessTime;
    }

    public Date getBusinessJieTime() {
        return businessJieTime;
    }

    public void setBusinessJieTime(Date businessJieTime) {
        this.businessJieTime = businessJieTime;
    }

    public Double getBusinessMoney() {
        return businessMoney;
    }

    public void setBusinessMoney(Double businessMoney) {
        this.businessMoney = businessMoney;
    }

    public String getStrongBao() {
        return strongBao;
    }

    public void setStrongBao(String strongBao) {
        this.strongBao = strongBao == null ? null : strongBao.trim();
    }

    public String getStrongDan() {
        return strongDan;
    }

    public void setStrongDan(String strongDan) {
        this.strongDan = strongDan == null ? null : strongDan.trim();
    }

    public Date getStrongTime() {
        return strongTime;
    }

    public void setStrongTime(Date strongTime) {
        this.strongTime = strongTime;
    }

    public Date getMoneyJiaoqiangTime() {
        return moneyJiaoqiangTime;
    }

    public void setMoneyJiaoqiangTime(Date moneyJiaoqiangTime) {
        this.moneyJiaoqiangTime = moneyJiaoqiangTime;
    }

    public Double getMoneyJiaoqiang() {
        return moneyJiaoqiang;
    }

    public void setMoneyJiaoqiang(Double moneyJiaoqiang) {
        this.moneyJiaoqiang = moneyJiaoqiang;
    }

    public Double getBoatsTallage() {
        return boatsTallage;
    }

    public void setBoatsTallage(Double boatsTallage) {
        this.boatsTallage = boatsTallage;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getSumCoefficient() {
        return sumCoefficient;
    }

    public void setSumCoefficient(Double sumCoefficient) {
        this.sumCoefficient = sumCoefficient;
    }

    public Double getCommunicationTreatment() {
        return communicationTreatment;
    }

    public void setCommunicationTreatment(Double communicationTreatment) {
        this.communicationTreatment = communicationTreatment;
    }

    public Double getTransportationCoefficient() {
        return transportationCoefficient;
    }

    public void setTransportationCoefficient(Double transportationCoefficient) {
        this.transportationCoefficient = transportationCoefficient;
    }

    public Double getUnderwritingProduct() {
        return underwritingProduct;
    }

    public void setUnderwritingProduct(Double underwritingProduct) {
        this.underwritingProduct = underwritingProduct;
    }

    public Double getUnderwritingCoefficient() {
        return underwritingCoefficient;
    }

    public void setUnderwritingCoefficient(Double underwritingCoefficient) {
        this.underwritingCoefficient = underwritingCoefficient;
    }

    public Double getDitchCoefficient() {
        return ditchCoefficient;
    }

    public void setDitchCoefficient(Double ditchCoefficient) {
        this.ditchCoefficient = ditchCoefficient;
    }

    public Double getfPriceShang() {
        return fPriceShang;
    }

    public void setfPriceShang(Double fPriceShang) {
        this.fPriceShang = fPriceShang;
    }

    public Double getfPriceJiao() {
        return fPriceJiao;
    }

    public void setfPriceJiao(Double fPriceJiao) {
        this.fPriceJiao = fPriceJiao;
    }

    public Double getMoneyHe() {
        return moneyHe;
    }

    public void setMoneyHe(Double moneyHe) {
        this.moneyHe = moneyHe;
    }

    public Integer getDianSlip() {
        return dianSlip;
    }

    public void setDianSlip(Integer dianSlip) {
        this.dianSlip = dianSlip;
    }

    public Integer getDianTicket() {
        return dianTicket;
    }

    public void setDianTicket(Integer dianTicket) {
        this.dianTicket = dianTicket;
    }

    public String getDianEmali() {
        return dianEmali;
    }

    public void setDianEmali(String dianEmali) {
        this.dianEmali = dianEmali == null ? null : dianEmali.trim();
    }

    public Integer getSignBao() {
        return signBao;
    }

    public void setSignBao(Integer signBao) {
        this.signBao = signBao;
    }

    public String getSwNumber() {
        return swNumber;
    }

    public void setSwNumber(String swNumber) {
        this.swNumber = swNumber == null ? null : swNumber.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getPfoNumber() {
        return pfoNumber;
    }

    public void setPfoNumber(String pfoNumber) {
        this.pfoNumber = pfoNumber == null ? null : pfoNumber.trim();
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getRefundableStatus() {
        return refundableStatus;
    }

    public void setRefundableStatus(Integer refundableStatus) {
        this.refundableStatus = refundableStatus;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getRefundableTime() {
        return refundableTime;
    }

    public void setRefundableTime(Date refundableTime) {
        this.refundableTime = refundableTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser == null ? null : modifiedUser.trim();
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
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
}