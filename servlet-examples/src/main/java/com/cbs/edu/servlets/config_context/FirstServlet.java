package com.cbs.edu.servlets.config_context;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        System.out.println(servletConfig.getInitParameter("servletCongigParamName"));

        ServletContext servletContext = getServletContext();
        System.out.println(servletContext.getInitParameter("secret"));
    }
}
