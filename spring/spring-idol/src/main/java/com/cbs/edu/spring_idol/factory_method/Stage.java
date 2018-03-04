package com.cbs.edu.spring_idol.factory_method;

public class Stage {
    private static Stage instance;

    private Stage() { }

    public static Stage getInstance() {
        if (instance == null) {
            instance = new Stage();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Stage{}";
    }
}
