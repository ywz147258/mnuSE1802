package com.order.service;

import com.order.enums.FoodEnum;

/**
 * 点餐
 */
public interface OrderService {

    /**
     * 点餐
     * @param food 食物
     * @param number 食物数量
     * @return 总价
     */
    public Integer order(FoodEnum food, Integer number);
}
