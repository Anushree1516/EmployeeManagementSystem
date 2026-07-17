package com.employee.controller;

import com.employee.service.EmployeeService;

public class EmployeeController {

    private EmployeeService employeeService = new EmployeeService();

    public void saveEmployee() {
        employeeService.addEmployee();
    }
}