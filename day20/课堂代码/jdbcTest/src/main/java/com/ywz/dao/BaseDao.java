package com.ywz.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
    public Connection getCon() {
        return con;
    }

    private Connection con;

    public BaseDao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/supermarket?useUnicode=true&characterEncoding=UTF-8";
            //数据库账号
            String user = "root";
            //数据库的密码
            String password = "";
            //链接数据库
            con= DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
