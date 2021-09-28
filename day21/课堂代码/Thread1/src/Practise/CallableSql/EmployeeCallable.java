package Practise.CallableSql;

import Practise.BaseDao;

import java.util.concurrent.Callable;

public class EmployeeCallable implements Callable<Long> {
    @Override
    public Long call() throws Exception {
        BaseDao baseDao= new BaseDao();
        baseDao.insertEmployee();
        long end = System.currentTimeMillis();
        return end;
    }
}
