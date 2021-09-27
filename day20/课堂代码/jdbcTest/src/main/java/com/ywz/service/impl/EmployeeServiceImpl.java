package com.ywz.service.impl;

import com.ywz.dao.EmployeeDao;
import com.ywz.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao =new EmployeeDao();

    @Override
    public void addEmployee(String name, String workerNo) {
        employeeDao.insertEmployee(name,workerNo);
    }
}
