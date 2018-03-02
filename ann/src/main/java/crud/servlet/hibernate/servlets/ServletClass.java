package crud.servlet.hibernate.servlets;

import crud.servlet.hibernate.dao.EmployeeDAO;
import crud.servlet.hibernate.entity.Employee;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ServletClass extends HttpServlet {
    private EmployeeDAO employee;


    @Override
    public void init(ServletConfig config) throws ServletException {
        new EmployeeDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/employee.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lastname = req.getParameter("lastname");
        String firstname = req.getParameter("firstname");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        int age = Integer.parseInt(req.getParameter("age"));
        int salary = Integer.parseInt(req.getParameter("salary"));
        boolean isMarried = Boolean.parseBoolean(req.getParameter("isMarried"));


    }
}
