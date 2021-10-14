package com.ywz.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FormController extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("FormController初始化");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String userName = req.getParameter("userName");
        String psw =req.getParameter("psw");

        String[] aihao =req.getParameterValues("aihao");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("用户名:"+userName+",密码:"+psw);
        for(String str:aihao){
            out.println("爱好:"+str);
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String userName = req.getParameter("userName");
        String psw =req.getParameter("psw");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("用户名:"+userName+",密码:"+psw);
    }


}
