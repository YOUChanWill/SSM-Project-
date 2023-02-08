package chanwill.service;

import chanwill.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    List<User> getAll();

    PageInfo<User> getPageNum(Integer pageNum);
}
