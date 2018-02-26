package com.cbs.edu.servlets.config_context;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyAppServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context initialized!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
