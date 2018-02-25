package com.cbs.edu.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("paramName", "paramValue");
        response.addCookie(cookie);

        ServletContext ctx = getServletContext();
        String attributeName = "ContextAttribute";
        String attributeValue = "Initial Value";
        ctx.setAttribute(attributeName, attributeValue);
        attributeValue = "New Value";
        ctx.setAttribute(attributeName, attributeValue);
        ctx.removeAttribute(attributeName);

        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }
}
