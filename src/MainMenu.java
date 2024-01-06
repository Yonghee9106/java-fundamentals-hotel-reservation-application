import java.util.Scanner;

public class MainMenu {
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
                            System.out.println("Create an Account");
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
}
