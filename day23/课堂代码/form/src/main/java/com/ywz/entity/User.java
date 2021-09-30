package com.ywz.entity;

import lombok.Data;

@Data
public class User {
    private String userName;
    private String passWord;
    private Integer sex;
    private String email;
    private Integer education;
    private String detail;
    private String skill;

}
