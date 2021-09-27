package com.ywz.entity;

import java.math.BigDecimal;

public class Goods {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }



    /**
     * id
     */

    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 价格
     */
    private BigDecimal price;

}
