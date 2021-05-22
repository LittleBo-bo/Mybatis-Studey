package com.cb.dao;

import com.cb.pojo.User;
import com.cb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserDaoTest {
  static Logger logger = Logger.getLogger(UserDaoTest.class);
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


    @Test
    public void  testLog4j(){
       logger.info("info:进入了testlog4j！！");
       logger.debug("debug:进入了testlog4j！！");
       logger.error("erroe:进入了testlog4j！！");
    }

    @Test
    public  void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

}
