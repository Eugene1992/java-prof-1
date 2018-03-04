package com.cbs.edu.spring_idol.bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Ticket firstTicket = context.getBean("ticket", Ticket.class);
        Ticket secondTicket = context.getBean("ticket", Ticket.class);

        System.out.println(firstTicket == secondTicket);
    }
}
