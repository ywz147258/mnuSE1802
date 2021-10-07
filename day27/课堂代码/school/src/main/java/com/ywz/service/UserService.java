package com.ywz.service;

import com.ywz.entity.User;

import java.util.List;

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

    /**
     * 获取用户列表
     * @return
     */
    public List<User> getUsers(User user);

    /**
     * 获取用户条数
     * @return
     */
    public int getUserCount();

    /**
     * 删除用户
     */
    public void userDelete(Integer id);
}
