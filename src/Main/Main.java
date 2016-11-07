package src.Main;

import src.Controllers.Controller;
import src.Entitys.CurrentUser;
import src.Entitys.Hotel;
import src.Entitys.User;
import src.Entitys.Room;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        System.out.println("\nTry to search with anonymous user:");
        hotels = controller.findHotelByCity("Kiev");
        System.out.println("\n----------------------------------------------\n");

        controller.registerUser(user2);


        System.out.println("Empty rooms in city Kiev:");
        hotels = controller.findHotelByCity("Kiev");
        for (Hotel hotel : hotels) {
            hotel.getRooms().stream().filter((room -> room.getReservedForUser() == null)).forEach(System.out::println);
        }
        System.out.println("\n----------------------------------------------\n");

        System.out.println("Empty rooms in hotel ПРЕМЬЕР ПАЛАС:");
        hotels = controller.findHotelByName("ПРЕМЬЕР ПАЛАС");
        for (Hotel hotel : hotels) {
            hotel.getRooms().stream().filter((room -> room.getReservedForUser() == null)).forEach(System.out::println);
        }
        System.out.println("\n----------------------------------------------\n");

        System.out.println("Book room by id`s:");
        Hotel hotel11 = controller.findHotelByName("ПРЕМЬЕР ПАЛАС").stream().findFirst().orElse(null);
        User user11 = CurrentUser.getCurrentUser();
        if (hotel11 != null && user11 != null) {
            Room room = hotel11.getRooms().stream().findFirst().orElse(null);
            if (user11 != null) {
                controller.bookRoom(room.getId(), user11.getId(), hotel11.getId());
            }
        }
        System.out.println("\n----------------------------------------------\n");

        System.out.println("Cancel reservation id`s:");
        Hotel hotel12 = controller.findHotelByName("ПРЕМЬЕР ПАЛАС").stream().findFirst().orElse(null);
        User user22 = CurrentUser.getCurrentUser();
        if (hotel12 != null && user22 != null) {
            Room room = hotel12.getRooms().stream().findFirst().orElse(null);
            if (user22 != null) {
                controller.cancelReservation(room.getId(), user22.getId(), hotel12.getId());
            }
        }
        System.out.println("\n----------------------------------------------\n");

        System.out.println("Find rooms by different parameters:");
        Map<String, String> param = new HashMap<>();
        param.put("roomNumber", "4");
        param.put("price", "1800");
        param.put("currency", "UAH");
        param.put("persons", "2");
        param.put("roomType", "Standard");
        param.put("hotel", "ПРЕМЬЕР ПАЛАС");
//        param.put("id", "0");
        param.put("country", "");

        List<Room> foundRooms = controller.findRoom(param);
        foundRooms.stream().forEach(System.out::println);
        System.out.println("\n----------------------------------------------\n");

    }
}
