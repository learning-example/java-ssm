package com.aihu.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

//
//import com.aihu.model.Plan;
//import com.aihu.service.PlanService;
//import org.apache.log4j.Logger;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import javax.annotation.Resource;
//import com.alibaba.fastjson.JSON;
//
//@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
//@ContextConfiguration(locations = {"classpath:mybatis/mybatis.config.xml"})
//
//public class PlanControllerTest {
//    private static Logger logger = Logger.getLogger(PlanControllerTest.class);
//    private ApplicationContext ac = null;
//
//    @Resource
//    private PlanService planService = null;
//
//      @Before
//      public void before() {
//          ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//          planService = (PlanService) ac.getBean("planService");
//      }
//
//    @Test
//    public void test1() {
//        Plan plan = planService.selectOne(1);
//        // System.out.println(user.getUserName());
//        // logger.info("值："+user.getUserName());
//        logger.info(JSON.toJSONString(plan));
//    }
//}
@RunWith(SpringRunner.class)
//指定web环境，随机端口
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PlanControllerTest {

    //这个对象是运行在web环境的时候加载到spring容器中
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