import api.HotelResource;

import java.util.Scanner;

public class MainMenu {
    private static final HotelResource hotelResource = HotelResource.getSingleton();
    public static void mainMenu() {
        String selectedMenu = "";
        Scanner scanner = new Scanner(System.in);

        displayMainMenu();

        try {
            do {
                selectedMenu = scanner.nextLine();

                if (selectedMenu.length() == 1) {
                    switch (selectedMenu.charAt(0)) {
                        case '1':
                            System.out.println("Find and reserve a room");
                            break;
                        case '2':
                            System.out.println("See my reservations");
                            break;
                        case '3':
                            createAccount();
                            break;
                        case '4':
                            AdminMenu.adminMenu();
                            break;
                        case '5':
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Please enter a valid option number (1-5)\n");
                            break;
                    }
                } else {
                    System.out.println("Please enter a single-digit option number (1-5)\n");
                }
            } while (selectedMenu.charAt(0) != '5' || selectedMenu.length() != 1);
        } catch (Exception ex) {
            System.err.println("An error occurred while choosing main menu options: " + ex.getMessage());
        }
    }

    private static void displayMainMenu() {
        System.out.println("\nWelcome to the Hotel Reservation Application\n\n" +
                "-------------------------------------------------------\n" +
                "1. Find and reserve a room\n" +
                "2. See my reservations\n" +
                "3. Create an Account\n" +
                "4. Admin\n" +
                "5. Exit\n" +
                "-------------------------------------------------------\n" +
                "Please select a number for the menu option");
    }

    private static void createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Email format: name@domain.com");
        String userEmail = scanner.nextLine();

        System.out.println("First Name");
        String firstName = scanner.nextLine();

        System.out.println("Last Name");
        String lastName = scanner.nextLine();

        try {
            hotelResource.createACustomer(userEmail, firstName, lastName);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getLocalizedMessage());
            createAccount();
        }
    }
}
