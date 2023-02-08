package mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SpecialSQLMapper {

    List<Map<String,Object>> getUserByLike(@Param("mohu") String mohu);

    void DeleteMoreUser(@Param("ids") String ids);

}
