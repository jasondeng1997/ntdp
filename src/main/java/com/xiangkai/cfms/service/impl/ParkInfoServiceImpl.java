package com.xiangkai.cfms.service.impl;

import com.xiangkai.cfms.dao.ParkInfoMapper;
import com.xiangkai.cfms.entity.ParkInfo;
import com.xiangkai.cfms.service.ParkInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkInfoServiceImpl implements ParkInfoService {

    @Autowired
    private ParkInfoMapper parkInfoMapper;

    @Override
    public ParkInfo selectParkInfo() {
        return parkInfoMapper.selectParkInfo();
    }
}
