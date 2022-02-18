package com.xiangkai.cfms.controller.mainScreen;

import com.xiangkai.cfms.common.Result;
import com.xiangkai.cfms.common.ResultUtil;
import com.xiangkai.cfms.entity.CompanyInfo;
import com.xiangkai.cfms.service.CompanyInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**

 *
 * @author
 *
 */
@Api(tags = "园区企业情况")
@RestController
@RequestMapping("main/companyInfo")
public class ParkCompanyController {
    @Autowired
    private CompanyInfoService companyInfoService;

    @PostMapping("/info")
    @ApiOperation(value = "企业信息表\n" +
            "保存企业人员、车辆等统计信息" ,response = CompanyInfo.class)
    public Result<Object> companyInfo() {

        return ResultUtil.success(companyInfoService.selectCompanyInfo());
    }


}


