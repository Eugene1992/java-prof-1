package com.cbs.edu.spring_web_app.controller;

import com.cbs.edu.spring_web_app.entity.Employee;
import com.cbs.edu.spring_web_app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private EmployeeService employeeService;

    @Autowired
    public MainController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView main(ModelAndView modelAndView,
                             @RequestParam(value = "id", required = false) Integer id,
                             @RequestParam(value = "action", required = false) String action) {
        modelAndView.setViewName("main");
        final List<Employee> employees = employeeService.getAllEmployees();
        if (action != null && !action.isEmpty()) {
            if (action.equals("update")) {
                modelAndView.addObject("updEmployee", employees.get(id));
                modelAndView.addObject("employees", employees);
                return modelAndView;
            }
            if (action.equals("delete")) {
                employeeService.deleteEmployee(id);
                modelAndView.addObject("employees", employees);
            }
        }
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public ModelAndView createEmployee(
            /*@RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("age") Integer age,
            @RequestParam("salary") Integer salary*/
            @ModelAttribute Employee employee,
            ModelAndView modelAndView
    ) {
        Integer id = employee.getId();
        if (id != null) {
            System.out.println("!");
            employeeService.upsertEmployee(employee);
        } else {
            System.out.println("!!");
            employeeService.upsertEmployee(employee);
        }
        final List<Employee> employees = employeeService.getAllEmployees();
        System.out.println(employees);
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }
}