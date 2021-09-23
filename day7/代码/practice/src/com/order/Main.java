package com.order;

import com.order.entity.Food;
import com.order.enums.FoodEnum;
import com.order.exception.EnumException;
import com.order.service.AdminService;
import com.order.service.OrderService;
import com.order.service.impl.AdminServiceImpl;
import com.order.service.impl.PackageServiceImpl;
import com.order.util.EnumUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //顾客选择食物后的数据库
//        List<FoodEnum> foods= new ArrayList<>();

        Integer eatType=1;

        //管理员
        AdminService admin= new AdminServiceImpl();

        //实例化点餐类
        OrderService packages= new PackageServiceImpl();
        OrderService local=new PackageServiceImpl();

        //设置数量
        Food sushi= new Food(FoodEnum.Sushi.getPrice(),FoodEnum.Sushi.getName());
        admin.setPrice(sushi,10);
        Food noodle=new Food(FoodEnum.Noodle.getPrice(),FoodEnum.Noodle.getName());
        admin.setPrice(noodle,20);

        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎光临深夜食堂");
        System.out.println("外卖或是堂食。1外卖，2堂食");


        //是否继续选择点餐方式
        boolean isEatTypeContinue=true;
        while(isEatTypeContinue){
            try {
                eatType=scanner.nextInt();
                if(eatType!=1&&eatType!=2){
                    throw new Exception("请选择外卖或者堂食");
                }else{
                    isEatTypeContinue=false;
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
                isEatTypeContinue=true;
            }
        }

        System.out.println("请开始点餐。1 寿司，2 泡面");
        //1 寿司，2 泡面
        boolean isContinue=true;


        while(isContinue){
            //总价
            Integer allPrice=0;
            //顾客选择的菜单编号
            Integer no= scanner.nextInt();

            try {
                //判断菜单编号是否在菜单里
                EnumUtil.judgeContain(no);

            } catch (EnumException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                isContinue=true;
            }

            isContinue=false;
            System.out.println("请选择数量");
            Integer foodNumber = scanner.nextInt();
            //判断顾客选择是什么食材
            if(no.equals(1)){
                //删库存
                sushi.setNumber(sushi.getNumber()-foodNumber);
                //如果是外卖
                if(eatType==1){
                    allPrice= packages.order(FoodEnum.Sushi,foodNumber);
                }else{
                    allPrice= local.order(FoodEnum.Sushi,foodNumber);
                }
            }
            System.out.println("您总共消费了"+allPrice);
        }

    }
}
