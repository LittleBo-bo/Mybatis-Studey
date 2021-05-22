package com.cb.dao;

import com.cb.pojo.User;
import com.cb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void  getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById(1);  //密码为空
        System.out.println(user);

        sqlSession.close();
    }
    //解决方法
    //类型处理器
    // select * from mybatis.user where id = #{id}
    // select id,name,pwd as password from mybatis.user where id = #{id}


}
