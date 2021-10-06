package com.ywa.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.nio.cs.ext.Big5;

import java.math.BigDecimal;

@RestController
@RequestMapping("/ajax")
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST})
public class AjaxController {
    @RequestMapping("/sentMessage")
    public String sentMessage(String message){
        return "接收到的值"+message;
    }
    @RequestMapping("/login")
    public String login(String userName,String psw){
       if(userName.equals("ywz")){
           return "success";
       }else{
           return "fail";
       }
    }
}
