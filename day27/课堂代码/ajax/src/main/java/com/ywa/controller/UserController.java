package com.ywa.controller;

import com.ywa.entity.User;
import com.ywa.service.UserService;
import com.ywa.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST})
public class UserController {
    private UserService userService = new UserServiceImpl();

    /**
     * 判断用户名是否存在
     * @param userName
     * @return
     */
    @RequestMapping("/judgeUser")
    public String judgeUser(String userName){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = new User();
        user.setUserName(userName);
        boolean result= userService.getUserCounts(user);
        if(result==true){
            return "fail";
        }else{
            return "success";
        }
    }

    /**
     * 判断用户名是否存在
     * @param tel
     * @return
     */
    @RequestMapping("/judgeUserTel")
    public String judgeUserTel(String tel){
        User user = new User();
        user.setTel(tel);
        boolean result= userService.getUserCountsByTel(user);
        if(result==true){
            return "fail";
        }else{
            return "success";
        }
    }

}
