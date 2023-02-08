package chanwill.controller;

import chanwill.pojo.User;
import chanwill.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // 查询所有员工信息
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(Model model){
        List<User> list = userService.getAll();
        model.addAttribute("list",list);
        return "user_list";
    }

    // 查询所有员工分页信息
    @RequestMapping(value = "/user/page/{pageNum}",method = RequestMethod.GET)
    public String getPageUser(@PathVariable("pageNum") Integer pageNum,Model model){
        PageInfo<User> page = userService.getPageNum(pageNum);
        model.addAttribute("page",page);
        return "user_list";
    }
}
