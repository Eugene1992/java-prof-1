package spring.jdbs_template.service;

import spring.jdbs_template.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements IEmployeeService {
    private EmployeeRepositoryImpl employeeRepositiry;

    public EmployeeServiceImpl(EmployeeRepositoryImpl employeeRepositiry) {
        this.employeeRepositiry = employeeRepositiry;
    }

    @Override
    public void getInfo() {
        System.out.println("This is employees service!");
    }
}
