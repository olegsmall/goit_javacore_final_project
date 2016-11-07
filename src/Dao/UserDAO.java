package src.Dao;

import src.Entitys.User;

/**
 * Created by Sergiy on 11/6/16.
 */
public class UserDAO extends DAO<User> {


        public User findUserById(long id) {
            return db.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
        }
    }





