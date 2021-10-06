package com.ywa.dao;


import com.ywa.entity.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends BaseDao<User>{
    @Override
    public void insert(User user) {
        String sql = "insert into users(user_name,pass_word,sex,education,detail,email,skill) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1,user.getUserName());
            ps.setString(2,user.getPassWord());
            ps.setInt(3,user.getSex());
            ps.setInt(4,user.getEducation());
            ps.setString(5,user.getDetail());
            ps.setString(6,user.getEmail());
            ps.setString(7,user.getSkill());
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

    /**
     * 根据用户名获取用户数量
     * @param user
     * @return
     */
    public Integer selectUserName(User user){
        String sql ="select count(1) as counts from users where user_name = ?";
        Integer count =0;
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1,user.getUserName());
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                count=rs.getInt("counts");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 根据用户名获取用户数量
     * @param user
     * @return
     */
    public Integer selectUserNameByTel(User user){
        String sql ="select count(1) as counts from users where tel = ?";
        Integer count =0;
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1,user.getTel());
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                count=rs.getInt("counts");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }


}
