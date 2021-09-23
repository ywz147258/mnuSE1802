package com.order.service.impl;


import com.order.entity.Food;
import com.order.service.AdminService;

/**
 * 管理员
 */
public class AdminServiceImpl implements AdminService {

    /**
     * 设置食物数量
     * @param food 食物
     * @param number 数量
     */
    @Override
    public void setPrice(Food food,Integer number) {
        food.setNumber(number);
    }
}
