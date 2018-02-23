package com.cbs.edu.auth_app.dao;

import com.cbs.edu.auth_app.model.User;

import java.util.ArrayList;
import java.util.List;

public class MockUserDAO {

    private static final List<User> userRepository;

    static {
        userRepository = new ArrayList<>();
        userRepository.add(new User("Admin", "admin", "admin"));
        userRepository.add(new User("User", "user", "user"));
    }

    public User getByLoginAndPassword(final String loginName, final String password) {
        for (User user : userRepository) {
            if (user.getLogin().equals(loginName) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
