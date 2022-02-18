package com.xiangkai.cfms.dao;


import com.xiangkai.cfms.entity.ParkInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ParkInfoMapper {

    ParkInfo selectParkInfo();
}
