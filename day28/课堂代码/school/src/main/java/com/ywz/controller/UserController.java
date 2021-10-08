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
    public List<User> userList(User user){
        List<User> list = userService.getUsers(user);
        //springBoot 会把对象转json
        return list;
    }

    /**
     * 获取用户里列表的数量
     * @return
     */
    @RequestMapping("/userCounts")
    public int userCounts(){
        return userService.getUserCount();
    }

    /**
     * 用户删除
     * @return
     */
    @RequestMapping("/userDelete")
    public String userDelete(Integer id){
        userService.userDelete(id);
        return "success";
    }

    @RequestMapping("/getUserInfo")
    public User getUserInfo(Integer id){
        return userService.getUserInfo(id);
    }
}
