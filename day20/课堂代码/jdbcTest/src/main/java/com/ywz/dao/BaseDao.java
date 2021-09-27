package com.ywz.dao;

import com.ywz.entity.Goods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public abstract class BaseDao<T> {
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

    public abstract  void insert(T t);

    public abstract List<T> selects(T t);
}
