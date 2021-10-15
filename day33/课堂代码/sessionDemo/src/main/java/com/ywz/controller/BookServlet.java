package com.ywz.controller;

import com.ywz.entity.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/BookServlet"})
public class BookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        try {
//            String userName=request.getParameter("userName");
//            String psw=request.getParameter("psw");
//
//            if(userName==null||psw==null){
//                resp.sendRedirect("login.jsp");
//            }

            //通过session来判断是否登陆
            if(request.getSession().getAttribute("isLogin")==null){
                resp.sendRedirect("login.jsp");
            }

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bookStore?useUnicode=true&characterEncoding=UTF-8";
            //数据库账号
            String user = "root";
            //数据库的密码
            String password = "";
            //链接数据库
            Connection con = DriverManager.getConnection(url, user, password);

            request.setCharacterEncoding("utf-8");
            String name =request.getParameter("keyWord");
            if(name==null)name="";
            //验证账号密码
            String sql="select * from book where name like ?";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,"%"+name+"%");
            ResultSet rs = ps.executeQuery();
            List<Book> list= new ArrayList<>();
            while(rs.next()){
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setHref(rs.getString("href"));
                list.add(book);
            }
            request.setAttribute("list",list);
            request.getRequestDispatcher("bookList.jsp").forward(request,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
