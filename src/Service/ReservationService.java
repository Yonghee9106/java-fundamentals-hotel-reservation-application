package Service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.*;

public class ReservationService {

    private static final ReservationService SINGLETON = new ReservationService();
    public static Map<String,IRoom> ListOfRoom = new HashMap<>();
    public static List<Reservation> reservations = new ArrayList<>();

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
        Collection<IRoom> availableRooms = new ArrayList<>();
        Collection<IRoom> reservedRooms = new ArrayList<>();
        Collection<IRoom> allRooms = getAllRooms();

        if (reservations.isEmpty()) {
            return allRooms;
        }

        reservations.forEach((reservation)-> {
            if ((!checkInDate.after(reservation.getCheckOutDate())
                    && !checkOutDate.before(reservation.getCheckInDate())))
            {
                reservedRooms.add(reservation.getRoom());
                System.out.println('1');
            }
        });

        ListOfRoom.forEach((number, room) -> {
            if(!reservedRooms.contains(room)) {
                availableRooms.add(room);
                System.out.println('2');
            }
        });

        return availableRooms;
    }

    public Collection<Reservation> getCustomerReservation(Customer customer) {
        return null;
    }

    public void printAllReservation(){

    }
}
