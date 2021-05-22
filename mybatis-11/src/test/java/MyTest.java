import com.cb.dao.UserMapper;
import com.cb.pojo.User;
import com.cb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);

        sqlSession.close();

        //mapper.updateUser(new User(2,"李洽","222222"));
        //手动清理缓存
        sqlSession.clearCache();
        System.out.println("======================");
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);

        System.out.println(user==user2);
        sqlSession2.close();

    }
}
