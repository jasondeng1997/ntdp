package com.xiangkai.cfms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@ApiModel("园区情况表\n" +
        "保存园区基础信息")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ParkInfo {

    @ApiModelProperty("面积")
    private Integer area;

    @ApiModelProperty("周界")
    private Integer perimeter;

    @ApiModelProperty("园区企业数量")
    private Integer companyNum;

    @ApiModelProperty("园区承包商数量")
    private Integer contractorNum;

    @ApiModelProperty("园区员工数量")
    private Integer employeeNum;

    @ApiModelProperty("园区车辆数量")
    private Integer vehicleNum;

    @ApiModelProperty("重大危险源数量")
    private Integer dangerousNum;

    @ApiModelProperty("重点监管危化品数量")
    private Integer chemicalNum;

    @ApiModelProperty("重点监管危险工艺数量")
    private Integer technologyNum;

    @ApiModelProperty("0：无效 1：有效（default）")
    private Integer valid;

    @ApiModelProperty("生成时间")
    private Date createTime;

}
