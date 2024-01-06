import java.util.Scanner;

public class AdminMenu {
    public static void adminMenu() {
        String selectedMenu = "";
        Scanner scanner = new Scanner(System.in);

        displayAdminMenu();
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
}
