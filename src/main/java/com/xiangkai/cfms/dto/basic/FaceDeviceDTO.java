package com.xiangkai.cfms.dto.basic;

import java.io.Serializable;
import java.util.Date;

public class FaceDeviceDTO implements Serializable {
    private Integer id;

    private String deviceNo;

    private String carNo;

    private String deviceBrand;

    private String deviceType;

    private String deviceSeq;

    private Short deviceStatus;

    private Short deleteFlag;

    private Date gmtCreate;

    private Date gmtModified;

    private String deviceStatusName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceSeq() {
        return deviceSeq;
    }

    public void setDeviceSeq(String deviceSeq) {
        this.deviceSeq = deviceSeq;
    }

    public Short getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Short deviceStatus) {
        this.deviceStatus = deviceStatus;
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

    public String getDeviceStatusName() {
        return deviceStatusName;
    }

    public void setDeviceStatusName(String deviceStatusName) {
        this.deviceStatusName = deviceStatusName;
    }
}
