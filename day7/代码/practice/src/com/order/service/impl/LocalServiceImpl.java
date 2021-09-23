package com.order.service.impl;

import com.order.enums.FoodEnum;
import com.order.service.OrderService;

/**
 * 堂食
 */
public class LocalServiceImpl implements OrderService {
    @Override
    public Integer order(FoodEnum food, Integer number) {
        Integer allPrice = food.getPrice()*number;
        return allPrice;
    }
}
