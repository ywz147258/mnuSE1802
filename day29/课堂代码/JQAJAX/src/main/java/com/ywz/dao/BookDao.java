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

    //获取书本列表
    @Override
    public List<Book> select(Book book) {
        List<Book> books=new ArrayList<>();
        String sql ="select name from book where name like ? limit ?,?";
        try {
            PreparedStatement ps=getCon().prepareStatement(sql);
            ps.setString(1,"%"+book.getName()+"%");
            ps.setInt(2,book.getStart());
            ps.setInt(3,book.getLimit());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Book result = new Book();
                result.setId(rs.getInt("id"));
                result.setName(rs.getString("name"));
                result.setName(rs.getString("href"));
                books.add(result);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    //获取总条数
    public Integer selectCounts(String name){
        String sql = "select count(*) as counts from book where name like ?";
        Integer counts=null;
        try {
            PreparedStatement ps=getCon().prepareStatement(sql);
            ps.setString(1,"%"+name+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                counts=rs.getInt("counts");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return counts;
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
