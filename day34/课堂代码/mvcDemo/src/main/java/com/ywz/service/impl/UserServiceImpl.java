package com.ywz.service.impl;

import com.ywz.dao.UserDao;
import com.ywz.entity.User;
import com.ywz.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao();
    @Override
    public boolean judgeUser(User user) {
        Integer count =userDao.selectCount(user);
        if(count>0){
            return true;
        }else {
            return false;
        }
    }
}
