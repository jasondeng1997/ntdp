package com.xiangkai.cfms.dto.basic;

import java.io.Serializable;
import java.util.Date;

public class FactoryDTO implements Serializable {
    private Integer id;

    private String factoryName;

    private String address;

    private String linkName;

    private String linkEmail;

    private String linkTel;

    private Short calcAttribute;

    private Short deleteFlag;

    private Date gmtCreate;

    private Date gmtModified;

    private String calcAttributeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public Short getCalcAttribute() {
        return calcAttribute;
    }

    public void setCalcAttribute(Short calcAttribute) {
        this.calcAttribute = calcAttribute;
    }

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getCalcAttributeName() {
        return calcAttributeName;
    }

    public void setCalcAttributeName(String calcAttributeName) {
        this.calcAttributeName = calcAttributeName;
    }
}
