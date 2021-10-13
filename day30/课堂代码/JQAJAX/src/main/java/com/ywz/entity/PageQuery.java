package com.ywz.entity;

import lombok.Data;

@Data
public class PageQuery {
    private Integer start=0;
    private Integer limit=5;
}
