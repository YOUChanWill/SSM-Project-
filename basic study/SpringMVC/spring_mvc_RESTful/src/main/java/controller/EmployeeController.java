package controller;

import dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.Employee;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmp(Model model){
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("all",all);
        return "emp_list";
    }

    @RequestMapping(value = "/toAdd")
    public String toAdd(){
        return "emp_add";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String addEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";// 重定向，浏览器重新访问该地址
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);
        return "emp_update";//
    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public String updateEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";// 重定向，浏览器重新访问该地址
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id,Model model){
        employeeDao.delete(id);
        return "redirect:/employee";
    }

}
