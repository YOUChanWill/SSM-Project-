package mybatis.mapper;

import mybatis.pojo.User1;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    User1 getUsername(@Param("id") int age);

    List<User1> getAllUser();

    Integer getCount();

    Map<String,Object> getUserByAgeToMap(@Param("id") int age);

//    List<Map<String,Object>> getAllUserToMap();
    @MapKey("age")
    Map<String,Object> getAllUserToMap();


}
