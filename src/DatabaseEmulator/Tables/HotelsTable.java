package src.DatabaseEmulator.Tables;

import src.Enams.Currency;
import src.Enams.RoomType;
import src.Entitys.Hotel;
import src.Entitys.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Администратор on 07.11.2016.
 */
public class HotelsTable implements Tables<Hotel>{
    private static  List<Hotel> db = new ArrayList<>();

    static {
        Hotel hotel1 = (new Hotel("ПРЕМЬЕР ПАЛАС", "Kiev"));
        Hotel hotel2 = (new Hotel("ОТЕЛЬ ХАЯТТ", "Kiev"));
        Hotel hotel3 = (new Hotel("Космополит", "Kharkiv"));
        Hotel hotel4 = (new Hotel("Гостинный двор", "Kharkiv"));
        Hotel hotel5 = (new Hotel("Astoria", "Lviv"));
        Hotel hotel6 = (new Hotel("Nobilis", "Lviv"));

        db.add(hotel1);
        db.add(hotel2);
        db.add(hotel3);
        db.add(hotel4);
        db.add(hotel5);
        db.add(hotel6);

        new Room(1, 2500, Currency.UAH, 1, RoomType.Lux, hotel1);
        new Room(2, 3300, Currency.UAH, 2, RoomType.Lux, hotel1);
        new Room(3, 1500, Currency.UAH, 1, RoomType.Standart, hotel1);
        new Room(4, 1800, Currency.UAH, 2, RoomType.Standart,hotel1);
        new Room(5, 2200, Currency.UAH, 3, RoomType.Standart, hotel1);
        new Room(6, 1000, Currency.UAH, 1, RoomType.Econom, hotel1);
        new Room(7, 1300, Currency.UAH, 2, RoomType.Econom, hotel1);
        new Room(8, 1300, Currency.UAH, 2, RoomType.Econom, hotel1);
        new Room(9, 1600, Currency.UAH, 3, RoomType.Econom, hotel1);
        new Room(10, 1600, Currency.UAH, 3, RoomType.Econom, hotel1);

        new Room(1, 2500, Currency.USD, 2, RoomType.Lux, hotel2);
        new Room(2, 2500, Currency.USD, 2, RoomType.Lux, hotel2);
        new Room(3, 2500, Currency.USD, 2, RoomType.Lux, hotel2);
        new Room(4, 2500, Currency.USD, 2, RoomType.Lux, hotel2);
        new Room(5, 2500, Currency.USD, 2, RoomType.Lux, hotel2);
        new Room(6, 2500, Currency.USD, 2, RoomType.Lux, hotel2);
        new Room(7, 2500, Currency.USD, 2, RoomType.Lux, hotel2);
        new Room(8, 2500, Currency.USD, 2, RoomType.Lux, hotel2);
        new Room(9, 2500, Currency.USD, 2, RoomType.Lux, hotel2);
        new Room(10, 2500, Currency.USD, 2, RoomType.Lux, hotel2);
        new Room(11, 2500, Currency.USD, 2, RoomType.Lux, hotel2);

        new Room(1, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);
        new Room(2, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);
        new Room(3, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);
        new Room(4, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);
        new Room(5, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);
        new Room(6, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);
        new Room(7, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);
        new Room(8, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);
        new Room(9, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);
        new Room(10, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);
        new Room(11, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);
        new Room(12, 2500, Currency.UAH, 2, RoomType.Lux, hotel3);

        new Room(1, 2500, Currency.USD, 2, RoomType.Lux, hotel4);
        new Room(2, 2500, Currency.USD, 2, RoomType.Lux, hotel4);
        new Room(3, 2500, Currency.USD, 2, RoomType.Lux, hotel4);
        new Room(4, 2500, Currency.USD, 2, RoomType.Lux, hotel4);
        new Room(5, 2500, Currency.USD, 2, RoomType.Lux, hotel4);
        new Room(6, 2500, Currency.USD, 2, RoomType.Lux, hotel4);
        new Room(7, 2500, Currency.USD, 2, RoomType.Lux, hotel4);
        new Room(8, 2500, Currency.USD, 2, RoomType.Lux, hotel4);
        new Room(9, 2500, Currency.USD, 2, RoomType.Lux, hotel4);
        new Room(10, 2500, Currency.USD, 2, RoomType.Lux,hotel4);

        new Room(1, 2500, Currency.UAH, 2, RoomType.Lux, hotel5);
        new Room(2, 2500, Currency.UAH, 2, RoomType.Lux, hotel5);
        new Room(3, 2500, Currency.UAH, 2, RoomType.Lux, hotel5);
        new Room(4, 2500, Currency.UAH, 2, RoomType.Lux, hotel5);
        new Room(5, 2500, Currency.UAH, 2, RoomType.Lux, hotel5);
        new Room(6, 2500, Currency.UAH, 2, RoomType.Lux, hotel5);
        new Room(7, 2500, Currency.UAH, 2, RoomType.Lux, hotel5);
        new Room(8, 2500, Currency.UAH, 2, RoomType.Lux, hotel5);
        new Room(9, 2500, Currency.UAH, 2, RoomType.Lux, hotel5);
        new Room(10, 2500, Currency.UAH, 2, RoomType.Lux,hotel5);
        new Room(11, 2500, Currency.UAH, 2, RoomType.Lux,hotel5);

        new Room(1, 2500, Currency.UAH, 2, RoomType.Lux, hotel6);
        new Room(2, 2500, Currency.UAH, 2, RoomType.Lux, hotel6);
        new Room(3, 2500, Currency.UAH, 2, RoomType.Lux, hotel6);
        new Room(4, 2500, Currency.UAH, 2, RoomType.Lux, hotel6);
        new Room(5, 2500, Currency.UAH, 2, RoomType.Lux, hotel6);
        new Room(6, 2500, Currency.UAH, 2, RoomType.Lux, hotel6);
        new Room(7, 2500, Currency.UAH, 2, RoomType.Lux, hotel6);
        new Room(8, 2500, Currency.UAH, 2, RoomType.Lux, hotel6);
        new Room(9, 2500, Currency.UAH, 2, RoomType.Lux, hotel6);
        new Room(10, 2500, Currency.UAH, 2, RoomType.Lux,hotel6);
        new Room(11, 2500, Currency.UAH, 2, RoomType.Lux,hotel6);
        new Room(12, 2500, Currency.UAH, 2, RoomType.Lux,hotel6);
    }

    @Override
    public void add(Hotel hotel) {
        if (hotel == null) {
            throw new NullPointerException("You try to save null to the DB");
        }
        if (db.stream().anyMatch(hotel1 -> hotel1.equals(hotel))) {
            throw new NullPointerException("This hotel is already is in DB");
        }
        db.add(hotel);
    }

    @Override
    public void update(Hotel hotel) {
        if (hotel == null) {
            throw new NullPointerException("You try to update null in the DB");
        }
        if (db.stream().anyMatch(hotel1 -> hotel1.equals(hotel))) {
            throw new NullPointerException("This hotel is already is in DB");
        }
        Hotel dbHotel = db.stream().filter(hotel1 -> hotel1.getId() == hotel.getId()).findFirst().orElse(null);
        if (dbHotel == null) {
            throw new NullPointerException("You can't update hotel. There is no hotel hotel with id: " + hotel.getId() + " in DB");
        }
        dbHotel.setName(hotel.getName());
        dbHotel.setCity(hotel.getCity());
    }

    @Override
    public void delete(long id) {
        Hotel dbHotel = db.stream().filter(hotel -> hotel.getId() == id).findFirst().orElse(null);
        if (dbHotel == null) {
            throw new NullPointerException("You can't delete hotel. There is no hotel with id: " + id + " in DB");
        }
        db.remove(dbHotel);
    }

    @Override
    public Hotel findByID(long id) {
        Hotel dbHotel = db.stream().filter(hotel -> hotel.getId() == id).findFirst().orElse(null);
        if (dbHotel == null) {
            throw new NullPointerException("Nothing found. There is no hotel with id: " + id + " in DB");
        }
        return dbHotel;
    }

    @Override
    public List<Hotel> getAll() {
        return db.stream().collect(Collectors.toList());
    }
}
