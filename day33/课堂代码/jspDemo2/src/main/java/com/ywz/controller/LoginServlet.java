package com.ywz.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bookStore?useUnicode=true&characterEncoding=UTF-8";
            //数据库账号
            String user = "root";
            //数据库的密码
            String password = "";
            //链接数据库
            Connection con = DriverManager.getConnection(url, user, password);

            request.setCharacterEncoding("utf-8");
            String userName =request.getParameter("userName");
            String psw =request.getParameter("psw");
            //验证账号密码
            String sql="select count(1) as counts from users where user_name =? and psw = ?";
            PreparedStatement psUser =con.prepareStatement(sql);
            psUser.setString(1,userName);
            psUser.setString(2,psw);
            Integer userCount=0;
            ResultSet rsUser = psUser.executeQuery();
            while(rsUser.next()){
                userCount=rsUser.getInt("counts");
            }
            resp.setContentType("text/html;charset=utf-8");
            resp.setCharacterEncoding("utf-8");
            //如果用户不存在
            if(userCount==0){
                resp.sendRedirect("login.jsp?message=userName is no being");
            }else{
                resp.sendRedirect("index.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
