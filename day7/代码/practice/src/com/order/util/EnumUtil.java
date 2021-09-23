package com.order.util;

import com.order.enums.FoodEnum;
import com.order.exception.EnumException;

public class EnumUtil {
    public static void judgeContain(Integer no) throws EnumException {
        //遍历食物枚举，来判断顾客点的餐是否有在菜单
        boolean containEnum=false;

        for(FoodEnum foodEnum:FoodEnum.values()){
            if(no.equals(foodEnum.getNo())){
                containEnum=true;
            }
        }

        if(containEnum==false){
            throw new EnumException("您点的菜不在菜单内，请重新选择");
        }
    }
}
