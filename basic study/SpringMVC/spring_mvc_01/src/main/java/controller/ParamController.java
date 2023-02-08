package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ParamController {

    @RequestMapping("/param/ServletAPI")
    public String getParam01(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+ " " + password);
        return "success";
    }

    @RequestMapping("/param1")
    public String getParam02(String username,String password){
        System.out.println(username+ " " + password);
        return "success";
    }

    @RequestMapping("/param2")
    public String getParam03(@RequestParam(value = "userName",required = false,defaultValue = "hello")String username,
                             String password){
        System.out.println(username+ " " + password);
        return "success";
    }

    @RequestMapping("/param3")
    public String getParam04(@RequestHeader("referer") String referer){
        System.out.println("referer: " + referer);
        return "success";
    }

    @RequestMapping("/param")
    public String getParam05(@CookieValue("JSESSIONID") String jsessionId){
        System.out.println("Cookie: " + jsessionId);
        return "success";
    }

    @RequestMapping("/param/pojo")
    public String getParam06(User user){
        System.out.println(user);
        return "success";
    }


}
