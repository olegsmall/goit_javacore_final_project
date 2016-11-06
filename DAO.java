import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Димон on 31.10.2016.
 */
abstract class DAO<T> {

    protected List<T> db;

    public DAO() {
        this.db = new ArrayList<T>();
    }

    protected boolean add(T t){
        try {
            if (t != null) {
                this.db.add(t);
            }else {
                System.out.println("The object is not saved because it is null");
            }
        }catch (ClassCastException e) {
            System.out.println("The object is not saved because of a type mismatch");
            return false;
        }
        return true;
        }

    protected boolean delete(T t){
        try {
                if (t != null) {
                    this.db.remove(t);
                }else {
                    System.out.println("The object can't be deleted because it is null");
                }
            } catch (ClassCastException e) {
                System.out.println("The object can't be deleted because of a type mismatch");
                return false;
            }
        return true;
    }
}


