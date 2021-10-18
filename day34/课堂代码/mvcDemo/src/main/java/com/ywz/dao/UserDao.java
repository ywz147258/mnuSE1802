package com.ywz.dao;

import com.ywz.entity.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends BaseDao<User>{
    @Override
    public void insert(User user) {

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

    /**
     * 获取用户的数量
     * @param user
     * @return
     */
    public Integer selectCount(User user){
        String sql ="select count(1) as counts from users where user_name=? and psw =?";
        //用户数量
        Integer count=0;
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1,user.getUserName());
            ps.setString(2,user.getPsw());
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                count=rs.getInt("counts");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;
    }

}
