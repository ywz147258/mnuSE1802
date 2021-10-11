package com.ywz.entity;

import lombok.Data;

@Data
public class Book extends PageQuery{
    private Integer id;
    private String name;
    private String href;
}
