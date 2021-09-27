package com.ywz.service.impl;

import com.ywz.dao.GoodsDao;
import com.ywz.service.GoodsService;

import java.math.BigDecimal;

public class GoodsServiceImpl implements GoodsService {
    private GoodsDao goodsDao = new GoodsDao();

    @Override
    public void addGoods(String name, BigDecimal price) {
        goodsDao.insertGoods(name,price);
    }
}
