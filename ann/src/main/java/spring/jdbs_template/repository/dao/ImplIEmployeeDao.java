package spring.jdbs_template.repository.dao;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import spring.jdbs_template.repository.entity.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@PropertySource("classpath:sql/sql_queries.properties")
public class ImplIEmployeeDao implements IEmployeeDao {
    private NamedParameterJdbcTemplate jdbcTemplate;

    public ImplIEmployeeDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    Environment environment;

    @Override
    public Employee upsert(Employee employee) {
        String query = environment.getProperty("sql.upsert");

        Map<String, Object> map = new HashMap<>();
        map.put("id", employee.getId());
        map.put("firstname", employee.getFirstName());
        map.put("lastname", employee.getLastName());
        map.put("age", employee.getAge());
        map.put("salary", employee.getSalary());

        jdbcTemplate.update(query,map);

        return  employee;
    }

    @Override
    public Employee get(Integer id) {
        String query = environment.getProperty("sql.getById");

        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        Employee employee = jdbcTemplate.queryForObject(query, map, new EmployeeMapper());
        return employee;
    }


    @Override
    public void delete(Integer id) {
        String query = environment.getProperty("sql.deleteById");

        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        jdbcTemplate.update(query, map);
    }

    @Override
    public List<Employee> getAll() {
        String query = "select * from employee";

        List<Employee> employees = jdbcTemplate.query(query, new EmployeeMapper());
//        for (Map row : rows) {
//            Employee employee = new Employee();
//            employee.setId((Integer) (row.get("id")));
//            employee.setFirstName((String)row.get("firstname"));
//            employee.setLastName((String)row.get("lastname"));
//            employee.setAge((Integer)row.get("age"));
//            employee.setSalary((Integer)row.get("salary"));
//            employees.add(employee);
//        }
        for (Employee empl : employees) {
            System.out.println(empl);

        }
        return employees;
    }
}
