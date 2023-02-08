package chanwill.service.impl;

import chanwill.mapper.UserMapper;
import chanwill.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import chanwill.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public PageInfo<User> getPageNum(Integer pageNum) {
        PageHelper.startPage(pageNum,4);
        List<User> list = userMapper.getAll();
        PageInfo<User> page = new PageInfo<>(list,5);
        return page;
    }
}
