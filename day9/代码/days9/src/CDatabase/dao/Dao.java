package CDatabase.dao;

import java.util.List;

public interface Dao<T> {
    public List<T> selects(T t);
}
