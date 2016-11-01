import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        return hotelDAO.getAll().stream().filter((a) -> a.getName().equals(name)).collect(Collectors.toList());
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
