package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView testMav(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("testRequestScope","Hello,ModelAndView");
        modelAndView.setViewName("login");
        return modelAndView;

    }

    @RequestMapping("/test/model")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","Hello,Model");
        return "login";
    }

    @RequestMapping("/test/modelmap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope","Hello,ModelMap");
        return "login";
    }

    @RequestMapping("/test/map")
    public String testMap(Map<String,Object> map){
        map.put("testRequestScope","Hello,ModelMap");
        return "login";
    }

    @RequestMapping("/test/session")
    public String testSession(HttpSession session){
        session.setAttribute("sessionScope","session");
        return "login";
    }

    @RequestMapping("/test/application")
    public String testApplication(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("applicationScope","application");
        return "login";
    }

}
