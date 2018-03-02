package crud.servlet.hibernate.dao;

import crud.servlet.hibernate.entity.Employee;

import java.util.List;

public interface IEmployeeDAO {
    void addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeByName(String name);

    void updateEmployeeSalaryByLogin(int salary, String login);

    void removeEmployeeByLogin(String login);
}
