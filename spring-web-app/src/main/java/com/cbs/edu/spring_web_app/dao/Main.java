package com.cbs.edu.spring_web_app.dao;

import com.cbs.edu.spring_web_app.config.AppConfig;
import com.cbs.edu.spring_web_app.config.DatabaseConfig;
import com.cbs.edu.spring_web_app.dao.spring_data_jpa.EmployeeRepository;
import com.cbs.edu.spring_web_app.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class, AppConfig.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
        Employee employee1 = new Employee("Yevhenii", "Deineka", 25, 1_000_000);
        Employee employee2 = new Employee("Yevhenii", "Deineka", 27, 1_000_000);
//        employeeDao.upsert(employee);
        EmployeeRepository repository = context.getBean(EmployeeRepository.class);
        repository.save(employee1);
        repository.save(employee2);
    }
}