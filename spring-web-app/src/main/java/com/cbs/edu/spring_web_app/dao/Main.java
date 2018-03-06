package com.cbs.edu.spring_web_app.dao;

import com.cbs.edu.spring_web_app.config.DatabaseConfig;
import com.cbs.edu.spring_web_app.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
        Employee employee = new Employee(1, "Yevhenii", "Deineka", 25, 1_000_000);
        employeeDao.upsert(employee);
    }
}