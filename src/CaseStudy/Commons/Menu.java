package CaseStudy.Commons;

public class Menu {
    public static void displayMainMenu() {
        System.out.println("1. Add New Services" + "\n"
                + "2. Show Services" + "\n"
                + "3. Add New Customer" + "\n"
                + "4. Show Information of Customer" + "\n"
                + "5. Add New Booking" + "\n"
                + "6. Show Information of Employee" + "\n"
                + "7. Booking Movie Ticket 4D" + "\n"
                + "8. Find Employee" + "\n"
                + "9. Exit");
    }
    public static void displayMenuAddNewService(){
        System.out.println("Add new service menu");
        System.out.println("1. Add New Villa" + "\n" + "2. Add New House" + "\n" + "3. Add New Room" + "\n"
                + "4. Back to menu" + "\n" + "5. Exit");
    }
    public static void displayMenuBackToMain(){
        System.out.println("Enter to continue");
        ScannerUtils.scanner.nextLine();
    }
}
