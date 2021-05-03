package com.zzh.education.service;

import com.alibaba.fastjson.JSONObject;
import com.zzh.education.pojo.User;

public interface IUserLoginService {

    public JSONObject userLogin(User user);

    public JSONObject userRegister(User user);
}
