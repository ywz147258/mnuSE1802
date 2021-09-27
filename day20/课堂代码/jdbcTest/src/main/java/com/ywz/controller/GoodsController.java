package com.ywz.controller;

import com.ywz.service.GoodsService;
import com.ywz.service.impl.GoodsServiceImpl;

import java.math.BigDecimal;
import java.util.Scanner;

public class GoodsController {

    private GoodsService goodsService = new GoodsServiceImpl();

    public static void main(String[] args) {
        GoodsController goodsController = new GoodsController();
        goodsController.addGoods();
    }

    /**
     * 添加商品
     */
    public void addGoods(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用超市erp管理系统");

        boolean isContinue=true;
        while(isContinue){
            System.out.println("输入商品的名称");
            String name =scanner.next();
            System.out.println("输入商品的价格");
            BigDecimal price=new BigDecimal(scanner.nextFloat());
            long start= System.currentTimeMillis();
            goodsService.addGoods(name,price);
            long end =System.currentTimeMillis();
            System.out.println("本次执行添加所用毫秒数："+(end-start));
            System.out.println("继续按 1，其他停止");
            String result=scanner.next();
            isContinue=result.equals("1")?true:false;
        }
    }
}
