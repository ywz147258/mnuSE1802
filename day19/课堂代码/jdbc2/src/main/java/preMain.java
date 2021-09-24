import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class preMain {
    public static void main(String[] args) throws Exception{
        //mysql 数据库链接
        String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8";
        //数据库账号
        String user = "root";
        //数据库的密码
        String password = "";
        //用放射的方式加载数据库驱动
        Class.forName("com.mysql.jdbc.Driver");
        //链接数据库
        Connection con= DriverManager.getConnection(url,user,password);
        PreparedStatement ps= con.prepareStatement("insert student(name) values(?)");
        //可以往预处理加入交多的字符
        ps.setString(1,"朱龙");
        ps.execute();
        ps.close();
        con.close();
    }
}
