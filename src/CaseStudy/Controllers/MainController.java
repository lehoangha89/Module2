//package CaseStudy.Controllers;
//import CaseStudy.Commons.ScannerUtils;
//import static CaseStudy.Commons.Menu.displayMenuBackToMain;
//import static CaseStudy.Commons.Menu.displayMainMenu;
//import static CaseStudy.Controllers.BookingController.addNewBooking;
//import static CaseStudy.Controllers.BookingController.bookingMovieTicket4D;
//import static CaseStudy.Controllers.CustomerController.addNewCustomer;
//import static CaseStudy.Controllers.CustomerController.showInformationOfCustomer;
//import static CaseStudy.Controllers.EmployeeController.findEmployee;
//import static CaseStudy.Controllers.EmployeeController.showInformationOfEmployee;
//
//public class MainController {
//    public static void prosessMain() {
//        try {
//            displayMainMenu();
//            prosessMenuMain();
//        } catch (Exception e) {
//            backMainMenu();
//        }
//    }
//
//    private static void prosessMenuMain() {
//        switch (ScannerUtils.scanner.nextLine()){
//            case "1": {
//                addNewServices();
//                break;
//            }
//            case "2": {
//                showServices();
//                break;
//            }
//            case "3": {
//                addNewCustomer();
//                break;
//            } case "4":{
//                showInformationOfCustomer();
//                break;
//            } case "5":{
//                addNewBooking();
//                break;
//            } case "6":{
//                showInformationOfEmployee();
//                break;
//            } case "7":{
//                bookingMovieTicket4D();
//                break;
//            } case "8":{
//                findEmployee();
//                break;
//            }
//            case "9": {
//                System.exit(0);
//                break;
//            }
//            default:{
//                System.out.println("Error.Back to main menu: ");
//                displayMainMenu();
//                break;
//            }
//        }
//    }
//    private static void backMainMenu() {
//        displayMenuBackToMain();
//        prosessMain();
//    }
//}
