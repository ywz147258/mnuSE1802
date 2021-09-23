package CDatabase.dao;

import CDatabase.entity.User;

import java.util.List;

public class UserDao implements Dao<User>{
    //查询
    @Override
    public List<User> selects(User user){
        user.getUserName();
        user.getPsw();
        // select * from user where userName =username and psw =psw;
        return null;
    }
}
