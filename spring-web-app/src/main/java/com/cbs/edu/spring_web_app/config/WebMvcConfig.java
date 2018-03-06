package com.cbs.edu.spring_web_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
public class WebMvcConfig {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    /* Equivalent xml config:
        <beans>
            <mvc:annotation-driven /> // @EnableWebMvc

            <bean
                class="org.springframework.web.servlet.view.InternalResourceViewResolver">
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
