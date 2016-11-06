import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Set;

public class Controller {

    private HotelDAO hotelDAO;
    private UserDAO userDAO;

    public Controller() {
        hotelDAO = new HotelDAO();
        userDAO = new UserDAO();
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

    public boolean addUser(User user) {
        return userDAO.add(user);
    }

    public void registerUser(User user) {
        CurrentUser.setCurrentUser(user);
    }

    public void bookRoom(long roomId, long userId, long hotelId) {
        // добавил проверку на регистрацию пользователя
        if (!isUserRegistered()) {
            return;
        }

        try {
            // Изменил условие на ИЛИ, было И, получалось что исключение кидалось только если все поля были нулевыми
            if (roomId == 0 || userId == 0 || hotelId == 0) {
                throw new NullPointerException();
            }
            //это нужно заменить на getById для соответствующих классов
            for (int i = 0; i < hotelDAO.db.size(); i++) {
                for (int j = 0; j < hotelDAO.db.get(i).getRooms().size(); j++) {
                    if (hotelDAO.db.get(i).getRooms().get(j).getId() == roomId
                            && CurrentUser.getCurrentUser().getId() == userId
                            && hotelDAO.db.get(i).getId() == hotelId) {
                        hotelDAO.db.get(i).getRooms().get(j).setReservedForUser(CurrentUser.getCurrentUser());
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Yours id's aren't correct");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There is IndexOfBoundException");
        }
    }

    public void cancelReservation(long roomId, long userId, long hotelId) {
        Hotel hotel = hotelDAO.findHotelById(hotelId);
        if (hotel == null) {
            System.out.println("Hotel with Id " + hotelId + " not found.");
            return;
        }
        Room room = hotel.findRoomById(roomId);
        if (room == null) {
            System.out.println("Room with Id " + roomId + " not found.");
            return;
        }
        User user = userDAO.findUserById(userId);
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

    private boolean isUserRegistered() {
        if (CurrentUser.getCurrentUser() == null) {
            System.out.println("User not registered");
            return false;
        } else {
            return true;
        }
    }

}
