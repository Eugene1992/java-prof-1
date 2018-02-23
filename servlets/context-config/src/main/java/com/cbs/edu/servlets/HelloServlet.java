package com.cbs.edu.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final ServletConfig config = getServletConfig();
        final String servletConfigParamName = config.getInitParameter("servletConfigParamName");
        final String servletName = config.getServletName();
        System.out.println(servletName);
        System.out.println(servletConfigParamName);
    }
}
