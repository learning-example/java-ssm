package com.aihu.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PlanControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testNoPlan(){
        String excp = null;
        String real = testRestTemplate.getForObject("/v1/app/plan?plan_id=0",String.class);
        Assert.assertEquals(excp,real);
    }

    @Test
    public void testOnePlan(){
        String excp = "{\"compCol\":\"0\",\"createTime\":1533439634545,\"planId\":1,\"planName\":\"test01\",\"rtxName\":\"\",\"updateTime\":1533439634546}";
        String real = testRestTemplate.getForObject("/v1/app/plan?plan_id=1",String.class);
        Assert.assertEquals(excp,real);
    }

}