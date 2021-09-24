import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/supermarket?useUnicode=true&characterEncoding=UTF-8";
        //数据库账号
        String user = "root";
        //数据库的密码
        String password = "";
        long start= System.currentTimeMillis();
        //链接数据库,这段非常费时
        Connection con= DriverManager.getConnection(url,user,password);
       for(Integer i=0;i<1000;i++){
           Statement statement = con.createStatement();
           statement.execute("insert into goods(name,price) values('商品"+i+"',100)");
           statement.close();

       }
        con.close();
        long end =System.currentTimeMillis();
        System.out.println("本次执行添加所用毫秒数："+(end-start));

        //14092

        //6744
    }
}
