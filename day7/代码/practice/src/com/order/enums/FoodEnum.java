package com.order.enums;

/**
 * 菜单
 */
public enum FoodEnum {
    Sushi(10,"寿司",1),
    Noodle(20,"泡面",2);

    FoodEnum(Integer price, String name, Integer no) {
        this.price = price;
        this.name = name;
        this.no = no;
    }

    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    private String name;

    private Integer no;

    public Integer getNo() {
        return no;
    }
}
