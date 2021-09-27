package com.ywz.service;


import com.ywz.entity.Goods;

import java.math.BigDecimal;
import java.util.List;

public interface GoodsService {
    public void addGoods(String name, BigDecimal price);

    public List<Goods> getGoods(Goods goods);

}
