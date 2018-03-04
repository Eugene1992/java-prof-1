package com.cbs.java.database_interaction.dao;

import com.cbs.java.database_interaction.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
//        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
        Employee employee = new Employee(1, "Yevhenii", "Deineka", 25, 1_000_000);
        employeeDao.upsert(employee);
    }
}