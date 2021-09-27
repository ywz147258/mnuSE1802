package com.ywz.service.impl;

import com.ywz.dao.BaseDao;
import com.ywz.service.BaseService;

import java.util.List;

public abstract class BaseServiceImpl<M extends BaseDao<T>,T> implements BaseService<T> {
    private M m;

    public BaseServiceImpl(M m){
        this.m=m;
    }


    @Override
    public void add(T t) {
        m.insert(t);
    }

    @Override
    public List<T> get(T t) {
        return m.select(t);
    }

    @Override
    public void remove(T t) {
        //加一些其他逻辑
        m.delete(t);
    }

    @Override
    public void modify(T t) {
        m.update(t);
    }
}
