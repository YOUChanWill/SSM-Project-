package controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/") // 请求映射
    public String protal(){

        return "index";// 将逻辑视图返回，去掉视图前缀和视图后缀
    }


}
