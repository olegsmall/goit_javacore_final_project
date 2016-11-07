package src.Dao;

import java.util.List;

/**
 * Created by Администратор on 07.11.2016.
 */
public interface Dao<T> {
    void add(T t);
    void update(T t);
    void delete(long id);
    T findByID(long id);
    List<T> getAll();
}
