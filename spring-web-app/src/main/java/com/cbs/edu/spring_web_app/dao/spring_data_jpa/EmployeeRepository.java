package com.cbs.edu.spring_web_app.dao.spring_data_jpa;

import com.cbs.edu.spring_web_app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
