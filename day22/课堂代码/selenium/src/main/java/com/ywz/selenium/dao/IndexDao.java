package com.ywz.selenium.dao;

import com.ywz.selenium.entity.Index;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class IndexDao extends BaseDao<Index> {
    @Override
    public void insert(Index index) {
        String sql ="insert into indexs(title,href,book_id) values(?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1,index.getTitle());
            ps.setString(2,index.getHref());
            ps.setInt(3,index.getBookId());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Index index) {

    }

    @Override
    public void update(Index index) {

    }

    @Override
    public List<Index> select(Index index) {
        return null;
    }
}
