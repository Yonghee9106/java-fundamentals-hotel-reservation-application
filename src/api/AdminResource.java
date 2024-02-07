package api;

import Service.CustomerService;
import Service.ReservationService;
import model.Customer;
import model.IRoom;

import java.util.Collection;
import java.util.List;

public class AdminResource {

    private static final AdminResource SINGLETON = new AdminResource();

    private final ReservationService reservationService = ReservationService.getSingleton();
    private final CustomerService customerService = CustomerService.getSingleton();
    private AdminResource() {}

    public static AdminResource getSingleton() {
        return SINGLETON;
    }

    public Customer getCustomer(String email) {
        return null;
    }

    public void addRoom(List<IRoom> rooms) {
        rooms.forEach(reservationService::addRoom);
    }

    public Collection<IRoom> getAllRooms() {
        return reservationService.getAllRooms();
    }

    public Collection<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public void displayAllReservations() {
        reservationService.printAllReservation();
    }
}
