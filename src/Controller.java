import dao.HotelDao;
import enums.Currency;
import enums.RoomType;
import dao.UserDao;
import entities.*;

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
        System.out.println(room + " successfully booked" + " for " + user);
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
            System.out.println("Reservation successfully canceled for " + room);
        }
    }

    public List<Room> findRoom(Map<String, String> params) {
        List<Room> foundRooms = new ArrayList<>();
        List<Room> allNotReservedRooms = hotelDAO.getAllNotReservedRooms();

        for (Room room : allNotReservedRooms) {
            boolean roomIsFound = checkParams(params, room);
            if (roomIsFound) {
                foundRooms.add(room);
            }
        }
        if (foundRooms.size() == 0) {
            System.out.println("Nothing found");
        }
        return foundRooms;
    }

    private boolean checkParams(Map<String, String> params, Room room) {
        List<Boolean> flags = new ArrayList<>();
        for (Map.Entry<String, String> entry : params.entrySet()) {
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
                if (number == room.getRoomNumber()) {
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
                try {

                    Currency currency = Currency.valueOf(entry.getValue());
                    if (currency.equals(room.getCurrency())) {
                        flags.add(true);
                    } else {
                        flags.add(false);
                    }
                } catch (IllegalArgumentException e) {
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
                try {
                    RoomType roomType = RoomType.valueOf(entry.getValue());
                    if (roomType.equals(room.getRoomType())) {
                        flags.add(true);
                    } else {
                        flags.add(false);
                    }
                } catch (IllegalArgumentException e) {
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
        }
        if (flags.size() > 0) {
            return flags.stream().allMatch(flag -> flag == true);
        } else {
            return false;
        }
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
