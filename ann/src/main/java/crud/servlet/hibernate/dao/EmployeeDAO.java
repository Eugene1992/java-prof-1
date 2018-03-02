package crud.servlet.hibernate.dao;

import crud.servlet.hibernate.entity.Employee;

import java.util.List;

public class EmployeeDAO implements IEmployeeDAO{


    @Override
    public void addEmployee(Employee employee) {

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
}
