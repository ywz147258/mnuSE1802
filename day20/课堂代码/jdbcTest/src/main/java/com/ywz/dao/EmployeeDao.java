package com.ywz.dao;

import com.ywz.entity.Employee;
import com.ywz.entity.Goods;

import java.sql.PreparedStatement;
import java.util.List;

public class EmployeeDao extends BaseDao<Employee>{
    public void insertEmployee(String name,String workerNo){
        String sql = "insert into employee(name,worker_no) values(?,?)";
        try {
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,workerNo);
            ps.execute();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(Employee employee) {
        String sql = "insert into employee(name,worker_no) values(?,?)";
        try {
            PreparedStatement ps= getCon().prepareStatement(sql);
            ps.setString(1,employee.getName());
            ps.setString(2,employee.getWorkerNo());
            ps.execute();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> selects(Employee employee) {
        return null;
    }
}
