import java.util.Scanner;

public class MainMenu {
    public static void mainMenu() {
        String selectedMenu = "";
        Scanner scanner = new Scanner(System.in);

        displayMainMenu();
        selectedMenu = scanner.nextLine();
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
