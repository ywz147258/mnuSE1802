package Practise;

public class Main {
    public static void main(String[] args) {
        SqlThread sqlGoods = new SqlThread();
        sqlGoods.setName("goods");
        SqlThread sqlEmployee = new SqlThread();
        sqlEmployee.setName("employee");

        long start= System.currentTimeMillis();
        sqlGoods.start();
        sqlEmployee.start();
        long end =System.currentTimeMillis();
        //为何先运行完这段，因为这段是在主线程里面的，主线程跟另外两个子线程是独立的
        System.out.println("多线程花费总时间："+(end-start));
    }
}
