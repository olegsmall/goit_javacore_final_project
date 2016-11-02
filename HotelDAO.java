import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Администратор on 02.11.2016.
 */
public class HotelDAO extends DAO<Hotel>{

    {
        db.add(new Hotel("ПРЕМЬЕР ПАЛАС", "Киев", 10));
        db.add(new Hotel("ОТЕЛЬ ХАЯТТ", "Киев", 11));
        db.add(new Hotel("Космополит", "Kharkiv", 12));
        db.add(new Hotel("Гостинный двор", "Kharkiv", 10));
        db.add(new Hotel("Astoria", "Lviv", 11));
        db.add(new Hotel("Nobilis", "Lviv", 12));

        List<Room> rooms0 = new ArrayList<>();
        rooms0.add(new Room(1, 2500, Currency.UAH, 1, RoomType.Lux, db.get(0)));
        rooms0.add(new Room(2, 3300, Currency.UAH, 2, RoomType.Lux, db.get(0)));
        rooms0.add(new Room(3, 1500, Currency.UAH, 1, RoomType.Standart, db.get(0)));
        rooms0.add(new Room(4, 1800, Currency.UAH, 2, RoomType.Standart, db.get(0)));
        rooms0.add(new Room(5, 2200, Currency.UAH, 3, RoomType.Standart, db.get(0)));
        rooms0.add(new Room(6, 1000, Currency.UAH, 1, RoomType.Econom, db.get(0)));
        rooms0.add(new Room(7, 1300, Currency.UAH, 2, RoomType.Econom, db.get(0)));
        rooms0.add(new Room(8, 1300, Currency.UAH, 2, RoomType.Econom, db.get(0)));
        rooms0.add(new Room(9, 1600, Currency.UAH, 3, RoomType.Econom, db.get(0)));
        rooms0.add(new Room(10, 1600, Currency.UAH, 3, RoomType.Econom, db.get(0)));
        db.get(0).addRoom(rooms0);

        List<Room> rooms1 = new ArrayList<>();
        rooms1.add(new Room(1, 2500, Currency.USD, 2, RoomType.Lux, db.get(1)));
        rooms1.add(new Room(2, 2500, Currency.USD, 2, RoomType.Lux, db.get(1)));
        rooms1.add(new Room(3, 2500, Currency.USD, 2, RoomType.Lux, db.get(1)));
        rooms1.add(new Room(4, 2500, Currency.USD, 2, RoomType.Lux, db.get(1)));
        rooms1.add(new Room(5, 2500, Currency.USD, 2, RoomType.Lux, db.get(1)));
        rooms1.add(new Room(6, 2500, Currency.USD, 2, RoomType.Lux, db.get(1)));
        rooms1.add(new Room(7, 2500, Currency.USD, 2, RoomType.Lux, db.get(1)));
        rooms1.add(new Room(8, 2500, Currency.USD, 2, RoomType.Lux, db.get(1)));
        rooms1.add(new Room(9, 2500, Currency.USD, 2, RoomType.Lux, db.get(1)));
        rooms1.add(new Room(10, 2500, Currency.USD, 2, RoomType.Lux, db.get(1)));
        rooms1.add(new Room(11, 2500, Currency.USD, 2, RoomType.Lux, db.get(1)));
        db.get(1).addRoom(rooms1);

        List<Room> rooms2 = new ArrayList<>();
        rooms2.add(new Room(1, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        rooms2.add(new Room(2, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        rooms2.add(new Room(3, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        rooms2.add(new Room(4, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        rooms2.add(new Room(5, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        rooms2.add(new Room(6, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        rooms2.add(new Room(7, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        rooms2.add(new Room(8, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        rooms2.add(new Room(9, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        rooms2.add(new Room(10, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        rooms2.add(new Room(11, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        rooms2.add(new Room(12, 2500, Currency.UAH, 2, RoomType.Lux, db.get(2)));
        db.get(2).addRoom(rooms2);

        List<Room> rooms3 = new ArrayList<>();
        rooms3.add(new Room(1, 2500, Currency.USD, 2, RoomType.Lux, db.get(3)));
        rooms3.add(new Room(2, 2500, Currency.USD, 2, RoomType.Lux, db.get(3)));
        rooms3.add(new Room(3, 2500, Currency.USD, 2, RoomType.Lux, db.get(3)));
        rooms3.add(new Room(4, 2500, Currency.USD, 2, RoomType.Lux, db.get(3)));
        rooms3.add(new Room(5, 2500, Currency.USD, 2, RoomType.Lux, db.get(3)));
        rooms3.add(new Room(6, 2500, Currency.USD, 2, RoomType.Lux, db.get(3)));
        rooms3.add(new Room(7, 2500, Currency.USD, 2, RoomType.Lux, db.get(3)));
        rooms3.add(new Room(8, 2500, Currency.USD, 2, RoomType.Lux, db.get(3)));
        rooms3.add(new Room(9, 2500, Currency.USD, 2, RoomType.Lux, db.get(3)));
        rooms3.add(new Room(10, 2500, Currency.USD, 2, RoomType.Lux, db.get(3)));
        db.get(3).addRoom(rooms3);

        List<Room> rooms4 = new ArrayList<>();
        rooms4.add(new Room(1, 2500, Currency.UAH, 2, RoomType.Lux, db.get(4)));
        rooms4.add(new Room(2, 2500, Currency.UAH, 2, RoomType.Lux, db.get(4)));
        rooms4.add(new Room(3, 2500, Currency.UAH, 2, RoomType.Lux, db.get(4)));
        rooms4.add(new Room(4, 2500, Currency.UAH, 2, RoomType.Lux, db.get(4)));
        rooms4.add(new Room(5, 2500, Currency.UAH, 2, RoomType.Lux, db.get(4)));
        rooms4.add(new Room(6, 2500, Currency.UAH, 2, RoomType.Lux, db.get(4)));
        rooms4.add(new Room(7, 2500, Currency.UAH, 2, RoomType.Lux, db.get(4)));
        rooms4.add(new Room(8, 2500, Currency.UAH, 2, RoomType.Lux, db.get(4)));
        rooms4.add(new Room(9, 2500, Currency.UAH, 2, RoomType.Lux, db.get(4)));
        rooms4.add(new Room(10, 2500, Currency.UAH, 2, RoomType.Lux, db.get(4)));
        rooms4.add(new Room(11, 2500, Currency.UAH, 2, RoomType.Lux, db.get(4)));
        db.get(4).addRoom(rooms4);

        List<Room> rooms5 = new ArrayList<>();
        rooms5.add(new Room(1, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        rooms5.add(new Room(2, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        rooms5.add(new Room(3, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        rooms5.add(new Room(4, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        rooms5.add(new Room(5, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        rooms5.add(new Room(6, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        rooms5.add(new Room(7, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        rooms5.add(new Room(8, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        rooms5.add(new Room(9, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        rooms5.add(new Room(10, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        rooms5.add(new Room(11, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        rooms5.add(new Room(12, 2500, Currency.UAH, 2, RoomType.Lux, db.get(5)));
        db.get(5).addRoom(rooms5);
    }

    public List<Hotel> findByName(String name) {
      return db.stream().filter((a) -> a.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Hotel> findByCity(String city) {
        return db.stream().filter((a) -> a.getCity().equals(city)).collect(Collectors.toList());
    }
}
