package model;

import java.util.regex.Pattern;

public class Customer {
    private static final String EMAIL_REGEX = "^(.+)@(.+).(.+)$";
    private final String firstName;
    private final String lastName;
    private final String email;

    public Customer(String firstName, String lastName, String email) {
        this.isValidEmail(email);

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

    private void isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);

        if(!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email format");
        }
    }
}
