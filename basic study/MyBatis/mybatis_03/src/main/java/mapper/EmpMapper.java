package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Emp;

public interface EmpMapper {

    Emp getEmpByEmpId(@Param("empId") Integer empId);

    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);
}
