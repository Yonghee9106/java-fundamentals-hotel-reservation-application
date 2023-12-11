package model;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final String email;

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "First Name: " + this.firstName
                + ", Last Name: " + this.lastName
                + ", Email: " + this.email;
    }
}
