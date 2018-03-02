package com.cbs.edu.component_scan;

public class InternetMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello Internet!";
    }
}
