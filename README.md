# Project: Hotel online booking system 

## Final project for cours Java Core

## Task:
You need you create system which serves following user requests

//Hotel - Collection<Room>
//Room - User userReserved
Collection<Hotel> findHotelByName(String name)
Collection<Hotel> findHotelDyCity(String city)
void bookRoom(long roomId, long userId, long hotelId)
void cancelReservation(long roomId, long userId, long hotelId)
Collection<Hotel> findRoom(Map<String, String> params)

//city - Kiev, hotelName - Radisson, price - 200, persons - 2
registerUser(User user)

There are three main entities in the system, User, Hotel and Room
They should be stored in separate table (collection)
Abstract DAO should be implemented and used for duplicate operations
All request should be placed in Controller
Use Java 8 where possible
Demonstrate all results in Main class (create and least 2 hotels in 3 unique cities with at least 10 rooms each
