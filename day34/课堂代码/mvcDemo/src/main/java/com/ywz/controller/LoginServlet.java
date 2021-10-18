package com.ywz.controller;

import com.alibaba.fastjson.JSONObject;
import com.ywz.entity.Result;
import com.ywz.entity.User;
import com.ywz.service.UserService;
import com.ywz.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName =req.getParameter("userName");
        String psw =req.getParameter("psw");
        User user = new User();
        user.setUserName(userName);
        user.setPsw(psw);
        Boolean isBeing =userService.judgeUser(user);
        PrintWriter out=resp.getWriter();




        if(isBeing==false){
            Result result = new Result();
            result.setCode("001");
            result.setMessage("用户不存在");
            result.setSuccess("fail");
            //把对象转json
            JSONObject jsonObject = (JSONObject) JSONObject.toJSON(result);
            out.print(jsonObject);
        }else{
            //存sesssion
            req.getSession().setAttribute("isLogin",true);
            Result result = new Result();
            result.setCode("002");
            result.setMessage("用户存在");
            result.setSuccess("success");
            JSONObject jsonObject = (JSONObject) JSONObject.toJSON(result);
            out.print(jsonObject);
        }
    }
}
