package com.cbs.edu.spring_web_app.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cbs.edu.spring_web_app.config.DatabaseConfig;
import com.cbs.edu.spring_web_app.entity.Employee;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
        Employee employee = new Employee(5, "Yevhenii", "Deineka", 25, 1_000_000);
        employeeDao.upsert(employee);
    }
}