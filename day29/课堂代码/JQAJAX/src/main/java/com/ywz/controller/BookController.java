package com.ywz.controller;


import com.ywz.entity.Book;
import com.ywz.service.BookService;
import com.ywz.service.impl.BookServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST})
public class BookController {

    private BookService bookService= new BookServiceImpl();
    @RequestMapping("/getBookName")
    public List<String> getBookName(String name){
        if(name.trim()=="")return null;
        return bookService.getBookNames(name);
    }

    @RequestMapping("/getBooks")
    public List<Book> getBooks(Book book){
        return bookService.getBooks(book);
    }

    @RequestMapping("/getBookCounts")
    public Integer getBookCounts(String name){
        return bookService.getBookCounts(name);
    }

    @RequestMapping("/modify")
    public String modify(Book book){
        bookService.modifyBook(book);
        return "success";
    }
}
