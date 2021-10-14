package com.ywz.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class DemoController extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("DemoController初始化");
    }

    public DemoController(){
        System.out.println("DemoController构造函数");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("DemoController被销毁");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应的内容类型
        resp.setContentType("text/html;charset=utf-8");
        //  获得输出流
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>HelloWorld</title></head>");
        out.println("<body bgcolor='red'>");
        out.println("<center>HelloWorld 世界你好！！！ ！！！</center>");
        out.println("</body></html>");
        System.out.println("执行get");

        System.out.println(Thread.currentThread().getName());

        //打印请求地址
        System.out.println("您的ip地址为:"+req.getRemoteAddr());

    }
}
