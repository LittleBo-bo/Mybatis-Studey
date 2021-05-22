import com.cb.dao.blogMapper;
import com.cb.pojo.blog;
import com.cb.utils.Myutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void findALL(){
        SqlSession sqlsession = Myutils.getSqlsession();
        blogMapper mapper = sqlsession.getMapper(blogMapper.class);
        List<blog> all = mapper.findALL();
        for (blog blog : all) {
            System.out.println(blog);
        }
        sqlsession.close();
    }

    @Test
    public void update(){
        SqlSession sqlsession = Myutils.getSqlsession();
        blogMapper mapper = sqlsession.getMapper(blogMapper.class);
        HashMap map = new HashMap<>();
        map.put("title","阿凡达");
        map.put("author","陈博");
        map.put("id","2");
        mapper.update(map);
        sqlsession.close();
    }

}
