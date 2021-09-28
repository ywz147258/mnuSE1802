package Practise.CallableSql;

import Practise.BaseDao;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {

        GoodsCallable goodsCallable = new GoodsCallable();
        FutureTask<Long> goodsResult= new FutureTask(goodsCallable);
        Thread threadGoods= new Thread(goodsResult);


        EmployeeCallable employeeCallable = new EmployeeCallable();
        FutureTask<Long> employeeResult= new FutureTask(employeeCallable);
        Thread threadEmployee= new Thread(employeeResult);
        long start=System.currentTimeMillis();
        threadGoods.start();
        threadEmployee.start();
        try {
            Long goodsTimeEnd = goodsResult.get();
            Long employeeTimeEnd =employeeResult.get();
            if(goodsTimeEnd>employeeTimeEnd){
                System.out.println("多线程花费总时间："+(goodsTimeEnd-start));
            }else{
                System.out.println("多线程花费总时间："+(employeeTimeEnd-start));
            }
            //4629
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

//        long start =System.currentTimeMillis();
//        BaseDao baseDao = new BaseDao();
//        baseDao.insertEmployee();
//        baseDao.insertGoods();
//        long end =System.currentTimeMillis();
//        System.out.println("单线程花费总时间："+(end-start));
    }
}
