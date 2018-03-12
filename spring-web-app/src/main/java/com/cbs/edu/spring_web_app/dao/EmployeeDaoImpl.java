package com.cbs.edu.spring_web_app.dao;

import com.cbs.edu.spring_web_app.entity.Employee;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public void delete(Integer id) {
        String sql = "delete from employee where id = ?";
        final MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("id", id);
        jdbcTemplate.update(sql, mapSqlParameterSource);
    }

    @Override
    public List<Employee> getAll() {
        String query = "select * from employee";
            List <Employee> students = jdbcTemplate.query(query, (resultSet, i) -> {
            final Employee employee = new Employee();
            employee.setId(resultSet.getInt("id"));
            employee.setFirstName(resultSet.getString("firstName"));
            employee.setLastName(resultSet.getString("lastName"));
            employee.setAge(resultSet.getInt("age"));
            employee.setSalary(resultSet.getInt("salary"));
            return employee;
        });
        return students;
    }
}
