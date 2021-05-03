package com.zzh.education.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zzh.education.dao.UserLoginDao;
import com.zzh.education.pojo.User;
import com.zzh.education.service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userLoginServiceImpl implements IUserLoginService {

    @Autowired
    UserLoginDao userLoginDao;
    @Override
    public JSONObject userLogin(User user) {
        JSONObject jsonObject = new JSONObject();
        User selectUser = userLoginDao.selectByUserName(user.getUserName());
        if (selectUser == null){
            jsonObject.put("success","false");
            jsonObject.put("message","用户名不存在");
        }else {
            if (selectUser.getPassword().equals(user.getPassword())){
                jsonObject.put("success","true");
                jsonObject.put("message","登录成功！");
            }else{
                jsonObject.put("success","false");
                jsonObject.put("message","密码错误！");
            }
        }
        return jsonObject;
    }

    @Override
    public JSONObject userRegister(User user) {
        JSONObject jsonObject = new JSONObject();
        if (user.getUserName() == null || user.getPassword() == null){
            jsonObject.put("success","false");
            jsonObject.put("message","账号或密码不能为空！");
        }
        User selectUser = userLoginDao.selectByUserName(user.getUserName());
        if (selectUser != null){
            jsonObject.put("success","false");
            jsonObject.put("message","用户已存在！");
        }else {
            int insert = userLoginDao.insert(user);
            if (insert == 1){
                jsonObject.put("success","true");
                jsonObject.put("message","注册成功！");
            }else {
                jsonObject.put("success","false");
                jsonObject.put("message","注册失败，请重试");
            }
        }
        return jsonObject;
    }
}
