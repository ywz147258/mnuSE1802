package com.ywz.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LifeServlet extends HttpServlet {
    private ServletConfig config;

    //初始化Servlet
    public void init(ServletConfig config) throws ServletException {
        System.out.println("＝＝＝＝＝＝＝进入初始化Servlet方法中＝＝＝＝＝＝＝＝");
        super.init(config);
        this.config = config;
        System.out.println("＝＝＝＝＝＝初始化Servlet＝＝＝＝＝＝＝＝＝");
        System.out.println("＝＝＝ ＝＝初始化Servlet结束＝＝＝＝＝＝＝＝");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException {
        System.out.println("＝＝＝＝进入doGet（）方法中＝＝＝＝＝＝");
        this.doPost(request, response);
        System.out.println("======调用doGet（）方法===============");
        System.out.println("＝＝＝调用doGet（）方法结束＝＝＝＝＝＝＝＝＝");
    }

    //处理post请求
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException {
        System.out.println("＝＝＝＝进入doPost（）方法中＝＝＝＝＝＝＝＝＝＝＝");
        System.out.println("=============调用doPost（）方法=================");
        System.out.println("＝＝＝＝＝＝调用doPost（）方法结束＝＝＝＝＝＝＝＝＝");
    }

    //调用destroy方法
    public void destroy() {
        System.out.println("=========系统调用destroy（）方法=============");
    }
}
