package com.ywz.selenium.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public abstract class BaseDao<T> {
    private static Connection con;

    public Connection getCon() {
        return con;
    }
    public BaseDao(){
        try{
            if(con==null){
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=UTF-8";
                //数据库账号
                String user = "root";
                //数据库的密码
                String password = "";
                //链接数据库
                con= DriverManager.getConnection(url,user,password);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public abstract void insert(T t);
    public abstract void delete(T t);
    public abstract  void update(T t);
    public abstract List<T> select(T t);
}
