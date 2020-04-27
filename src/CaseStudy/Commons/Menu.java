package CaseStudy.Commons;

public class Menu {
    public static void displayMenuMain() {
        System.out.println("------------------ Main menu ------------------");
        System.out.println("1.Add New Services." +
                "\n2.Show Services." +
                "\n3.Add New Customer." +
                "\n4.Show Information Customer." +
                "\n5.Add New Booking." +
                "\n6.Show Information of Employee." +
                "\n7.Booking Movie Ticket 4D." +
                "\n8.Find Employee." +
                "\n9.Exit.");
        System.out.println("--- Please select one function below: ");
    }

    public static void displayMenuAddNewService() {
        System.out.println("------------- Add new service menu ------------");
        System.out.println("1.Add New Villa." +
                "\n2.Add New House." +
                "\n3.Add New Room." +
                "\n4.Back to Menu." +
                "\n5.Exit.");
        System.out.println("--- Please select one function below: ");
    }

    public static void displayMenuShowServices() {
        System.out.println("---------------- Show service menu ------------");
        System.out.println("1.Show All Villa." +
                "\n2.Show All House." +
                "\n3.Show All Room." +
                "\n4.Show All Name Villa Not Duplicate." +
                "\n5.Show All Name House Not Duplicate." +
                "\n6.Show All Name Room Not Duplicate." +
                "\n7.Back to Menu." +
                "\n8.Exit.");
        System.out.println("--- Please select one function below: ");
    }

    public static void displayMenuBooking() {
        System.out.println("1.Booking Villa." +
                "\n2.Booking House." +
                "\n3.Booking Room.");
        System.out.println("--- Choose Services Booking");
    }

    public static void displayMenuBookingMovieTicket4D() {
        System.out.println("-------- Booking Movie ticket 4D Menu ------------");
        System.out.println("1.Booking movie ticket" +
                "\n2.Show customer booking movie ticket" +
                "\n3.Exit");
        System.out.println("--- Please select one function below: ");
    }

    public static void displayMenuBackToMain() {
        System.out.println("----------- Enter to continue --------------------");
        ScannerUtils.scanner.nextLine();
    }
}

