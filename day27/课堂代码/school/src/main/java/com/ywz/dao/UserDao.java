package com.ywz.dao;


import com.ywz.entity.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        String sql ="delete from users where id=?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1,user.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(User user) {

    }

    /**
     * 查询用户信息
     * @param user
     * @return
     */
    @Override
    public List<User> select(User user) {
        String sql = "select * from users limit ?,?";
        List<User> list = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1,user.getStart());
            ps.setInt(2,user.getLimit());
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                User userR= new User();
                userR.setSex(rs.getInt("sex"));
                userR.setPassWord(rs.getString("pass_word"));
                userR.setUserName(rs.getString("user_name"));
                userR.setDetail(rs.getString("detail"));
                userR.setEducation(rs.getInt("education"));
                userR.setEmail(rs.getString("email"));
                userR.setSkill(rs.getString("skill"));
                userR.setTel(rs.getString("tel"));
                userR.setId(rs.getInt("id"));
                list.add(userR);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 根据用户名获取用户数量
     * @return
     */
    public Integer selectUserName(){
        String sql ="select count(1) as counts from users";
        Integer count =0;
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
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

    /**
     * 查询用户信息
     * @return
     */
    public User selectUserInfo(Integer userId){
        User userR = new User();
        String sql = "select * from users where id=?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1,userId);
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                userR.setSex(rs.getInt("sex"));
                userR.setPassWord(rs.getString("pass_word"));
                userR.setUserName(rs.getString("user_name"));
                userR.setDetail(rs.getString("detail"));
                userR.setEducation(rs.getInt("education"));
                userR.setEmail(rs.getString("email"));
                userR.setSkill(rs.getString("skill"));
                userR.setTel(rs.getString("tel"));
                userR.setId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userR;
    }
}
