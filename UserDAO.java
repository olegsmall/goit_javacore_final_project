import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergiy on 11/6/16.
 */

public class UserDAO<T extends BaseEntity> extends DAO<User> {

    List<T> userList = new ArrayList<>();

        public T save(T t) {
            userList.add(t);
            return t;
        }


        public T findUserById(long id) { 
            for (T item : userList) {
                if (item.getId() == id)
                    return item;
            }
            return null;
        }
    }





