package com.ywz.controller;

import com.alibaba.fastjson.JSONObject;
import com.ywz.entity.Result;
import com.ywz.rediManage.RedisDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/bookList"})
public class BookListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        //判断session是否存在
        String sessionId= req.getParameter("sessionId").toString();
        String userName =req.getParameter("userName").toString();
        RedisDao redisDao = new RedisDao();
        String redisId =redisDao.get(userName);
        PrintWriter out=resp.getWriter();


        if (!sessionId.equals(redisId)){
            Result result = new Result();
            result.setCode("003");
            result.setMessage("用户未登录");
            result.setSuccess("fail");
            JSONObject jsonObject = (JSONObject) JSONObject.toJSON(result);
            out.print(jsonObject);
        }else{
            Result result = new Result();
            result.setCode("004");
            result.setMessage("用户已登录");
            result.setSuccess("success");
            JSONObject jsonObject = (JSONObject) JSONObject.toJSON(result);
            out.print(jsonObject);
        }
    }
}
