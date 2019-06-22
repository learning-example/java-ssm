package com.aihu.controller;

import com.aihu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/aihu/user_info/openid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String GetUserInfo(@PathVariable(value = "id") int id, @RequestParam(value="session_key", defaultValue="1") int skey) {
        return userService.selectOne(id);
    }
}