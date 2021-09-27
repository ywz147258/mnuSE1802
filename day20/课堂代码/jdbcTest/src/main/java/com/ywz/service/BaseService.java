package com.ywz.service;

import java.util.List;

public interface  BaseService<T> {
    public abstract void add(T t);

    public abstract List<T> get(T t);
}
