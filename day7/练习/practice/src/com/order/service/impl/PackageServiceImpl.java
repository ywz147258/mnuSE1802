package com.order.service.impl;

import com.order.enums.FoodEnum;
import com.order.service.OrderService;

/**
 * 打包带走
 */
public class PackageServiceImpl implements OrderService {
    @Override
    public Integer order(FoodEnum food, Integer number) {
        Integer allPrice = food.getPrice()*number;
        allPrice+=10;
        return allPrice;
    }
}
