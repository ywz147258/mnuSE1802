package com.ywz.controller;

import com.ywz.dao.UserDao;
import com.ywz.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController  {

    @RequestMapping("/register")
    public String register(User user){
        UserDao userDao = new UserDao();
        userDao.insert(user);
        return "success";
    }

    @RequestMapping("/test")
    public List<User> test(){
        List<User> list = new ArrayList<>();
        for(int i =0;i<3;i++){
            User user = new User();
            user.setUserName("ywz"+i);
            user.setPassWord("ps"+i);
            user.setSex(1);
            list.add(user);
        }
        return list;
    }

    @RequestMapping("/test2")
    public User test2(){
        User user = new User();
        user.setUserName("ywz");
        user.setPassWord("ps");
        user.setSex(1);
        return user;
    }
}
