package Practise;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BaseDao {
    //单例
    private static Connection con;
    public BaseDao(){
        try{
            if(con==null){
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/supermarket?useUnicode=true&characterEncoding=UTF-8";
                //数据库账号
                String user = "root";
                //数据库的密码
                String password = "";
                //链接数据库
                con= DriverManager.getConnection(url,user,password);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void insertGoods(){
        String sql ="insert into goods(name,price) values(?,?)";
        for(int i=0;i<200;i++){
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,"衣服"+i);
                ps.setBigDecimal(2,new BigDecimal(100));
                ps.execute();
                System.out.println(ps);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void insertEmployee(){
        String sql ="insert into employee(name,worker_no) values(?,?)";
        for(int i=0;i<200;i++){
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,"员工"+i);
                ps.setBigDecimal(2,new BigDecimal(i));
                ps.execute();
                System.out.println(ps);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
