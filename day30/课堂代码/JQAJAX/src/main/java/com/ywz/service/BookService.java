package com.ywz.service;

import com.ywz.entity.Book;

import java.util.List;

public interface BookService {
    public List<String> getBookNames(String name);

    public List<Book> getBooks(Book book);

    public Integer getBookCounts(String name);

    public void modifyBook(Book book);
}
