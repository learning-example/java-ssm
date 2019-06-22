package com.aihu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testNoUser(){
        String real = testRestTemplate.getForObject("/aihu/user_info/openid/1",String.class);
        Assert.assertEquals(null,real);
    }

    @Test
    public void testOneUser(){
        testCgi_UserInfo("shenzhen", "/aihu/user_info/openid/10001");
        testCgi_UserInfo("beijing", "/aihu/user_info/openid/10002");
    }

    private void testCgi_UserInfo(String excp, String cgi){
        String resp = testRestTemplate.getForObject(cgi, String.class);
        JSONObject jObj = JSON.parseObject(resp);
        String real = (String)jObj.get("city");
        Assert.assertEquals(excp,real);
    }

}