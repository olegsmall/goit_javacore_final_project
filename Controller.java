import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Created by Администратор on 01.11.2016.
 */
public class Controller {

    private DAO<Hotel> hotelDAO;
    private DAO<Room> roomDAO;
    private DAO<User> userDAO;

    public Controller(List<Hotel> hotels, List<Room> rooms) {
        hotelDAO = new DAOImpl<>();
        roomDAO = new DAOImpl<>();
        userDAO = new DAOImpl<>();

        hotels.forEach(hotelDAO::saveNew);
        rooms.forEach(roomDAO::saveNew);
    }

    public List<Hotel> findHotelByName(String name) {
        return hotelDAO.getAll().stream().filter((a) -> a.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Hotel> findHotelByCity(String city) {
        return hotelDAO.getAll().stream().filter((a) -> a.getCity().equals(city)).collect(Collectors.toList());
    }

    public void bookRoom(long roomId, long userId, long hotelId) {

    }

    public void cancelReservation(long roomId, long userId, long hotelId) {


    }

    public List<Hotel> findRoom(Map<String, String> params) {

        return null;
    }


}
