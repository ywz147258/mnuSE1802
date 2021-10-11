package com.ywz.service.impl;

import com.ywz.dao.BookDao;
import com.ywz.entity.Book;
import com.ywz.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDao bookDao= new BookDao();

    @Override
    public List<String> getBookNames(String name) {
        return bookDao.selectBookName(name);
    }

    @Override
    public List<Book> getBooks(Book book) {
        return bookDao.select(book);
    }

    @Override
    public Integer getBookCounts(String name) {
        return bookDao.selectCounts(name);
    }

    @Override
    public void modifyBook(Book book) {
        bookDao.update(book);
    }
}
