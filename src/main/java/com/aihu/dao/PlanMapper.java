package com.aihu.dao;

import com.aihu.model.Plan;
import org.apache.ibatis.annotations.Mapper;


public interface PlanMapper {
    int insert(Plan record);
    int insertSelective(Plan record);
}