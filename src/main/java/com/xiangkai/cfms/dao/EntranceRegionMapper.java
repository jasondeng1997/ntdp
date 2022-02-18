package com.xiangkai.cfms.dao;

import com.xiangkai.cfms.entity.EntranceRegion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EntranceRegionMapper {

    List<EntranceRegion> selectEntranceRegionList();

}
