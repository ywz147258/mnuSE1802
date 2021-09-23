package CDatabase.service.impl;

import CDatabase.dao.UserDao;
import CDatabase.entity.User;
import CDatabase.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDao();

    //登陆
    @Override
    public void login(String userName, String psw) {
        User user = new User();
        user.setUserName(userName);
        user.setPsw(psw);
        userDao.selects(user);
    }
}
