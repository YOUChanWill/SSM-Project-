package mybatis.test;

import mybatis.mapper.SpecialSQLMapper;
import mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SpecialSQLTest {

    @Test
    public void testSpecialSQL(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<Map<String, Object>> list = mapper.getUserByLike("E");
        System.out.println(list);
    }

    @Test
    public void testDeleteMoreUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.DeleteMoreUser("1,2");
    }
}
