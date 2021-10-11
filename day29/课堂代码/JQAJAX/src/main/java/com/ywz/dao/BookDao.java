package com.ywz.dao;

import com.ywz.entity.Book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao extends BaseDao<Book> {
    @Override
    public void insert(Book book) {

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

    /**
     * 获取书本名字
     * @param name
     * @return
     */
    public List<String> selectBookName(String name){
        List<String> bookNames=new ArrayList<>();
        String sql ="select name from book where name like ?";
        try {
            PreparedStatement ps=getCon().prepareStatement(sql);
            ps.setString(1,"%"+name+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                bookNames.add(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookNames;
    }


}
