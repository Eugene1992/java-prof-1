package com.cbs.edu.servlets.config_context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CoockieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("login", "username");
        resp.addCookie(cookie);

        ServletContext ctx = getServletContext();
        String attributeName = "ContextAttribute";
        String attributeValue = "Initial Value";
        // create
        ctx.setAttribute(attributeName, attributeValue);
        attributeValue = "New Value";
        // update
        ctx.setAttribute(attributeName, attributeValue);
        // remove
        ctx.removeAttribute(attributeName);

        req.getRequestDispatcher("/coockie.jsp").forward(req, resp);
    }
}