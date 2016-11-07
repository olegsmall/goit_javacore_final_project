package src.Dao;

import src.Dao.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import src.Entitys.*;
import src.Enams.*;

/**
 * Created by Администратор on 02.11.2016.
 */
public class HotelDAO extends DAO<Hotel> {

    {
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

    public List<Hotel> findByName(String name) {
        return db.stream().filter((a) -> a.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Hotel> findByCity(String city) {
        return db.stream().filter((a) -> a.getCity().equals(city)).collect(Collectors.toList());
    }

    public Hotel findHotelById(long id) {
        return db.stream().filter(hotel -> hotel.getId() == id).findFirst().orElse(null);
    }

    public List<Room> getAllNotReservedRooms() {
        List<Room> allRooms = new ArrayList<>();
        for (Hotel hotel : db) {
            List<Room> rooms = hotel.getRooms().stream().filter(room -> room.getReservedForUser() == null).collect(Collectors.toList());
            allRooms.addAll(rooms);
        }
        return allRooms;
    }
}
