package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/thymeleaf")
    public String thyemleaf(){
        return "login";
    }

    @RequestMapping("/resource")
    public String ResourceView(){
        return "forward:/test/model";
    }

    @RequestMapping("/redirect")
    public String RedirectView(){
        return "redirect:/test/model";
    }




}
