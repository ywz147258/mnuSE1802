package com.ywz.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/BServlet"})
public class BServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext ctxt=this.getServletContext();
        System.out.println(ctxt.hashCode());
        System.out.println("Bservlet-name:"+ctxt.getAttribute("name"));
        System.out.println("passWord:"+ctxt.getInitParameter("passWord"));
    }
}
