package com.ywz.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/AServlet"})
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext ctxt=this.getServletContext();
        ctxt.setAttribute("name","游文智");
        System.out.println(ctxt.hashCode());
        System.out.println("Aservlet-name:"+ctxt.getAttribute("name"));

        req.getSession().setAttribute("userName","ywz");
    }
}
