package com.ywz.controller;

import com.ywz.dao.UserDao;
import com.ywz.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController  {

    @RequestMapping("/register")
    public String register(User user){
        UserDao userDao = new UserDao();
        userDao.insert(user);
        return "success";
    }
}
