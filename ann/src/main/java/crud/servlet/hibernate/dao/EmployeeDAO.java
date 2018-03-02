package crud.servlet.hibernate.dao;

import crud.servlet.hibernate.entity.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAO implements IEmployeeDAO{


    @Override
    public void addEmployee(Employee employee) {
        Connection connection = null;
        connection=getConnection();

        PreparedStatement statement;
        try {
            statement = connection.prepareStatement("insert into employees (firstname, lastname, login, password, age, salary, isMarried) VALUES (?,?,?,?,?,?,?)");
            statement.setString(1, employee.getFirstname());
            statement.setString(2, employee.getLastname());
            statement.setString(3, employee.getLogin());
            statement.setString(4, employee.getPassword());
            statement.setInt(5, employee.getAge());
            statement.setInt(6,employee.getSalary());
            statement.setBoolean(7,employee.isMarried());

            statement.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeByName(String name) {
        return null;
    }

    @Override
    public void updateEmployeeSalaryByLogin(int salary, String login) {

    }

    @Override
    public void removeEmployeeByLogin(String login) {

    }

    private Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_database", "root", "root");
            return connection;
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
