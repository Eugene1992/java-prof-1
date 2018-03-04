package com.cbs.java.database_interaction.dao;

import com.cbs.java.database_interaction.entity.Employee;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDaoImpl implements EmployeeDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    public EmployeeDaoImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Employee upsert(Employee employee) {
        String query = "insert into employee values (:id, :firstname, :lastname, :age, :salary)";

        Map<String, Object> map = new HashMap<>();
        map.put("id", employee.getId());
        map.put("firstname", employee.getFirstName());
        map.put("lastname", employee.getLastName());
        map.put("age", employee.getAge());
        map.put("salary", employee.getSalary());

        jdbcTemplate.execute(query, map, (PreparedStatementCallback<Object>) PreparedStatement::executeUpdate);

        return employee;
    }

    @Override
    public Employee get(Integer integer) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public List<Employee> getAll() {
        return null;
    }
}
