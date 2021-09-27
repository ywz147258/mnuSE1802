package com.ywz.service.impl;

import com.ywz.dao.EmployeeDao;
import com.ywz.entity.Employee;
import com.ywz.service.EmployeeService;

public class EmployeeServiceImpl extends BaseServiceImpl<EmployeeDao,Employee> implements EmployeeService{

    private EmployeeDao employeeDao = new EmployeeDao();


    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        super(employeeDao);
    }

    @Override
    public void test() {
        employeeDao.testDao();
    }
}
