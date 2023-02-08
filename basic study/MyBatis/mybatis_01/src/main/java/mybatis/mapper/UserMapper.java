package mybatis.mapper;

import mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();

    void updateUser();

    void deleteUser();

    User getUsername();

    List<User> getAllUser();
}
