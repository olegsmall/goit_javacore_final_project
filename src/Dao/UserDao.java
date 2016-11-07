package src.Dao;

import src.DatabaseEmulator.Tables.Tables;
import src.DatabaseEmulator.Tables.UsersTable;
import src.Entitys.User;

import java.util.List;

public class UserDao implements Dao<User> {

    @Override
    public void add(User user) {
        Tables<User> userTables = new UsersTable();
        try {
            userTables.add(user);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "(" + e.getStackTrace() + ")");
        }
    }

    @Override
    public void update(User user) {
        Tables<User> userTables = new UsersTable();
        try {
            userTables.update(user);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "(" + e.getStackTrace() + ")");
        }
    }

    @Override
    public void delete(long id) {
        Tables<User> userTables = new UsersTable();
        try {
            userTables.delete(id);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "(" + e.getStackTrace() + ")");
        }
    }

    @Override
    public User findByID(long id) {
        UsersTable userTables = new UsersTable();
        try {
            return userTables.findByID(id);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "(" + e.getStackTrace() + ")");
            return null;
        }
    }

    @Override
    public List<User> getAll() {
        UsersTable userTables = new UsersTable();
        return userTables.getAll();
    }
}





