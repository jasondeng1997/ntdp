package com.xiangkai.cfms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@ApiModel("园区卡口统计表")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class EntranceRegion {

    @ApiModelProperty("区域名称")
    private String regionName;

    @ApiModelProperty("卡口数量")
    private Integer entranceNum;

    @ApiModelProperty("覆盖企业数量")
    private Integer companyNum;

    @ApiModelProperty("0：无效 1：有效（default）")
    private Integer valid;

    @Column(name = "生成时间")
    private Date createTime;


}
