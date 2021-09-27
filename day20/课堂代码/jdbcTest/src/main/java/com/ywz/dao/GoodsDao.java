package com.ywz.dao;


import com.ywz.entity.Goods;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GoodsDao extends BaseDao<Goods>{

    /**
     * 修改商品价格
     * @param name
     * @param price
     */
    public void updateGoods(String name,BigDecimal price) throws Exception{
        String sql ="update goods set price="+price+" where name="+name;
    }


    @Override
    public void insert(Goods goods) {
        //用放射的方式加载数据库驱动
        Statement statement;
        String sql= "insert into goods(name,price) values('"+goods.getName()+"',"+goods.getPrice()+")";
        try {
            //创建sql语句执行对象
            statement =getCon().createStatement();
            statement.execute(sql);
            statement.close();
        }  catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Goods> selects(Goods goodsEntity) {
        String sql ="select * from goods where 1=1";
        List<Goods> goodsList= new ArrayList<>();
        try {
            Integer i=0;
            Integer y=0;
            if(goodsEntity.getName()!=null){
                sql+=" and name=?";
                i++;
                y++;
            }
            if(goodsEntity.getPrice()!=null){
                sql+=" and price=?";
                i++;
                y++;
            }
            PreparedStatement ps =getCon().prepareStatement(sql);

            if(goodsEntity.getName()!=null){
                ps.setString(Math.abs(--i -y),goodsEntity.getName());
            }

            if(goodsEntity.getPrice()!=null){
                ps.setBigDecimal(Math.abs(--i -y),goodsEntity.getPrice());
            }
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Goods goods = new Goods();
                goods.setId(rs.getInt("id"));
                goods.setName(rs.getString("name"));
                goods.setPrice(rs.getBigDecimal("price"));
                goodsList.add(goods);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return goodsList;
    }
}
