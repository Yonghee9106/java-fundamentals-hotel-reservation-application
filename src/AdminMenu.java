import api.AdminResource;
import model.Room;
import model.RoomType;

import java.util.Collections;
import java.util.Scanner;

public class AdminMenu {
    private static final AdminResource adminResource = AdminResource.getSingleton();
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

        System.out.println("Enter room number");
        String roomNumber = scanner.nextLine();

        System.out.println("Enter price per night");
        double roomPrice = addRoomPrice(scanner);

        System.out.println("Enter room type: 1 for single bed, 2 for double bed");
        final RoomType roomType = addRoomType(scanner);

        Room newRoom = new Room(roomNumber, roomPrice, roomType);
        adminResource.addRoom(Collections.singletonList(newRoom));

        System.out.println("Would like to add another room y/n");
        addAnotherRoom();
    }

    private static double addRoomPrice(Scanner scanner) {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid price format! Please, enter a valid double number.");
            return addRoomPrice(scanner);
        }
    }

    private static RoomType addRoomType(Scanner scanner) {
        try {
            return RoomType.valueOfLabel(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid room type! Please, enter 1 for single bed, 2 for double bed.");
            return addRoomType(scanner);
        }
    }

    private static void addAnotherRoom() {
        Scanner scanner = new Scanner(System.in);

        try {
            String addAnotherRoomChoice;
            addAnotherRoomChoice = scanner.nextLine();

            while ((addAnotherRoomChoice.charAt(0) != 'Y' && addAnotherRoomChoice.charAt(0) != 'N') || addAnotherRoomChoice.length() != 1) {
                System.out.println("Please enter Y (Yes) or N (No)");
                addAnotherRoomChoice = scanner.nextLine();
            }

            if (addAnotherRoomChoice.charAt(0) == 'Y') {
                addRoom();
            } else if (addAnotherRoomChoice.charAt(0) == 'N') {
                displayAdminMenu();
            } else {
                addAnotherRoom();
            }

        } catch (StringIndexOutOfBoundsException e) {
            addAnotherRoom();
        }
    }
}
