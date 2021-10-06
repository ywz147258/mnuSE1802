package com.ywa.service;

import com.ywa.entity.User;

public interface UserService {

    /**
     * 判断用户是否存在
     * @param user
     * @return
     */
    public boolean getUserCounts(User user);

    /**
     * 判断用户是否存在
     * @param user
     * @return
     */
    public boolean getUserCountsByTel(User user);
}
