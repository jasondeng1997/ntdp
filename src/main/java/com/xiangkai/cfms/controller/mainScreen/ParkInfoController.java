package com.xiangkai.cfms.controller.mainScreen;


import com.xiangkai.cfms.common.Result;
import com.xiangkai.cfms.common.ResultUtil;
import com.xiangkai.cfms.entity.CompanyInfo;
import com.xiangkai.cfms.entity.ParkInfo;
import com.xiangkai.cfms.service.ParkInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "园区情况表")
@RestController
@RequestMapping("main/parkInfo")
public class ParkInfoController {

    @Autowired
    private ParkInfoService parkInfoService;

    @PostMapping("/info")
    @ApiOperation(value = "园区情况表\n" +
            "保存园区基础信息" ,response = ParkInfo.class)
    public Result<Object> ParkInfo() {

        return ResultUtil.success(parkInfoService.selectParkInfo());
    }

}
