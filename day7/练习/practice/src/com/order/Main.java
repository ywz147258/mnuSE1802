package com.order;

import com.order.entity.Food;
import com.order.enums.FoodEnum;
import com.order.exception.EnumException;
import com.order.service.AdminService;
import com.order.service.impl.AdminServiceImpl;
import com.order.util.EnumUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //顾客选择食物后的数据库
//        List<FoodEnum> foods= new ArrayList<>();

        //管理员
        AdminService admin= new AdminServiceImpl();

        //设置数量
        Food sushi= new Food(FoodEnum.Sushi.getPrice(),FoodEnum.Sushi.getName());
        admin.setPrice(sushi,10);
        Food noodle=new Food(FoodEnum.Noodle.getPrice(),FoodEnum.Noodle.getName());
        admin.setPrice(noodle,20);

        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎光临深夜食堂");
        System.out.println("请开始点餐。1 寿司，2 泡面");

        //1 寿司，2 泡面

        boolean isContinue=true;
        while(isContinue){
            try {
                //总价
                Integer allPrice=0;
                //顾客选择的菜单编号
                Integer no= scanner.nextInt();
                //判断菜单编号是否在菜单里
                EnumUtil.judgeContain(no);
                isContinue=false;
                System.out.println("请选择数量");
                Integer foodNumber = scanner.nextInt();
                //判断顾客选择是什么食材
                if(no.equals(1)){
                    //删库存
                    sushi.setNumber(sushi.getNumber()-foodNumber);
                    //计算价格
                    allPrice=foodNumber*sushi.getPrice();
                }

            } catch (EnumException e) {
                System.out.println(e.getMessage());
                isContinue=true;
            }
        }

    }
}
