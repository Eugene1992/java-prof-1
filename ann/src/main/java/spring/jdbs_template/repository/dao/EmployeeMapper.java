package spring.jdbs_template.repository.dao;


import org.springframework.jdbc.core.RowMapper;
import spring.jdbs_template.repository.entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt("id"));
        employee.setFirstName(resultSet.getString("firstname"));
        employee.setLastName(resultSet.getString("lastname"));
        employee.setSalary(resultSet.getInt("salary"));
        employee.setAge(resultSet.getInt("age"));
        return employee;
    }
}
