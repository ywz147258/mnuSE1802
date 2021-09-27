package com.ywz.service.impl;

import com.ywz.dao.GoodsDao;
import com.ywz.entity.Goods;
import com.ywz.service.GoodsService;

import java.math.BigDecimal;
import java.util.List;

public class GoodsServiceImpl implements GoodsService {
    private GoodsDao goodsDao = new GoodsDao();

    @Override
    public void add(Goods goods) {
        goodsDao.insert(goods);
    }

    @Override
    public List<Goods> get(Goods goods) {
        return goodsDao.selects(goods);
    }
}
