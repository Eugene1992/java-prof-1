package com.cbs.edu.spring_web_app.controller;

import com.cbs.edu.spring_web_app.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(@ModelAttribute Employee employee) {
        System.out.println(employee);
        return "hello";
    }
}
