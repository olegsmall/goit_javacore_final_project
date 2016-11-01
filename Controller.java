import java.util.List;
import java.util.Map;

/**
 * Created by Администратор on 01.11.2016.
 */
public class Controller {

    DAO<Hotel> hotelDAO;
    DAO<Room> roomDAO;
    DAO<User> userDAO;

    public Controller() {
        hotelDAO = new DAOImpl<>();
        roomDAO = new DAOImpl<>();
        userDAO = new DAOImpl<>();
    }

    public List<Hotel> findHotelByName(String name) {
        //List<Hotel>

        return null;
    }

    public List<Hotel> findHotelByCity(String city) {

        return null;
    }

    void bookRoom(long roomId, long userId, long hotelId) {

    }

    void cancelReservation(long roomId, long userId, long hotelId) {

    }

    List<Hotel> findRoom(Map<String, String> params) {

        return null;
    }
}
