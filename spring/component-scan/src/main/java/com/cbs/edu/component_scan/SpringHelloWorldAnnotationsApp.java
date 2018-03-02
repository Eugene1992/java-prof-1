package com.cbs.edu.component_scan;

import com.cbs.edu.component_scan.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHelloWorldAnnotationsApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        MessageRenderer messageRenderer = (MessageRenderer) applicationContext.getBean("consoleMessageRenderer");
        messageRenderer.render();
    }
}
