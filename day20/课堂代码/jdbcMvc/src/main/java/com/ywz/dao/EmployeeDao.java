package com.ywz.dao;

import com.ywz.entity.Employee;
import com.ywz.entity.Goods;

import java.util.List;

public class EmployeeDao extends BaseDao<Employee> {
    @Override
    public void insert(Employee employee) {
    }
    @Override
    public void delete(Employee employee) {

    }
    @Override
    public void update(Employee employee) {

    }
    @Override
    public List<Employee> select(Employee employee) {
        return null;
    }

    public void testDao(){
        System.out.println("我操作了数据库");
    }
}
