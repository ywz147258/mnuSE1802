package com.ywz.tool;

import java.util.UUID;

public class UserTool {
    //用户登录成功后生成用户id
    public static String generateUserId(){
        String uuid= UUID.randomUUID().toString();
        return uuid;
    }
}
