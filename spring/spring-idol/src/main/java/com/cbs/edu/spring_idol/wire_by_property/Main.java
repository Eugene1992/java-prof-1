package com.cbs.edu.spring_idol.wire_by_property;

import com.cbs.edu.spring_idol.PerformanceException;
import com.cbs.edu.spring_idol.factory_method.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("wire-by-property.xml");
        Instrumentalist instrumentalist = context.getBean("kenny", Instrumentalist.class);
        instrumentalist.perform();
    }
}
