package spring.jdbs_template.controller;

import spring.jdbs_template.service.EmployeeServiceImpl;

public class EmployeeControllerImpl implements IEmployeeController {
    private EmployeeServiceImpl employeeService;

    public EmployeeControllerImpl(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void getInfo() {
        System.out.println("This is employees controller!");
    }
}
