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

        if (!isUserRegistered()) {
            return;
        }

        try {
            for (int i = 0; i < hotelDAO.db.size(); i++) {
                if (hotelDAO.db.get(i).findRoomById(roomId).getId() == roomId
                        && userDAO.findUserById(userId).getId() == userId
                        && hotelDAO.db.get(i).getId() == hotelId) {
                    hotelDAO.db.get(i).findRoomById(roomId).setReservedForUser(CurrentUser.getCurrentUser());
                }
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("There is IndexOfBoundException");
        }
    }

    public void cancelReservation(long roomId, long userId, long hotelId) {
    Hotel hotel = hotelDAO.findHotelById(hotelId);
        if (hotel == null){
            System.out.println("Hotel with Id " + hotelId + " not found.");
            return ;
        }
        Room room = hotel.findRoomById(roomId);
        if(room == null){
            System.out.println("Room with Id " + roomId + " not found.");
            return;
        }
        User user = userDAO.findUserById(userId);
        if(user.equals(room.getReservedForUser())){
            room.setReservedForUser(null);
        }
    }

    public List<Hotel> findRoom(Map<String, String> params) {
        List<Room> foundRooms = new ArrayList<>();
        List<Room> allNotReservedRooms = hotelDAO.getAllNotReservedRooms();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            for (Room room : allNotReservedRooms){
                List<Boolean> flags = new ArrayList<>();
                if (entry.getKey().equals("id")) {
                    Long id = Long.parseLong(entry.getValue());
                    if (id.equals(room.getId())) {
                        flags.add(true);
                    }else {
                        flags.add(false);
                    }

                }
            }
        }
        return null;
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
