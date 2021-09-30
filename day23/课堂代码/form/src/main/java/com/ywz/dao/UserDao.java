package com.ywz.dao;

import com.ywz.entity.User;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends BaseDao<User>{
    @Override
    public void insert(User user) {
        String sql = "insert into users(user_name,pass_word) values(?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1,user.getUserName());
            ps.setString(2,user.getPassWord());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> select(User user) {
        return null;
    }
}
