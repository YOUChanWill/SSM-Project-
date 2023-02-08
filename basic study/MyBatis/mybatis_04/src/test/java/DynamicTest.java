import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.SqlSessionUtils;

import java.util.Arrays;
import java.util.List;

public class DynamicTest {
    @Test
    public void Test(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        dynamic mapper = sqlSession.getMapper(dynamic.class);
        Emp emp = new Emp(null,"",null,"");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }

    @Test
    public void TestForeach(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        dynamic mapper = sqlSession.getMapper(dynamic.class);
        Emp emp1 = new Emp(null,"小明1",20,"男");
        Emp emp2 = new Emp(null,"小明1",20,"男");
        Emp emp3 = new Emp(null,"小明1",20,"男");
        List<Emp> list1 = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(list1);
    }

    @Test
    public void TestForeach2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        dynamic mapper = sqlSession.getMapper(dynamic.class);
        Integer[] empIds = new Integer[]{6,7};
        mapper.deleteMoreEmp(empIds);
    }

}
