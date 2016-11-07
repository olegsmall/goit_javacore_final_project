package src.Controllers;

import src.Dao.HotelDao;
import src.Enams.Currency;
import src.Enams.RoomType;
import src.Dao.UserDao;
import src.Entitys.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Controller {

    private HotelDao hotelDAO;
    private UserDao userDAO;

    public Controller() {
        hotelDAO = new HotelDao();
        userDAO = new UserDao();
    }

    public List<Hotel> findHotelByName(String name) {
        List<Hotel> hotels;
        if (!isUserRegistered()) {
            return null;
        }
        hotels = hotelDAO.findByName(name);
        if (hotels.isEmpty()) {
            System.out.println("By your request nothing has been found");
        }
        return hotels;
    }

    public List<Hotel> findHotelByCity(String city) {
        List<Hotel> hotels;
        if (!isUserRegistered()) {
            return null;
        }
        hotels = hotelDAO.findByCity(city);
        if (hotels.isEmpty()) {
            System.out.println("By your request nothing has been found");
        }
        return hotels;
    }

    public void bookRoom(long roomId, long userId, long hotelId) {

        if (!isUserRegistered()) {
            return;
        }
        Hotel hotel = hotelDAO.findByID(hotelId);
        if (hotel == null) {
            System.out.println("Hotel with Id " + hotelId + " not found.  Room did not book");
            return;
        }
        Room room = hotel.findRoomById(roomId);
        if (room == null) {
            System.out.println("Room with Id " + roomId + " not found.  Room did not book");
            return;
        }
        User user = userDAO.findByID(userId);
        if (user == null) {
            System.out.println("User with Id " + userId + " not found. Room did not book");
            return;
        }
        room.setReservedForUser(user);
        System.out.println("Room successfully booked");
    }

    public void cancelReservation(long roomId, long userId, long hotelId) {
        if (!isUserRegistered()) {
            return;
        }
        Hotel hotel = hotelDAO.findByID(hotelId);
        if (hotel == null) {
            System.out.println("Hotel with Id " + hotelId + " not found.");
            return;
        }
        Room room = hotel.findRoomById(roomId);
        if (room == null) {
            System.out.println("Room with Id " + roomId + " not found.");
            return;
        }
        User user = userDAO.findByID(userId);
        if (user == null) {
            System.out.println("User with Id " + userId + " not found.");
            return;
        }
        if (user.equals(room.getReservedForUser())) {
            room.setReservedForUser(null);
        }
    }

    public List<Room> findRoom(Map<String, String> params) {
        List<Room> foundRooms = new ArrayList<>();
        List<Room> allNotReservedRooms = hotelDAO.getAllNotReservedRooms();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            for (Room room : allNotReservedRooms) {
                boolean roomIsFound = checkParams(entry, room);
                if (roomIsFound) {
                    foundRooms.add(room);
                }
            }
        }
        return foundRooms;
    }

    private boolean checkParams(Map.Entry<String, String> entry, Room room) {
        List<Boolean> flags = new ArrayList<>();
        if (entry.getKey().equals("id")) {
            long id = Long.parseLong(entry.getValue());
            if (id == room.getId()) {
                flags.add(true);
            } else {
                flags.add(false);
            }
        }
        if (entry.getKey().equals("number")) {
            int number = Integer.parseInt(entry.getValue());
            if (number == room.getNumber()) {
                flags.add(true);
            } else {
                flags.add(false);
            }
        }
        if (entry.getKey().equals("price")) {
            int price = Integer.parseInt(entry.getValue());
            if (price == room.getPrice()) {
                flags.add(true);
            } else {
                flags.add(false);
            }

        }
        if (entry.getKey().equals("currency")) {
            Currency currency = Currency.valueOf(entry.getValue());
            if (currency.equals(room.getCurrency())) {
                flags.add(true);
            } else {
                flags.add(false);
            }
        }
        if (entry.getKey().equals("persons")) {
            int persons = Integer.parseInt(entry.getValue());
            if (persons == room.getPersons()) {
                flags.add(true);
            } else {
                flags.add(false);
            }
        }
        if (entry.getKey().equals("roomType")) {
            RoomType roomType = RoomType.valueOf(entry.getValue());
            if (roomType.equals(room.getRoomType())) {
                flags.add(true);
            } else {
                flags.add(false);
            }
        }
        if (entry.getKey().equals("hotel")) {
            Hotel hotel = findHotelByName(entry.getValue()).stream().findFirst().orElse(null);
            if (hotel.equals(room.getHotel())) {
                flags.add(true);
            } else {
                flags.add(false);
            }
        }
        return flags.stream().allMatch(flag -> flag == true);
    }

    public void addUser(User user) {
        userDAO.add(user);
    }

    public void registerUser(User user) {
        CurrentUser.setCurrentUser(user);
    }

    private boolean isUserRegistered() {
        if (CurrentUser.getCurrentUser() == null) {
            System.out.println("User not registered");
            return false;
        } else {
            return true;
        }
    }

}
