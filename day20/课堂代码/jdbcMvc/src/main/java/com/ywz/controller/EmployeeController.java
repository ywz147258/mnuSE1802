package com.ywz.controller;

import com.ywz.dao.EmployeeDao;
import com.ywz.entity.Employee;
import com.ywz.service.EmployeeService;
import com.ywz.service.impl.EmployeeServiceImpl;

public class EmployeeController {

    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        employeeController.addEmployee();
    }

    private EmployeeService employeeService = new EmployeeServiceImpl(new EmployeeDao());
    public void addEmployee(){
        Employee employee = new Employee();
        employee.setName("ywz");
        employee.setWorkerNo("001");
        employeeService.add(employee);
    }
}
