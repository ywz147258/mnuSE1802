package com.ywz.service.impl;

import com.ywz.dao.GoodsDao;
import com.ywz.entity.Goods;
import com.ywz.service.GoodsService;

import java.util.List;

public class GoodServiceImpl extends BaseServiceImpl<GoodsDao,Goods> implements GoodsService{
    public GoodServiceImpl(GoodsDao goodsDao) {
        super(goodsDao);
    }
}
