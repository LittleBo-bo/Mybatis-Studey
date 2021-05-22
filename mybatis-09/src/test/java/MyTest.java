import com.cb.dao.StudentMapper;
import com.cb.dao.TeacherMapper;
import com.cb.pojo.Student;
import com.cb.pojo.Teacher;
import com.cb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest
{
  @Test
    public void test(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
    Teacher teacher = mapper.getTeacher(1);
    System.out.println(teacher);
    sqlSession.close();
  }

  @Test
  public void test2(){
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
    Teacher teacher = mapper.getTeacher2(1);
    System.out.println(teacher);
    sqlSession.close();
  }

}
