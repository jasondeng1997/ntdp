package com.xiangkai.cfms.service.impl;

import com.xiangkai.cfms.dao.EntranceRegionMapper;
import com.xiangkai.cfms.entity.EntranceRegion;
import com.xiangkai.cfms.service.EntranceRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntranceRegionServiceImpl implements EntranceRegionService {

    @Autowired
    private EntranceRegionMapper entranceRegionMapper;
    public List<EntranceRegion> selectEntranceRegionList(){
        return entranceRegionMapper.selectEntranceRegionList();
    }
}
