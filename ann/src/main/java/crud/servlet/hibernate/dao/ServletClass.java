package crud.servlet.hibernate.dao;

import crud.servlet.hibernate.entity.Employee;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServletClass extends HttpServlet {
    private List<Employee> employeeList;

    @Override
    public void init(ServletConfig config) throws ServletException {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Tina","Terner","tina","tina",80, 5000,false));
        employeeList.add(new Employee(2,"Tom","Hardy","tom","tom",40, 15000,true));
        employeeList.add(new Employee(3,"Brad","Pitt","pit","pit",52, 25000,false));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/employee.jsp").forward(req,resp);
    }
}
