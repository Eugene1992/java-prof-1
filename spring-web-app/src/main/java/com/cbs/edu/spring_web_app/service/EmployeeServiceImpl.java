package com.cbs.edu.spring_web_app.service;

import com.cbs.edu.spring_web_app.dao.EmployeeDao;
import com.cbs.edu.spring_web_app.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDao.delete(id);
    }

    @Override
    public void upsertEmployee(Employee employee) {
        employeeDao.upsert(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAll();
    }
}
