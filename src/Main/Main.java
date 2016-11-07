package src.Main;

import src.Controllers.Controller;
import src.Entitys.CurrentUser;
import src.Entitys.Hotel;
import src.Entitys.User;
import src.Entitys.Room;

import java.io.*;
import java.util.List;

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
        hotels =  controller.findHotelByCity("Kiev");
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

        System.out.println("Book rooms by id`s:");
        Hotel hotel1 = controller.findHotelByName("ПРЕМЬЕР ПАЛАС").stream().findFirst().orElse(null);
        User user = CurrentUser.getCurrentUser();
        if (hotel1 != null && user != null) {
            Room room = hotel1.getRooms().stream().findFirst().orElse(null);
            if (user != null) {
                controller.bookRoom(room.getId(),user.getId(),hotel1.getId());
            }
        }
        System.out.println("\n----------------------------------------------\n");

        for (Hotel hotel : hotels) {
            hotel.getRooms().stream().filter((room -> room.getReservedForUser() != null)).forEach(System.out::println);
        }
    }
}
