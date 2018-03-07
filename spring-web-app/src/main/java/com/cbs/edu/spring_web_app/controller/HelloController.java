package com.cbs.edu.spring_web_app.controller;

import com.cbs.edu.spring_web_app.dao.spring_data_jpa.EmployeeRepository;
import com.cbs.edu.spring_web_app.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public HelloController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(@ModelAttribute Employee employee) {
        System.out.println(employee);
        return "hello";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        final Iterable<Employee> all = employeeRepository.findAll();
        for (Employee employee : all) {
            System.out.println(employee);
        }
        return "hello";
    }
}
