package com.xiangkai.cfms.controller.mainScreen;

import com.xiangkai.cfms.common.Result;
import com.xiangkai.cfms.common.ResultUtil;
import com.xiangkai.cfms.entity.CompanyInfo;
import com.xiangkai.cfms.entity.EntranceRegion;
import com.xiangkai.cfms.service.EntranceRegionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "园区企业情况")
@RestController
@RequestMapping("main/entranceRegion")
public class ParkEntranceController {

    @Autowired
    private EntranceRegionService entranceRegionService;

    @PostMapping("/list")
    @ApiOperation(value = "园区出入列表" ,response = EntranceRegion.class)
    public Result<Object> list() {

        return ResultUtil.success(entranceRegionService.selectEntranceRegionList());
    }


}
