package com.ywz.service;

import com.ywz.entity.User;

public interface UserService {
    /**
     * 判断用户是否存在
     * @param user
     * @return
     */
    public boolean judgeUser(User user);
}
