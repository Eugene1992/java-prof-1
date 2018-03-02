package crud.servlet.hibernate.servlets;

import crud.servlet.hibernate.dao.EmployeeDAO;
import crud.servlet.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
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
}
