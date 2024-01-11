package Service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ReservationService {

    private static final ReservationService SINGLETON = new ReservationService();
    public static Map<String,IRoom> ListOfRoom = new HashMap<>();

    private ReservationService() {}

    public static ReservationService getSingleton() {
        return SINGLETON;
    }

    public void addRoom(IRoom room) {
        ListOfRoom.put(room.getRoomNumber(), room);
        System.out.println(ListOfRoom);
    }

    public IRoom getARoom(String roomId) {
        return null;
    }

    public Reservation reserveARoom(Customer custoemr, IRoom room, Date checkInData, Date checkOutDate) {
        return null;
    }

    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        return null;
    }

    public Collection<Reservation> getCustomerReservation(Customer customer) {
        return null;
    }

    public void printAllReservation(){

    }
}
