package CaseStudy.Controllers;
import CaseStudy.Commons.ScannerUtils;
import static CaseStudy.Commons.Menu.displayMenuBackToMain;

import static CaseStudy.Commons.Menu.displayMenuMain;
import static CaseStudy.Controllers.BookingController.addNewBooking;
import static CaseStudy.Controllers.BookingController.bookingMovieTicket4D;
import static CaseStudy.Controllers.CustomerController.*;
import static CaseStudy.Controllers.EmployeeController.*;
import static CaseStudy.Controllers.ServiceController.addNewServices;
import static CaseStudy.Controllers.ServiceController.showServices;

public class MainController {
    public static void processMain() {
        try {
            displayMenuMain();
            processMenuMain();
        } catch (Exception e) {
            backMainMenu();
        }
    }
    public static void processMenuMain() {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                addNewServices();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInformationCustomers();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showInformationEmployees();
                break;
            case "7":
                bookingMovieTicket4D();
                break;
            case "8":
                findEmployeeFromResume();
                break;
            case "9":
                System.exit(0);
            default:
                System.out.println("Error!!! is backing");
                backMainMenu();
        }
    }
    public static void backMainMenu() {
        displayMenuBackToMain();
        processMain();
    }
}
