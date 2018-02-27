package com.cbs.edu.spring.decoupled_1;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new InternetMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
