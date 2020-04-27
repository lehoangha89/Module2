package CaseStudy.Controllers;

import CaseStudy.Commons.FuncGeneric;
import CaseStudy.Commons.FuncWriteAndReadFileCSV;
import CaseStudy.Commons.ScannerUtils;
import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static CaseStudy.Commons.FuncGeneric.displayList;
import static CaseStudy.Commons.Menu.displayMenuBooking;
import static CaseStudy.Commons.Menu.displayMenuBookingMovieTicket4D;
import static CaseStudy.Controllers.MainController.backMainMenu;

public class BookingController {

    private static Queue<Customer> customerQueueBookingTicket = new LinkedList<Customer>();

    //add new bookng
    public static void addNewBooking() {
        ArrayList<Customer> customerList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.CUSTOMER);
        displayList(customerList);
        System.out.println("--- Choose one Customer to Booking");
        Customer customer = new Customer();
        customer = customerList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
        displayMenuBooking();
        processMenuBooking(customer);

        // Get list Customer from CSV
        ArrayList<Customer> listBooking = FuncWriteAndReadFileCSV.getBookingFromCSV();
        //Add customer to list
        listBooking.add(customer);
        //Write to CSV
        FuncWriteAndReadFileCSV.writeBookingToFileCsv(listBooking);
        System.out.println("--- Add Booking for : " + customer.getFullName() + " Successfully !!!");
        backMainMenu();
    }
    public static void bookingMovieTicket4D() {
        displayMenuBookingMovieTicket4D();
        processMenuBookingMovieTicket4D();
    }

    private static void processMenuBooking(Customer customer) {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                ArrayList<Villa> villaList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.VILLA);
                displayList(villaList);
                System.out.println("--- Choose Villa Booking");
                Villa villa = villaList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
                customer.setServices(villa);
                break;
            case "2":
                ArrayList<House> houseList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.HOUSE);
                displayList(houseList);
                System.out.println("--- Choose House Booking");
                House house = houseList.get(Integer.parseInt(ScannerUtils.scanner.nextLine())  - 1);
                customer.setServices(house);
                break;
            case "3":
                ArrayList<Room> roomList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.ROOM);
                displayList(roomList);
                System.out.println("--- Choose Room Booking");
                Room room = roomList.get(Integer.parseInt(ScannerUtils.scanner.nextLine())  - 1);
                customer.setServices(room);
                break;
            default:
                backMainMenu();
                break;
        }
    }

    private static void processMenuBookingMovieTicket4D() {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                addBookingMovieTicket4D();
                break;
            case "2":
                showBookingMovieTicket();
                break;
            case "3":
                System.exit(0);
            default:
                System.out.println("Error!!!Backing to menu");
                backMainMenu();
        }
    }

    private static void addBookingMovieTicket4D() {
        // lua chon customer booking ticket
        try {
            ArrayList<Customer> customerList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.CUSTOMER);
            displayList(customerList);
            System.out.println("--- Chose customer want booking: ");
            Customer customer = customerList.get((Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1));
            customerQueueBookingTicket.add(customer);
            System.out.println("--- Add Booking for : " + customer.getFullName() + " Successfully !!!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Customer to booking movie ticket 4D not exist!!! Try again");
            addBookingMovieTicket4D();
        }
        backMainMenu();
    }

    private static void showBookingMovieTicket() {
        int i = 1;
        System.out.println("------------------ List ----------------------------------------------------");
        for (Customer customer : customerQueueBookingTicket) {
            System.out.println("No: " + i);
            customer.showInfor();
            i++;
            System.out.println("---------------------------------------------");
        }
        backMainMenu();
    }
}

