import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

/**
 * Created by Администратор on 30.10.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Controller controller = new Controller();
        CurrentUser currentUser = new CurrentUser();

        User user = new User();
        controller.registerUser(user);


    }

    void dataBaseInitializer(Controller controller ) {
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel("ПРЕМЬЕР ПАЛАС", "Киев", 11));
        hotels.add(new Hotel("ОТЕЛЬ ХАЯТТ", "Киев", 19));
        hotels.add(new Hotel("Космополит", "Kharkiv", 14));
        hotels.add(new Hotel("Гостинный двор", "Kharkiv", 10));
        hotels.add(new Hotel("Гостинный двор", "Kharkiv", 10));
        hotels.add(new Hotel("Astoria", "Lviv", 10));
        hotels.add(new Hotel("Nobilis", "Lviv", 16));

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1, 2500, Currency.UAH, 2, RoomType.Lux, null));

    }
}
