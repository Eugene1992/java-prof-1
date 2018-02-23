package com.cbs.edu.servlets;

import com.cbs.edu.servlets.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloJSPServlet extends HttpServlet {

    private List<User> users;

    @Override
    public void init() throws ServletException {
        users = new ArrayList<>();
        users.add(new User(0, "Admin", "admin", "admin"));
        users.add(new User(1, "User", "user", "user"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String id = req.getParameter("id");

        if (action != null) {
            switch (action) {
                case "update":
                    User updUser = users.get(Integer.parseInt(id));
                    req.setAttribute("updUser", updUser);
                    break;

                case "delete":
                    users.remove(Integer.parseInt(id));
                    break;
            }
        }

        req.setAttribute("users", users);
        req.getRequestDispatcher("/home.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String login = req.getParameter("login");
        String idParam = req.getParameter("id");
        if (!idParam.isEmpty()) {
            int id = Integer.parseInt(idParam);
            User user = users.get(id);
            user.setUsername(username);
            user.setLogin(login);
            user.setPassword(password);
        } else {
            users.add(new User(users.size(), username, login, password));
        }

        req.setAttribute("users", users);
        req.getRequestDispatcher("/home.jsp").forward(req, resp);
    }
}
