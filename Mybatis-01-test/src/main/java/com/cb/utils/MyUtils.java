package com.cb.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyUtils {


    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static SqlSession getSqlSession() {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            return sqlSession;
        }
}
