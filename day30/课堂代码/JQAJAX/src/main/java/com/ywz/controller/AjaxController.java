package com.ywz.controller;

import com.ywz.entity.Book;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping("/test2")
    public String test2(Book book){
        return "ajax/test2"+book.getName();
    }
}
