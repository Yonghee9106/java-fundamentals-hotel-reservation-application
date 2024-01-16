package Service;

import model.Customer;

import java.util.Collection;

public class CustomerService {
    private static final CustomerService SINGLETON = new CustomerService();

    private CustomerService() {}

    public static CustomerService getSingleton() {
        return SINGLETON;
    }

    public void addCustomer(String email, String firstName, String lastName) {

    }

    public Customer getCustomer(String customerEmail){
        return null;
    }

    public Collection<Customer> getAllCustomer(){
        return null;
    }
}
