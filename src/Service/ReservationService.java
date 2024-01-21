package Service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.*;
import java.util.stream.Collectors;

public class ReservationService {

    private static final ReservationService SINGLETON = new ReservationService();
    public static Map<String,IRoom> ListOfRoom = new HashMap<>();
    private final Map<String, Collection<Reservation>> reservations = new HashMap<>();
    private final Map<String, IRoom> rooms = new HashMap<>();

    private ReservationService() {}

    public static ReservationService getSingleton() {
        return SINGLETON;
    }

    public void addRoom(IRoom room) {
        ListOfRoom.put(room.getRoomNumber(), room);
    }

    public IRoom getARoom(String roomId) {
        return null;
    }

    public Collection<IRoom> getAllRooms() {
        return ListOfRoom.values();
    }

    public Reservation reserveARoom(Customer custoemr, IRoom room, Date checkInData, Date checkOutDate) {
        return null;
    }

    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        Collection<IRoom> allRooms = getAllRooms();

        return allRooms;
    }

    public Collection<Reservation> getCustomerReservation(Customer customer) {
        return null;
    }

    public void printAllReservation(){

    }
}
