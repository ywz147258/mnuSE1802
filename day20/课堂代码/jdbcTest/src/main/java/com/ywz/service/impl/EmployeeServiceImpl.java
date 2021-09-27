package com.ywz.service.impl;

import com.ywz.dao.EmployeeDao;
import com.ywz.entity.Employee;
import com.ywz.entity.Goods;
import com.ywz.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao =new EmployeeDao();

    @Override
    public void add(Employee employee) {
            employeeDao.insert(employee);
    }

    @Override
    public List<Employee> get(Employee employee) {
        return null;
    }
}
