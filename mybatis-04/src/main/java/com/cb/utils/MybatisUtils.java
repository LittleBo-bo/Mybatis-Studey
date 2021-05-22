package com.cb.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//sqlSessionFactory -->sqlSession
public class MybatisUtils {

    private static  SqlSessionFactory sqlSessionFactory;
    static {

        try {
            //使用mybatis第一步，获取sqlSessionFactorry对象
            String resource = "mybatis-config.xml";
            InputStream inputStream= Resources.getResourceAsStream(resource);
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //既然有了SqlSessionFactory， 顾名思义，我们就可以从中获得SqlSession的实例了
    //SqlSession 完全包含了面向数据库执行sql命令所需的方法

    public  static SqlSession getSqlSession(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return  sqlSession;
        //return sqlSessionFactory.openSession();
    }
}
