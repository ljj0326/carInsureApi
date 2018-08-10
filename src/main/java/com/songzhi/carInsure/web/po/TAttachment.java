package com.songzhi.carInsure.web.po;

import java.io.Serializable;
import java.util.Date;

public class TAttachment implements Serializable {
    private Integer id;

    private Integer sourceNum;

    private Integer sourceId;

    private String sourceName;

    private String destName;

    private String destUrl;

    private Date createTime;

    private String creater;

    private Integer isDelete;

    private Integer comeType;

    private Integer comeOrder;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSourceNum() {
        return sourceNum;
    }

    public void setSourceNum(Integer sourceNum) {
        this.sourceNum = sourceNum;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName == null ? null : destName.trim();
    }

    public String getDestUrl() {
        return destUrl;
    }

    public void setDestUrl(String destUrl) {
        this.destUrl = destUrl == null ? null : destUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getComeType() {
        return comeType;
    }

    public void setComeType(Integer comeType) {
        this.comeType = comeType;
    }

    public Integer getComeOrder() {
        return comeOrder;
    }

    public void setComeOrder(Integer comeOrder) {
        this.comeOrder = comeOrder;
    }
}