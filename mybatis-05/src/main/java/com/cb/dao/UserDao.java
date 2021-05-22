package com.cb.dao;

import com.cb.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {

    //方法存在多个参数，所有参数前面必须加上@Param（）注解
    @Select("select * from user where id = #{id}")
    User getUserByID(int i);

}
