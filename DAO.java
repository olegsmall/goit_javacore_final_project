/**
 * Created by Димон on 31.10.2016.
 */
interface DAO<T> {

    T save(T t);

    boolean delete(T t);

    T update(T t);

    T findById(long id);

}
