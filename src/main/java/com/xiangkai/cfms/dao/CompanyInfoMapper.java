package com.xiangkai.cfms.dao;


import com.xiangkai.cfms.entity.CompanyInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyInfoMapper {

    CompanyInfo selectCompanyInfo();
}
