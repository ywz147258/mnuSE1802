package com.ywz.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TestThreadServlet")
public class TestThreadServlet extends HttpServlet {
    /**
     * Default constructor.
     */
    public TestThreadServlet() {
        System.out.println("调用无参构造方法！！！");
    }

    public void init() throws ServletException {
        System.out.println("调用init()方法!!!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        this.doPost(request, response);
        System.out.println("调用doGet()方法");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
// TODO Auto-generated method stub
        System.out.println("调用doPost()方法！！！");
        request.setCharacterEncoding("UTF-8");
        String name =request.getParameter("username");
        String psw = request.getParameter("pwd");
        System.out.println(name+"-"+psw);

    }
}
