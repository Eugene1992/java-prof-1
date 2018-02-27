package com.cbs.edu.spring.decoupled_2;

public class InternetMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello internet!";
    }
}
