package mybatis.mapper;

import mybatis.pojo.User1;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {
    User1 getUsername(String name);

    User1 checkLogin(String name, String password);

    User1 checkLoginByMap(Map<String,Object> map);

    User1 checkLoginByParam(@Param("username") String username, @Param("password") String password);

}
