import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Димон on 31.10.2016.
 */
public class Hotel {

    private long id;
    private String name;
    private String city;
    private List<Room> rooms;
    private int numberOfRooms;

    public Hotel(String name, String city, int numberOfRooms) {
        this.id = new Random().nextLong();
        this.name = name;
        this.city = city;
        this.rooms = new ArrayList<>();
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (id != hotel.id) return false;
        if (numberOfRooms != hotel.numberOfRooms) return false;
        if (name != null ? !name.equals(hotel.name) : hotel.name != null) return false;
        if (city != null ? !city.equals(hotel.city) : hotel.city != null) return false;
        return rooms != null ? rooms.equals(hotel.rooms) : hotel.rooms == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
 //       result = 31 * result + (rooms != null ? rooms.hashCode() : 0);
        result = 31 * result + numberOfRooms;
        return result;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                //"id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(List<Room> rooms) {
        rooms.forEach(room -> this.rooms.add(room));
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
}
