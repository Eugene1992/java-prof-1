package spring.jdbs_template.repository.dao;

import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import spring.jdbs_template.repository.entity.Employee;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImplIEmployeeDao implements IEmployeeDao {
    private NamedParameterJdbcTemplate jdbcTemplate;

    public ImplIEmployeeDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @Override
    public Employee upsert(Employee employee) {
        String query = "insert into employee values ( :firstname, :lastname, :age, :salary)";

        Map<String, Object> map = new HashMap<>();
       // map.put("id", employee.getId());
        map.put("firstname", employee.getFirstName());
        map.put("lastname", employee.getLastName());
        map.put("age", employee.getAge());
        map.put("salary", employee.getSalary());

       // jdbcTemplate.update(query,map);

        jdbcTemplate.execute(query, map, (PreparedStatementCallback<Object>) PreparedStatement::executeUpdate);
        return  employee;

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
