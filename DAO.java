import java.util.List;

/**
 * Created by Димон on 31.10.2016.
 */
interface DAO<T> {

    T saveNew(T t);

    boolean delete(T t);

    List<T> getAll();

}


