package com.ywz.controller;

import com.ywz.entity.User;
import com.ywz.service.UserService;
import com.ywz.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST})
public class UserController {

    private UserService userService = new UserServiceImpl();
    /**
     * 获取用户列表
     * @return
     */
    @RequestMapping("/userList")
    public List<User> userList(){
        List<User> list = userService.getUsers();
        //springBoot 会把对象转json
        return list;
    }
}
