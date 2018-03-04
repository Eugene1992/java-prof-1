package com.cbs.edu.spring_idol.factory_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factory-method-context.xml");
        Stage stage = context.getBean("stage", Stage.class);
        System.out.println(stage);
    }
}
