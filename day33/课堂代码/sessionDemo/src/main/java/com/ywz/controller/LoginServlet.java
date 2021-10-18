package com.ywz.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(urlPatterns = {"/loginAction"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //获取账号和密码
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
            resp.setCharacterEncoding("utf-8");    //设置 HttpServletResponse使用utf-8编码
            resp.setHeader("Content-Type", "text/html;charset=utf-8");    //通知浏览器使用utf-8解码
            //如果不匹配就跳回到登陆页，并告知账号不存在
            if(userCount==0){
                String message="用户名不存在";
                message= URLEncoder.encode(message,"utf-8");
                resp.sendRedirect("login.jsp?message="+message);
            }else{
                request.getSession().setAttribute("isLogin",true);
                request.getSession().setAttribute("userName",userName);

                //如果匹配就跳到bookList.jsp
                request.getRequestDispatcher("BookServlet").forward(request,resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
