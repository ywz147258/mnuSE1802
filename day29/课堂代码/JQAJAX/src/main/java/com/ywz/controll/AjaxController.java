package com.ywz.controll;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax")
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST})
public class AjaxController {

    @RequestMapping("/test")
    public String test(String name,String psw){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "ajax/test";
    }
}
