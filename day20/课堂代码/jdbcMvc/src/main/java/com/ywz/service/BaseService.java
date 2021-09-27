package com.ywz.service;

import java.util.List;

public interface BaseService<T> {

    public void add(T t);
    public List<T> get(T t);

    public void remove(T t);
    public void modify(T t);
}
