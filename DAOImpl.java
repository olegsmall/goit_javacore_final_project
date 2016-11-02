import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Администратор on 01.11.2016.
 */
public class DAOImpl<T> implements DAO<T> {

    List<T> db;

    public DAOImpl() {
        this.db = new ArrayList<T>();
    }

    @Override
    public T saveNew(T t) {
        db.add(t);
        return t;
    }

    @Override
    public boolean delete(T t) {
        try {
            // этот эксепшн никогда не сработает, потому что если объкт не будет найден
            // вернется фолсе.
            // тут можно отлавивать помытку удалить объект несовместимого типа.
//            метод контейнс нам тут не нужен, мы можем сразу юзать ремов
            
            db.contains(t);
        } catch (NullPointerException ex) {
            System.out.println("Object does not exist in database");
        }

        db.remove(t);
        return true;
    }

    @Override
    public List<T> getAll() {
        return db.stream().collect(Collectors.toList());
    }
}
