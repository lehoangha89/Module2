package CaseStudy.Controllers;

import CaseStudy.Commons.FuncGeneric;
import CaseStudy.Commons.ScannerUtils;
import CaseStudy.Data.Resume;
import CaseStudy.Models.Employee;

import java.util.*;

import static CaseStudy.Controllers.MainController.backMainMenu;

public class EmployeeController {
    // show information Employee
    public static void showInformationEmployees() {
        ArrayList<Employee> employeeList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.EMPLOYEE);
        Map<String, Employee> map = new HashMap<>();
        for (Employee employee : employeeList) {
            map.put(employee.getId(), employee);
        }
        displayMap(map);
        backMainMenu();
    }

    public static void displayMap(Map<String, Employee> map) {
        for (Map.Entry m : map.entrySet()) {
            System.out.println("Key: " + m.getKey() + "\n" + m.getValue().toString());
        }
    }
    // ham tim kiem employee trong stack
    public static void findEmployeeFromResume() {
        Stack<Employee> employeeStack = Resume.getAllEmployee();
        System.out.print("Enter key of employee: ");
        String inputSearch = ScannerUtils.scanner.nextLine();
        try {
            while (true) {
                boolean foundById = employeeStack.peek().getId().contains(inputSearch);
                if (!foundById) {
                    employeeStack.pop();
                } else {
                    System.out.println("--- Founded employee below :");
                    System.out.println(employeeStack.peek().toString());
                    break;
                }
            }
        } catch (EmptyStackException ex) {
            System.out.print("key invalid, please try again");
            findEmployeeFromResume();
        }
        backMainMenu();
    }
}

