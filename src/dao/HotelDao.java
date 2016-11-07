package dao;

import database.HotelsTable;
import database.Tables;
import entities.Hotel;
import entities.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelDao implements Dao<Hotel> {

    public List<Hotel> findByName(String name) {
        List<Hotel> allHotels = this.getAll();
        return allHotels.stream().filter((a) -> a.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Hotel> findByCity(String city) {
        List<Hotel> allHotels = this.getAll();
        return allHotels.stream().filter((a) -> a.getCity().equals(city)).collect(Collectors.toList());
    }

    public List<Room> getAllNotReservedRooms() {
        List<Room> allRooms = new ArrayList<>();
        List<Hotel> allHotels = this.getAll();
        for (Hotel hotel : allHotels) {
            List<Room> rooms = hotel.getRooms().stream().filter(room -> room.getReservedForUser() == null).collect(Collectors.toList());
            allRooms.addAll(rooms);
        }
        return allRooms;
    }

    @Override
    public void add(Hotel hotel) {
        Tables<Hotel> hotelsTable = new HotelsTable();
        try {
            hotelsTable.add(hotel);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "(" + e.getStackTrace() + ")");
        }
    }

    @Override
    public void update(Hotel hotel) {
        Tables<Hotel> hotelsTable = new HotelsTable();
        try {
            hotelsTable.update(hotel);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "(" + e.getStackTrace() + ")");
        }
    }

    @Override
    public void delete(long id) {
        Tables<Hotel> hotelsTable = new HotelsTable();
        try {
            hotelsTable.delete(id);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "(" + e.getStackTrace() + ")");
        }
    }

    @Override
    public Hotel findByID(long id) {
        HotelsTable hotelTable = new HotelsTable();
        try {
            return hotelTable.findByID(id);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "(" + e.getStackTrace() + ")");
            return null;
        }
    }

    @Override
    public List<Hotel> getAll() {
        HotelsTable hotelsTable = new HotelsTable();
        return hotelsTable.getAll();
    }
}
