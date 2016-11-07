package src.DatabaseEmulator.Tables;

import java.util.List;

public interface Tables<T> {

    void add(T t);

    void update(T t);

    void delete(long id);

    T findByID(long id);

    List<T> getAll();
}
