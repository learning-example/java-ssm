package com.aihu.service;

import com.aihu.service.impl.UserServiceImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService = new UserServiceImpl();

    @Test
    public void selectUser() throws Exception {
        verifyUserCity("shenzhen", 10001);
        verifyUserCity("beijing", 10002);
    }

    private void verifyUserCity(String excp, int id){
        JSONObject jObj = JSON.parseObject(userService.selectOne(id));
        String real = (String) jObj.get("city");
        Assert.assertEquals(excp, real);
    }

}