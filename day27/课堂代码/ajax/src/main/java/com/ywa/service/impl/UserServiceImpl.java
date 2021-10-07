package com.ywa.service.impl;

import com.ywa.dao.UserDao;
import com.ywa.entity.User;
import com.ywa.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao= new UserDao();

    @Override
    public boolean getUserCounts(User user) {
        Integer counts= userDao.selectUserName(user);
        if(counts>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean getUserCountsByTel(User user) {
        Integer counts= userDao.selectUserNameByTel(user);
        if(counts>0){
            return true;
        }else{
            return false;
        }
    }
}
