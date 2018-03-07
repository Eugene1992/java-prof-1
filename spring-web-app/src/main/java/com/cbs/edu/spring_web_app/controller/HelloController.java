package com.cbs.edu.spring_web_app.controller;

import com.cbs.edu.spring_web_app.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(@ModelAttribute Employee employee) {
        System.out.println(employee);
        return "hello";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello(ModelAndView modelAndView) {
        modelAndView.setViewName("hello");
        modelAndView.addObject("employees", Arrays.asList(
                new Employee(1, "Yevhenii", "Deineka", 25, 20000)
        ));
        return modelAndView;
    }
}
