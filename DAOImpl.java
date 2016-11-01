/**
 * Created by Администратор on 01.11.2016.
 */
public class DAOImpl<T> implements DAO<T> {

    @Override
    public T saveNew(T t) {
        db.add(t);
        return t;
    }

    @Override
    public boolean delete(T t) {
        //db.remove(t);
        return false;
    }

    @Override
    public List<T> getAll() {
        return db;
    }
}
