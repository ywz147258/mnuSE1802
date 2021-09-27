package com.ywz.dao;


import com.ywz.entity.Goods;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GoodsDao extends BaseDao{

    /**
     * 插入商品表(给数据操作使用)
     * @param name
     * @param price
     */
    public void insertGoods(String name,BigDecimal price){

        //用放射的方式加载数据库驱动
        Statement statement;
        String sql= "insert into goods(name,price) values('"+name+"',"+price+")";
        try {
            //创建sql语句执行对象
            statement =getCon().createStatement();
            statement.execute(sql);
            statement.close();
        }  catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 修改商品价格
     * @param name
     * @param price
     */
    public void updateGoods(String name,BigDecimal price) throws Exception{
        String sql ="update goods set price="+price+" where name="+name;
    }

    public List<Goods> selectGoods(Goods goodsEntity){
//        String sql ="select * from goods where 1=1 where name=? and price =?";
        String sql ="select * from goods where 1=1";
        List<Goods> goodsList= new ArrayList<>();
        try {
//            PreparedStatement ps = getCon().prepareStatement(sql);
            if(goodsEntity.getName()!=null){
                sql+=" and name ='"+goodsEntity.getName()+"'";
            }
            if(goodsEntity.getPrice()!=null){
                sql+=" and price ="+goodsEntity.getPrice();
            }
            System.out.println(sql);
            Statement statement = getCon().createStatement();
            ResultSet rs= statement.executeQuery(sql);
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
