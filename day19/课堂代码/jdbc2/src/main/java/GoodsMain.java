import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GoodsMain {

    public static void main(String[] args) throws Exception{
        GoodsMain goodsMain= new GoodsMain();
        goodsMain.addGoods();

    }
    private Connection con;
    public GoodsMain() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/supermarket?useUnicode=true&characterEncoding=UTF-8";
        //数据库账号
        String user = "root";
        //数据库的密码
        String password = "";
        //链接数据库
        con= DriverManager.getConnection(url,user,password);
    }

    /**
     * 添加商品(给操作人员使用)
     * 这是专门针对业务层
     */
    public void addGoods(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用超市erp管理系统");

        boolean isContinue=true;
        while(isContinue){
            System.out.println("输入商品的名称");
            String name =scanner.next();
            System.out.println("输入商品的价格");
            BigDecimal price=new BigDecimal(scanner.nextFloat());
            long start= System.currentTimeMillis();
            insertGoods(name,price);
            long end =System.currentTimeMillis();
            System.out.println("本次执行添加所用毫秒数："+(end-start));
            System.out.println("继续按 1，其他停止");
            String result=scanner.next();
            isContinue=result.equals("1")?true:false;
        }
    }

    /**
     * 插入商品表(给数据操作使用)
     * @param name
     * @param price
     */
    public void insertGoods(String name,BigDecimal price){
        //用放射的方式加载数据库驱动
        Statement statement;
        String sql= "insert into goods(name,price) values('"+name+"',"+price+")";
        try {
            //创建sql语句执行对象
            statement =con.createStatement();
            statement.execute(sql);
            statement.close();
        }  catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
