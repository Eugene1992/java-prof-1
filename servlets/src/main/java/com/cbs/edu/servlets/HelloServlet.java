package com.cbs.edu.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("<html>");
            writer.write("<head>");
            writer.write("</head>");
            writer.write("<body>");
                writer.write("<h1>");
                    writer.write("Hello world!");
                writer.write("</h1>");
            writer.write("</body>");
        writer.write("</html>");
    }
}
