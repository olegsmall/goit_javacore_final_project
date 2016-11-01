import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Администратор on 01.11.2016.
 */
public class Controller {

    private DAO<Hotel> hotelDAO;
    private DAO<Room> roomDAO;
    private DAO<User> userDAO;

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

    public void bookRoom(long roomId, long userId, long hotelId) {

    }

    public void cancelReservation(long roomId, long userId, long hotelId) {

    }

    public List<Hotel> findRoom(Map<String, String> params) {

        return null;
    }


}
