package src.DatabaseEmulator.Tables;

import src.Entitys.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsersTable implements Tables<User> {

    static List<User> db = new ArrayList<>();

    @Override
    public void add(User user) {
        if (user == null) {
            throw new NullPointerException("You try to save null to the DB");
        }
        if (db.stream().anyMatch(user1 -> user1.equals(user))) {
            throw new NullPointerException("This hotel is already is in DB");
        }
        db.add(user);
    }

    @Override
    public void update(User user) {
        if (user == null) {
            throw new NullPointerException("You try to update null in the DB");
        }
        if (db.stream().anyMatch(hotel1 -> hotel1.equals(user))) {
            throw new NullPointerException("This user is already is in DB");
        }
        User dbUser = db.stream().filter(user1 -> user1.getId() == user.getId()).findFirst().orElse(null);
        if (dbUser == null) {
            throw new NullPointerException("You can't update user. There is no user hotel with id: " + user.getId() + " in DB");
        }
        dbUser.setEmail(user.getEmail());
        dbUser.setFullName(user.getFullName());
        dbUser.setPhoneNumber(user.getPhoneNumber());
    }

    @Override
    public void delete(long id) {
        User dbUser = db.stream().filter(hotel -> hotel.getId() == id).findFirst().orElse(null);
        if (dbUser == null) {
            throw new NullPointerException("You can't delete user. There is no user with id: " + id + " in DB");
        }
        db.remove(dbUser);
    }

    @Override
    public User findByID(long id) {
        User dbUser = db.stream().filter(hotel -> hotel.getId() == id).findFirst().orElse(null);
        if (dbUser == null) {
            throw new NullPointerException("Nothing found. There is no user with id: " + id + " in DB");
        }
        return dbUser;
    }

    @Override
    public List<User> getAll() {
        return db.stream().collect(Collectors.toList());
    }

}
