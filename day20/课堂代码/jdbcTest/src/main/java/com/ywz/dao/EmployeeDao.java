package com.ywz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao extends BaseDao{
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
}
