package Practise;

public class SqlThread extends Thread {
    @Override
    public void run() {
        BaseDao baseDao= new BaseDao();
        if(this.getName().equals("goods")){
            baseDao.insertGoods();
        }
        if(this.getName().equals("employee")){
            baseDao.insertEmployee();
        }
    }
}
