package com.xiangkai.cfms.service.impl;

import com.xiangkai.cfms.dao.CompanyInfoMapper;
import com.xiangkai.cfms.entity.CompanyInfo;
import com.xiangkai.cfms.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Override
    public CompanyInfo selectCompanyInfo(){
        return companyInfoMapper.selectCompanyInfo();
    }
}
