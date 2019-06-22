package com.aihu.service;

import com.aihu.service.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PlanServiceTest {

    @Autowired
    private PlanService planService = new UserServiceImpl();

    @Test
    public void selectPlan() throws Exception {
        String excp1 = "{\"compCol\":\"0\",\"createTime\":1533439634545,\"planId\":1,\"planName\":\"test01\",\"rtxName\":\"\",\"updateTime\":1533439634546}";
        String excp2 = "{\"compCol\":\"0\",\"createTime\":1533439685187,\"planId\":2,\"planName\":\"test01\",\"rtxName\":\"\",\"updateTime\":1533439685187}";
        String excp3 = "{\"compCol\":\"0\",\"createTime\":1533439694087,\"planId\":3,\"planName\":\"test01\",\"rtxName\":\"\",\"updateTime\":1533439694087}";
        Assert.assertEquals(excp1, planService.selectOne(1));
        Assert.assertEquals(excp2, planService.selectOne(2));
        Assert.assertEquals(excp3, planService.selectOne(3));
        Assert.assertEquals("", planService.selectOne(0));
    }

}