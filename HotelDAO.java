import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Администратор on 02.11.2016.
 */
public class HotelDAO extends DAO<Hotel>{

    public List<Hotel> findByName(String name) {
      return db.stream().filter((a) -> a.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Hotel> findByCity(String city) {
        return db.stream().filter((a) -> a.getCity().equals(city)).collect(Collectors.toList());
    }
}
