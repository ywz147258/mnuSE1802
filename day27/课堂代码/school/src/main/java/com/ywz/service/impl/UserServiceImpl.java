package com.ywz.service.impl;

import com.ywz.dao.UserDao;
import com.ywz.entity.User;
import com.ywz.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao= new UserDao();

    public List<User> getUsers(User user){
        List<User> list = userDao.select(user);
        return list;
    }

    @Override
    public int getUserCount() {
        return userDao.selectUserName();
    }

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
