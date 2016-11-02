import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

/**
 * Created by Администратор on 30.10.2016.
 */
public class Main {
    static Controller controller;
    public static void main(String[] args) throws IOException {

        dataBaseInitializer();


    }

    static void dataBaseInitializer() {
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel("ПРЕМЬЕР ПАЛАС", "Киев", 10));
        hotels.add(new Hotel("ОТЕЛЬ ХАЯТТ", "Киев", 11));
        hotels.add(new Hotel("Космополит", "Kharkiv", 12));
        hotels.add(new Hotel("Гостинный двор", "Kharkiv", 10));
        hotels.add(new Hotel("Astoria", "Lviv", 11));
        hotels.add(new Hotel("Nobilis", "Lviv", 12));

        List<Room> allRooms = new ArrayList<>();
        List<Room> rooms0 = new ArrayList<>();
        rooms0.add(new Room(1, 2500, Currency.UAH, 1, RoomType.Lux, hotels.get(0)));
        rooms0.add(new Room(2, 3300, Currency.UAH, 2, RoomType.Lux, hotels.get(0)));
        rooms0.add(new Room(3, 1500, Currency.UAH, 1, RoomType.Standart, hotels.get(0)));
        rooms0.add(new Room(4, 1800, Currency.UAH, 2, RoomType.Standart, hotels.get(0)));
        rooms0.add(new Room(5, 2200, Currency.UAH, 3, RoomType.Standart, hotels.get(0)));
        rooms0.add(new Room(6, 1000, Currency.UAH, 1, RoomType.Econom, hotels.get(0)));
        rooms0.add(new Room(7, 1300, Currency.UAH, 2, RoomType.Econom, hotels.get(0)));
        rooms0.add(new Room(8, 1300, Currency.UAH, 2, RoomType.Econom, hotels.get(0)));
        rooms0.add(new Room(9, 1600, Currency.UAH, 3, RoomType.Econom, hotels.get(0)));
        rooms0.add(new Room(10, 1600, Currency.UAH, 3, RoomType.Econom, hotels.get(0)));
        hotels.get(0).addRoom(rooms0);
        allRooms.addAll(rooms0);

        List<Room> rooms1 = new ArrayList<>();
        rooms1.add(new Room(1, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(1)));
        rooms1.add(new Room(2, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(1)));
        rooms1.add(new Room(3, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(1)));
        rooms1.add(new Room(4, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(1)));
        rooms1.add(new Room(5, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(1)));
        rooms1.add(new Room(6, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(1)));
        rooms1.add(new Room(7, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(1)));
        rooms1.add(new Room(8, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(1)));
        rooms1.add(new Room(9, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(1)));
        rooms1.add(new Room(10, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(1)));
        rooms1.add(new Room(11, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(1)));
        hotels.get(1).addRoom(rooms1);
        allRooms.addAll(rooms1);

        List<Room> rooms2 = new ArrayList<>();
        rooms2.add(new Room(1, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        rooms2.add(new Room(2, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        rooms2.add(new Room(3, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        rooms2.add(new Room(4, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        rooms2.add(new Room(5, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        rooms2.add(new Room(6, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        rooms2.add(new Room(7, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        rooms2.add(new Room(8, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        rooms2.add(new Room(9, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        rooms2.add(new Room(10, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        rooms2.add(new Room(11, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        rooms2.add(new Room(12, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(2)));
        hotels.get(2).addRoom(rooms2);
        allRooms.addAll(rooms2);

        List<Room> rooms3 = new ArrayList<>();
        rooms3.add(new Room(1, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(3)));
        rooms3.add(new Room(2, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(3)));
        rooms3.add(new Room(3, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(3)));
        rooms3.add(new Room(4, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(3)));
        rooms3.add(new Room(5, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(3)));
        rooms3.add(new Room(6, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(3)));
        rooms3.add(new Room(7, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(3)));
        rooms3.add(new Room(8, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(3)));
        rooms3.add(new Room(9, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(3)));
        rooms3.add(new Room(10, 2500, Currency.USD, 2, RoomType.Lux, hotels.get(3)));
        hotels.get(3).addRoom(rooms3);
        allRooms.addAll(rooms3);

        List<Room> rooms4 = new ArrayList<>();
        rooms4.add(new Room(1, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(4)));
        rooms4.add(new Room(2, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(4)));
        rooms4.add(new Room(3, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(4)));
        rooms4.add(new Room(4, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(4)));
        rooms4.add(new Room(5, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(4)));
        rooms4.add(new Room(6, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(4)));
        rooms4.add(new Room(7, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(4)));
        rooms4.add(new Room(8, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(4)));
        rooms4.add(new Room(9, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(4)));
        rooms4.add(new Room(10, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(4)));
        rooms4.add(new Room(11, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(4)));
        hotels.get(4).addRoom(rooms4);
        allRooms.addAll(rooms4);

        List<Room> rooms5 = new ArrayList<>();
        rooms5.add(new Room(1, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        rooms5.add(new Room(2, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        rooms5.add(new Room(3, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        rooms5.add(new Room(4, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        rooms5.add(new Room(5, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        rooms5.add(new Room(6, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        rooms5.add(new Room(7, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        rooms5.add(new Room(8, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        rooms5.add(new Room(9, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        rooms5.add(new Room(10, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        rooms5.add(new Room(11, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        rooms5.add(new Room(12, 2500, Currency.UAH, 2, RoomType.Lux, hotels.get(5)));
        hotels.get(5).addRoom(rooms5);
        allRooms.addAll(rooms5);

        controller = new Controller(hotels, allRooms);
    }
}
