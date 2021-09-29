package com.ywz.selenium.dao;

import com.ywz.selenium.entity.Book;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BookDao extends  BaseDao<Book> {
    @Override
    public void insert(Book book) {
        String sql ="insert into book(name,href) values(?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1,book.getName());
            ps.setString(2,book.getHref());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Book book) {

    }

    @Override
    public void update(Book book) {

    }

    @Override
    public List<Book> select(Book book) {
        return null;
    }
}
