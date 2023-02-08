import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface dynamic {
    List<Emp> getEmpByCondition(Emp emp);
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
