package com.ywz.enums;

public enum CodeResult {
    NoUser("001","用户不存在"),
    UserLogin("002","用户已登陆");

    CodeResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
