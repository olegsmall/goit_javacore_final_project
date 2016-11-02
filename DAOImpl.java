import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Администратор on 01.11.2016.
 */
public class DAOImpl<T> implements DAO<T> {

    Set<T> db;

    public DAOImpl() {
        this.db = new HashSet<T>();
    }

    @Override
    public T add(T t) {
        try {
            if (t == null) {
                throw new NullPointerException();
            }
            this.db.add(t);
        }catch (ClassCastException e) {
            System.out.println("The object is not saved because of a type mismatch");
            return null;
        }catch (NullPointerException e1){
            System.out.println("The object is not saved because it is null");
            return null;
        }
        return t;
    }

    @Override
    public boolean delete(T r) {
        try {
       if (t == null){
           throw new NullPointerException();
       }
            this.db.remove(t);
        } catch (ClassCastException e) {
        System.out.println("The object can't be deleted because of a type mismatch");
        return false;
    }catch (NullPointerException e1){
        System.out.println("The object can't be deleted because it is null");
        return false;
    }
        return true;
    }

    @Override
    public List<T> getAll() {
        return db.stream().collect(Collectors.toList());
    }
}
