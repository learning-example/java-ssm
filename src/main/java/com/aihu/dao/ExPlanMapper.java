package com.aihu.dao;

import com.aihu.model.Plan;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ExPlanMapper {
    Plan selectOne(int id);
}