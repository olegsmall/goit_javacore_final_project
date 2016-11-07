package entities;

import enums.Currency;
import enums.RoomType;

import java.util.Random;

public class Room {

    private long id;
    private int roomNumber;
    private int price;
    private Currency currency;
    private int persons;
    private RoomType roomType;
    private User reservedForUser;
    private Hotel hotel;

    public Room(int number, int price, Currency currency, int persons, RoomType roomType, Hotel hotel) {
        long l = new Random().nextLong();
        this.id = l;
        this.roomNumber = number;
        this.price = price;
        this.currency = currency;
        this.persons = persons;
        this.roomType = roomType;
        this.hotel = hotel;
        hotel.addRoom(this);
    }

    public long getId() {
        return id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getPersons() {
        return persons;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public User getReservedForUser() {
        return reservedForUser;
    }

    public void setReservedForUser(User reservedForUser) {
        this.reservedForUser = reservedForUser;
    }

    public Hotel getHotel() {
        return hotel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (roomNumber != room.roomNumber) return false;
        if (price != room.price) return false;
        if (persons != room.persons) return false;
        if (currency != room.currency) return false;
        if (roomType != room.roomType) return false;
        return hotel != null ? hotel.equals(room.hotel) : room.hotel == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + roomNumber;
        result = 31 * result + price;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + persons;
        result = 31 * result + (roomType != null ? roomType.hashCode() : 0);
        result = 31 * result + (hotel != null ? hotel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  "" + hotel + ", " +"room " + "№" + roomNumber +
                ", " + roomType.getTranslate() +
                ", " + persons + " persons" +
                ", price: " + price + currency.getName();
    }
}
