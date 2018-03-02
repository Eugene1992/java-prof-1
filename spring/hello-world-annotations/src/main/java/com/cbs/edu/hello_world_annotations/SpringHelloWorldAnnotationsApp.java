package com.cbs.edu.hello_world_annotations;

import com.cbs.edu.hello_world_annotations.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldAnnotationsApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        MessageRenderer messageRenderer = (MessageRenderer) applicationContext.getBean("renderer");
        messageRenderer.render();
    }
}
