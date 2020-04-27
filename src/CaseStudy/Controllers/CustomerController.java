package CaseStudy.Controllers;

import CaseStudy.Commons.FuncGeneric;
import CaseStudy.Commons.FuncValidation;
import CaseStudy.Commons.FuncWriteAndReadFileCSV;
import CaseStudy.Commons.ScannerUtils;
import CaseStudy.Models.Customer;
import CaseStudy.Models.SortNameAndYear;

import java.util.ArrayList;

import static CaseStudy.Commons.FuncGeneric.displayList;
import static CaseStudy.Controllers.MainController.backMainMenu;

public class CustomerController {

        public static final String ENTER_CUSTOMER_NAME = "Enter customer name: ";
        public static final String INVALID_CUSTOMER_NAME = "Customer name is invalid. Customer name must be capitalized with first letters, the following characters is normal characters. Please try again !!!";
        public static final String ENTER_GENDER = "Enter Gender Customer: ";
        public static final String INVALID_GENDER = "Gender Customer is invalid. Gender is one of (Male / Female / Unknow). Please try again !!!";
        public static final String ENTER_ID_CARD = "Enter Id Card Customer:";
        public static final String INVALID_ID_CARD = "Id Card Is Invalid. Id Card must be 9 digits and has format XXX XXX XXX. Please try again !!!";
        public static final String ENTER_EMAIL = "Enter Email:";
        public static final String INVALID_EMAIL = "Email Is Invalid. Email must be format abc@abc.abc Please try again !!!";
        public static final String ENTER_BIRTHDAY = "Enter Birthday";
        public static final String INVALID_BIRTHDAY = "Birthday Is Invalid. Birthday must be format dd/MM/yyyy and year > 1900 and current year - year > 18  Please try again !!!";

        //Add New Customer
        public static void addNewCustomer() {
            Customer customer = new Customer();

            //Set Full Name Customer
            customer.setFullName(FuncValidation.getValidCustomerName(ENTER_CUSTOMER_NAME, INVALID_CUSTOMER_NAME));

            //set Birthday Customer
            customer.setBirthday(FuncValidation.getValidBirthday(ENTER_BIRTHDAY, INVALID_BIRTHDAY));

            //set Gender Customer
            String gender = FuncValidation.getValidGender(ENTER_GENDER, INVALID_GENDER);
            customer.setGender(Character.toUpperCase(gender.charAt(0)) + gender.substring(1, gender.length()).toLowerCase());

            //Set Id Card Customer
            customer.setIdCard(FuncValidation.getValidIdCard(ENTER_ID_CARD, INVALID_ID_CARD));

            //set Phone Number Customer
            System.out.println("Enter Phone Number Customer: ");
            customer.setPhone(ScannerUtils.scanner.nextLine());

            //set Email Customer
            customer.setEmail(FuncValidation.getValidEmail(ENTER_EMAIL, INVALID_EMAIL));

            //set Type Customer
            System.out.println("Enter Type Customer: ");
            customer.setCustomerType(ScannerUtils.scanner.nextLine());

            //set Address Customer
            System.out.println("Enter Address Customer: ");
            customer.setAddress(ScannerUtils.scanner.nextLine());


            // Get list Customer from CSV
            ArrayList<Customer> customerList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.CUSTOMER);
            // Add customer to list
            customerList.add(customer);
            // Write to CSV
            FuncWriteAndReadFileCSV.writeCustomerToFileCsv(customerList);

            System.out.println("--- Add Customer: " + customer.getFullName() + " Successfully !!!");
            backMainMenu();
        }
        //Show Information Customer
        public static void showInformationCustomers() {
            ArrayList<Customer> customerList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.CUSTOMER);
            // Sắp xếp theo thứ tự Alpha B theo tên, Trường hợp Customer nào trùng tên thì sắp xếp tăng dần theo năm sinh
            customerList.sort(new SortNameAndYear());
            displayList(customerList);
            backMainMenu();
        }

}
