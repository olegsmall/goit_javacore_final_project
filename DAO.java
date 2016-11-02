import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Димон on 31.10.2016.
 */
abstract class DAO<T> {
    Set<T> db;

    public DAO() {
        this.db = new HashSet<T>();
    }

    protected T add(T t){
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
        };

    protected boolean delete(T t){
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
    };
}


