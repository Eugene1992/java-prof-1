package com.cbs.edu.spring.decoupled_2;

public class SomeMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
