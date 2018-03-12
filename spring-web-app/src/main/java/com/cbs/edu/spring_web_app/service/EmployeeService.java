package com.cbs.edu.spring_web_app.service;

import com.cbs.edu.spring_web_app.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void deleteEmployee(int id);

    void upsertEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
