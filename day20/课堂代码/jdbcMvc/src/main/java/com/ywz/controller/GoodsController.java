package com.ywz.controller;

import com.ywz.dao.GoodsDao;
import com.ywz.entity.Goods;
import com.ywz.service.GoodsService;
import com.ywz.service.impl.GoodServiceImpl;

import java.math.BigDecimal;
import java.util.Scanner;

public class GoodsController {
    private GoodsService goodsService = new GoodServiceImpl(new GoodsDao());


    public static void main(String[] args) {
        GoodsController goodsController = new GoodsController();
//        goodsController.addGoods();
        goodsController.removeGoods(4118);
    }

    public void removeGoods(Integer id){
        Goods goods = new Goods();
        goods.setId(id);
        goodsService.remove(goods);
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
            Goods goods = new Goods();
            goods.setName(name);
            goods.setPrice(price);
            goodsService.add(goods);
            long end =System.currentTimeMillis();
            System.out.println("本次执行添加所用毫秒数："+(end-start));
            System.out.println("继续按 1，其他停止");
            String result=scanner.next();
            isContinue=result.equals("1")?true:false;
        }
    }
}
