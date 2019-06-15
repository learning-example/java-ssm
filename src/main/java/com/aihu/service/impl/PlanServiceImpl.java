package com.aihu.service.impl;

import com.aihu.dao.ExPlanMapper;
import com.aihu.dao.PlanMapper;
import com.aihu.model.Plan;
import com.aihu.service.PlanService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlanServiceImpl implements PlanService{

    @Autowired
    private PlanMapper planMapper;
    @Autowired
    private ExPlanMapper exPlanMapper;

    public String selectOne(int id){
        Plan plan = exPlanMapper.selectOne(id);
        if (plan != null){
            System.out.println(plan.getPlanId());
            System.out.println(plan.getPlanName());
            return JSON.toJSONString(plan);
        }
        return "";
    }

}
