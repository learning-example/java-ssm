package com.aihu.controller;

import com.aihu.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanController {
    @Autowired
    private PlanService planService;

    @RequestMapping("/v1/app/plan")
    @ResponseBody
    public String plan(@RequestParam(value="plan_id", defaultValue="1") int id) {
        return planService.selectOne(id);
    }
}