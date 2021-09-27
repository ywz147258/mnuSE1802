package com.ywz.service.impl;

import com.ywz.dao.GoodsDao;
import com.ywz.entity.Goods;
import com.ywz.service.GoodsService;

import java.util.List;

public class GoodServiceImpl implements GoodsService {

    private GoodsDao goodsDao = new GoodsDao();
    @Override
    public void add(Goods goods) {
        goodsDao.insert(goods);
    }

    @Override
    public List<Goods> get(Goods goods) {
        return goodsDao.select(goods);
    }

    @Override
    public void remove(Goods goods) {
        goodsDao.delete(goods);
    }

    @Override
    public void modify(Goods goods) {
        goodsDao.update(goods);
    }

}
