import java.sql.*;

public class Main {
    public static void main(String[] args) {
        //mysql 数据库链接
        String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8";
        //数据库账号
        String user = "root";
        //数据库的密码
        String password = "";
        try {
            //用放射的方式加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            //链接数据库
            Connection con= DriverManager.getConnection(url,user,password);
            //创建sql语句执行对象
            Statement statement =con.createStatement();
            //获取数据集
            ResultSet rs= statement.executeQuery("select * from student");
            while(rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("id"));
            }
            // "xxx''/99"
            String name="郭富城";
            //添加
            String insertSql="insert into student(name) values('"+name+"')";
            statement.execute(insertSql);
            //删除
            String deleteSql ="delete from student where id in (6,7,8)";
            Integer rows= statement.executeUpdate(deleteSql);
            System.out.println("删除了"+rows+"行");
            rs.close();
            statement.close();
            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
