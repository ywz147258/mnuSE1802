package com.ywz.dao;

import com.ywz.entity.Goods;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class GoodsDao extends BaseDao<Goods>{
    @Override
    public void insert(Goods goods) {
        String sql = "insert into values(name,price) values(?,?)";
        PreparedStatement ps = null;
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1,goods.getName());
            ps.setBigDecimal(2,goods.getPrice());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Goods goods) {

    }

    @Override
    public void update(Goods goods) {

    }

    @Override
    public List<Goods> select(Goods goods) {
        return null;
    }
}
