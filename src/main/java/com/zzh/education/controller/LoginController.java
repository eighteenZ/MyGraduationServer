package com.zzh.education.controller;

import com.alibaba.fastjson.JSONObject;
import com.zzh.education.pojo.User;
import com.zzh.education.service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class LoginController {

    @Autowired
    IUserLoginService userLoginService;

    @RequestMapping("/register")
    public String register(User user){
        return userLoginService.userRegister(user).toString();
    }

    @RequestMapping("/login")
    public String userLogin(User user){
        System.out.println(user);
        JSONObject jsonObject = userLoginService.userLogin(user);
        return jsonObject.toString();
    }
}
