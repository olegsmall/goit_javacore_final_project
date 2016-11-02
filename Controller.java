import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Администратор on 01.11.2016.
 */
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

    public void bookRoom(long roomId, long userId, long hotelId) {

    }

    public void cancelReservation(long roomId, long userId, long hotelId) {


    }

    public List<Hotel> findRoom(Map<String, String> params) {

        return null;
    }


}
