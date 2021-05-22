import com.cb.dao.UserDao;
import com.cb.pojo.User;
import com.cb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User userByID = mapper.getUserByID(1);
        System.out.println(userByID);
        sqlSession.close();
    }
}
