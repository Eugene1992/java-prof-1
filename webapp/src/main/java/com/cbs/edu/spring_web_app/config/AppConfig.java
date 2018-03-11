package com.cbs.edu.spring_web_app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.cbs.edu.spring_web_app")
public class AppConfig {

    /* Equivalent xml config:
        <beans>
            <context:component-scan base-package="com.cbs.edu.com.cbs.edu.spring_web_app" /> // @ComponentScan
        </beans>
    */
}
