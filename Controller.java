import java.util.List;
import java.util.Map;

public class Controller {

    private HotelDAO hotelDAO;
    private UserDAO userDAO;

    public Controller() {
        hotelDAO = new HotelDAO();
        userDAO = new UserDAO();
    }

    public List<Hotel> findHotelByName(String name) {
        return hotelDAO.findByName(name);
    }

    public List<Hotel> findHotelByCity(String city) {
        return hotelDAO.findByCity(city);
    }

    public boolean addUser(User user) {
        return userDAO.add(user);
    }

    public void registerUser(User user) {

    }

    public void bookRoom(long roomId, long userId, long hotelId) {

    }

    public void cancelReservation(long roomId, long userId, long hotelId) {


    }

    public List<Hotel> findRoom(Map<String, String> params) {

        return null;
    }


}
