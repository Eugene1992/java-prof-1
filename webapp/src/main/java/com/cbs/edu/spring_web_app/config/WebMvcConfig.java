package com.cbs.edu.spring_web_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class WebMvcConfig {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setViewClass(JstlView.class);
        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
        internalResourceViewResolver.setSuffix(".jsp");

        return internalResourceViewResolver;
    }

    /* Equivalent xml config:
        <beans>
            <mvc:annotation-driven /> // @EnableWebMvc

            <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
                <property name="prefix">
                    <value>/WEB-INF/views/</value>
                </property>
                <property name="suffix">
                    <value>.jsp</value>
                </property>
            </bean>
        </beans>
    */
}
