package com.cb.dao;

import com.cb.pojo.User;

import java.util.List;

public interface UserDao {

    //根据ID查询用户
    User getUserById(int id);

}
