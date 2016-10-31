/**
 * Created by Димон on 31.10.2016.
 */
public class Hotel {
    private long id;
    private String name;
    private String city;
    private int rooms;

    public Hotel(String name, String city, int rooms) {
        //auto geterator for id
       // this.id = id;
        this.name = name;
        this.city = city;
        this.rooms = rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (id != hotel.id) return false;
        if (rooms != hotel.rooms) return false;
        if (name != null ? !name.equals(hotel.name) : hotel.name != null) return false;
        return city != null ? city.equals(hotel.city) : hotel.city == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + rooms;
        return result;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cyti='" + city + '\'' +
                ", rooms=" + rooms +
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

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}
