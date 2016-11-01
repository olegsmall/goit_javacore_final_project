import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 01.11.2016.
 */
public class DAOImpl<T> implements DAO<T> {

    List<T> db;

    public DAOImpl() {
        this.db = new ArrayList<T>();
    }

    @Override
    public T save(T t) {

        return null;
    }

    @Override
    public boolean delete(T t) {
        return false;
    }

    @Override
    public T update(T t) {
        return null;
    }

    @Override
    public List<T> getAll() {
        return db;
    }
}
