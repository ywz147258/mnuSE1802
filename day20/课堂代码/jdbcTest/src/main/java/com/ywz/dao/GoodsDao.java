package com.ywz.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GoodsDao {

    private Connection con;

    public GoodsDao() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/supermarket?useUnicode=true&characterEncoding=UTF-8";
        //数据库账号
        String user = "root";
        //数据库的密码
        String password = "";
        //链接数据库
        con= DriverManager.getConnection(url,user,password);
    }

    /**
     * 插入商品表(给数据操作使用)
     * @param name
     * @param price
     */
    public void insertGoods(String name,BigDecimal price)throws Exception{

        //用放射的方式加载数据库驱动
        Statement statement;
        String sql= "insert into goods(name,price) values('"+name+"',"+price+")";
        try {
            //创建sql语句执行对象
            statement =con.createStatement();
            statement.execute(sql);
            statement.close();
        }  catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 修改商品价格
     * @param name
     * @param price
     */
    public void updateGoods(String name,BigDecimal price) throws Exception{
        String sql ="update goods set price="+price+" where name="+name;
    }
}
