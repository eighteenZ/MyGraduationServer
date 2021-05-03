package com.zzh.education.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzh.education.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserLoginDao extends BaseMapper<User> {

    User selectByUserName(String username);
}
