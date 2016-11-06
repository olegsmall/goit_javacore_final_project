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
        List<Hotel> hotels;

        User user1 = new User("Mark", "555-55-55", "mark@mail.com");
        User user2 = new User("Stiv", "222-22-22", "stiv@mail.com");
        User user3 = new User("Bill", "333-33-33", "bill@mail.com");
        controller.addUser(user1);
        controller.addUser(user2);
        controller.addUser(user3);


        hotels =  controller.findHotelByCity("Kiev");

        controller.registerUser(user2);

        System.out.println("Свободные комнаты в отелях города Киева:");
        hotels = controller.findHotelByCity("Kiev");
        for (Hotel hotel : hotels) {
            hotel.getRooms().stream().filter((room -> room.getReservedForUser() == null)).forEach(System.out::println);
        }

        System.out.println("Свободные комнаты отеля ПРЕМЬЕР ПАЛАС:");
        hotels = controller.findHotelByName("ПРЕМЬЕР ПАЛАС");
        for (Hotel hotel : hotels) {
            hotel.getRooms().stream().filter((room -> room.getReservedForUser() == null)).forEach(System.out::println);
        }

        System.out.println("Booked rooms are such elements:");
        controller.bookRoom(hotels.get(0).getRooms().get(1).getId(),user2.getId(),hotels.get(0).getId());
        for (Hotel hotel : hotels) {
            hotel.getRooms().stream().filter((room -> room.getReservedForUser() != null)).forEach(System.out::println);
        }

        // check method perfomance.......
       // System.out.println("\n" + "Founded room is :" + Hotel.findRoomById(hotels.get(0).getRooms().get(1).getId()));

    }

}
