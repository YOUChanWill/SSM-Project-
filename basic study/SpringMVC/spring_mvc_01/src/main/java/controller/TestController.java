package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = {"/hello","/abc"},
            method = {RequestMethod.POST,RequestMethod.GET},
            params = {"username","!password","age=20","gender!=0"})
    public String Hello(){

        return "success";
    }

    @RequestMapping("/a?a/test/ant")
    public String Ant(){
        return "success";
    }

    @RequestMapping("/test/rest/{id}/{username}")
    public String Rest(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("id: " + id + " " + "username: " + username);
        return "success";
    }
}
