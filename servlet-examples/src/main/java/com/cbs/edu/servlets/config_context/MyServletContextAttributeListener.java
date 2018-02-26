package com.cbs.edu.servlets.config_context;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {

    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Attribute has been added");
        String attributeName = servletContextAttributeEvent.getName();
        Object attributeValue = servletContextAttributeEvent.getValue();
        System.out.println("Attribute Name ::" + attributeName);
        System.out.println("Attribute Value ::" + attributeValue.toString());
    }

    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Attribute has been replaced");
        String attributeName = servletContextAttributeEvent.getName();
        Object attributeValue = servletContextAttributeEvent.getValue();
        System.out.println("Attribute Name ::" + attributeName);
        System.out.println("Attribute Value ::" + attributeValue.toString());
    }

    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Attribute has been removed");
        String attributeName = servletContextAttributeEvent.getName();
        Object attributeValue = servletContextAttributeEvent.getValue();
        System.out.println("Attribute Name ::" + attributeName);
        System.out.println("Attribute Value ::" + attributeValue.toString());
    }
}
