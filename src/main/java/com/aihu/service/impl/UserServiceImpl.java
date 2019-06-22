package com.aihu.service.impl;

import com.aihu.dao.UserInfoMapper;
import com.aihu.model.UserInfo;
import com.aihu.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserInfoMapper userMapper;

    public String selectOne(int id){
        UserInfo user = userMapper.selectOne(id);
        if (user != null){
            return JSON.toJSONString(user);
        }
        return "";
    }

}
