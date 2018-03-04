package com.cbs.edu.spring_idol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringIdolApp {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\yede0517\\BECHTLE\\java-prof-1\\spring\\spring-idol\\src\\main\\resources\\context.xml");
        Performer duke = context.getBean("duke", Juggler.class);
        duke.perform();

        Performer poeticDuke = context.getBean("poeticDuke", PoeticJuggler.class);
        poeticDuke.perform();
    }
}
