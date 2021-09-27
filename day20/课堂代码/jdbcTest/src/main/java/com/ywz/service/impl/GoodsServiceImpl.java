package com.ywz.service.impl;

import com.ywz.dao.GoodsDao;
import com.ywz.entity.Goods;
import com.ywz.service.GoodsService;

import java.math.BigDecimal;
import java.util.List;

public class GoodsServiceImpl implements GoodsService {
    private GoodsDao goodsDao = new GoodsDao();

    @Override
    public void addGoods(String name, BigDecimal price) {
        goodsDao.insertGoods(name,price);
    }

    @Override
    public List<Goods> getGoods(Goods goods) {
        return goodsDao.selectGoods(goods);
    }
}
