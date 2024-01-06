import java.util.Scanner;

public class AdminMenu {
    public static void adminMenu() {
        String selectedMenu = "";
        Scanner scanner = new Scanner(System.in);

        displayAdminMenu();

        try {
            do {
                selectedMenu = scanner.nextLine();

                if (selectedMenu.length() == 1) {
                    switch (selectedMenu.charAt(0)) {
                        case '1':
                            System.out.println("See all Customers");
                            break;
                        case '2':
                            System.out.println("See all Rooms");
                            break;
                        case '3':
                            System.out.println("See all Reservations");
                            break;
                        case '4':
                            addRoom();
                            break;
                        case '5':
                            System.out.println("Add Test Data");
                            break;
                        case '6':
                            MainMenu.mainMenu();
                            break;
                        default:
                            System.out.println("Please enter a valid option number (1-6)\n");
                            break;
                    }
                } else {
                    System.out.println("Please enter a single-digit option number (1-6)\n");
                }
            } while (selectedMenu.charAt(0) != '6' || selectedMenu.length() != 1);
        } catch (Exception ex) {
            System.err.println("An error occurred while choosing main menu options: " + ex.getMessage());
        }
    }

    private static void displayAdminMenu() {
        System.out.println("\nAdmin Menu\n" +
                "-------------------------------------------------------\n" +
                "1. See all Customers\n" +
                "2. See all Rooms\n" +
                "3. See all Reservations\n" +
                "4. Add a Room\n" +
                "5. Add Test Data\n" +
                "6. Back to Main Menu\n" +
                "-------------------------------------------------------\n" +
                "Please select a number for the menu option");
    }

    private static void addRoom() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter room number:");
        String roomNumber = scanner.nextLine();
    }
}
