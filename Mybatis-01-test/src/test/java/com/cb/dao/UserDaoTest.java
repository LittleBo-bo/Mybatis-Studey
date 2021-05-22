package com.cb.dao;

import com.cb.pojo.Book;
import com.cb.utils.MyUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void  test(){
        SqlSession sqlSession = MyUtils.getSqlSession();
        BookDao mapper = sqlSession.getMapper(BookDao.class);
        List<Book> all = mapper.getAll();
        for (Book book : all) {
            System.out.println(book);
        }
        sqlSession.close();
    }
}
