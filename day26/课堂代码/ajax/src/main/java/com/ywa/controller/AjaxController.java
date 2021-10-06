package com.ywa.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax")
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST})
public class AjaxController {
    @RequestMapping("/sentMessage")
    public String sentMessage(){
        return "success";
    }
}
