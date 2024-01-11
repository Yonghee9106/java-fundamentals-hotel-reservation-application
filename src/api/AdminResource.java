package api;

import Service.ReservationService;
import model.Customer;
import model.IRoom;

import java.util.Collection;
import java.util.List;

public class AdminResource {

    private static final AdminResource SINGLETON = new AdminResource();

    private final ReservationService reservationService = ReservationService.getSingleton();
    private AdminResource() {}

    public static AdminResource getSingleton() {
        return SINGLETON;
    }

    public Customer getCustomer(String email) {
        return null;
    }

    public void addRoom(List<IRoom> rooms) {
        System.out.println("admin resource addRoom");
        rooms.forEach(reservationService::addRoom);
    }

    public Collection<IRoom> getAllRooms() {
        return null;
    }

    public Collection<Customer> getAllCustomers() {
        return null;
    }

    public void displayAllReservations() {

    }
}
