package com.cbs.edu.spring_idol.bean_init_destroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean-init-destroy.xml");
        Auditorium auditorium = context.getBean("auditorium", Auditorium.class);
        DefaultAuditorium defaultAuditorium = context.getBean("defaultAuditorium", DefaultAuditorium.class);

        context.close();
    }
}
