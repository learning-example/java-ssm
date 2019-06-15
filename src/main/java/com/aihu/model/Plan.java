package com.aihu.model;

import java.util.Date;

public class Plan {
    private Integer planId;

    private String planName;

    private String compCol;

    private String rtxName;

    private Date createTime;

    private Date updateTime;

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    public String getCompCol() {
        return compCol;
    }

    public void setCompCol(String compCol) {
        this.compCol = compCol == null ? null : compCol.trim();
    }

    public String getRtxName() {
        return rtxName;
    }

    public void setRtxName(String rtxName) {
        this.rtxName = rtxName == null ? null : rtxName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}