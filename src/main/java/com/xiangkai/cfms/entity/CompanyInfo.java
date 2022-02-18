package com.xiangkai.cfms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("企业信息")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class CompanyInfo {

    @ApiModelProperty("企业code")
    @Column(name = "company_code")
    private String companyCode;

    @ApiModelProperty("企业名")
    @Column(name = "company_name")
    private String companyName;

    @Column(name = "address")
    @ApiModelProperty("地址")
    private String address;

    @Column(name = "normal_park")
    private Integer normalPark;

    @Column(name = "chem_park")
    private Integer chemPark;

    @Column(name = "employee_num")
    private Integer employeeNum;

    @Column(name = "employee_pass_num")
    private Integer employeePassNum;

    @Column(name = "vehicle_num")
    private Integer vehicleNum;

    @Column(name = "vehicle_pass_num")
    private Integer vehiclePassNum;

    @Column(name = "valid")
    private Integer valid;

    /**
     * 时间
     */
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
