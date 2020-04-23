package CaseStudy.Controllers;

import CaseStudy.Customers.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class MainController {
    TreeSet<String> listRoomNotDuplicate = new TreeSet<>();
    TreeSet<String> listHouseNotDuplicate = new TreeSet<>();
    TreeSet<String> listVillaNotDuplicate = new TreeSet<>();
    public void displayMainMenu() {
        System.out.println("1. Add New Services" + "\n"
                + "2. Show Services" + "\n"
                + "3. Add New Customer" + "\n"
                + "4. Show Information of Customer" + "\n"
                + "5. Add New Booking" + "\n"
                + "6. Show Information of Employee" + "\n"
                + "7. Booking Movie Ticket 4D" + "\n"
                + "8. Find Employee" + "\n"
                + "9. Exit");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose) {
            case 1: {
                addNewServices();
                break;
            }
            case 2: {
                showServices();
                break;
            }
            case 3: {
                addNewCustomer();
                break;
            } case 4:{
                showInformationOfCustomer();
                break;
            } case 5:{
                addNewBooking();
                break;
            } case 6:{
                showInformationOfEmployee();
                break;
            } case 7:{
                bookingMovieTicket4D();
                break;
            } case 8:{
                findEmployee();
                break;
            }
            case 9: {
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Error.Back to main menu: ");
                displayMainMenu();
                break;
            }
        }
    }

    private void findEmployee() {
    }

    private void bookingMovieTicket4D() {
    }

    private void showInformationOfEmployee() {
    }

    private void addNewBooking() {
    }

    private void showInformationOfCustomer() {
    }

    private void addNewCustomer() {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Customer> customerArrayList=new ArrayList<Customer>();
        customerArrayList=CustomerCSV.readCustomerCsv();
        Customer customer=new Customer();
        customer.setNameCustomer(scanner.nextLine());
        customer.setBirthday(scanner.nextLine());
        customer.setGender(scanner.nextLine());
        customer.setCmnd(scanner.nextInt());
        customer.setPhoneNumber(scanner.nextInt());
        customer.setEmail(scanner.nextLine());
        customer.setTypeOfCustomer(scanner.nextLine());
        customer.setAddress(scanner.nextLine());
        customerArrayList.add(customer);
        CustomerCSV.writeCustomerCsv(customerArrayList);
        displayMainMenu();
    }
    public void addNewServices() {
        System.out.println("1. Add New Villa" + "\n" + "2. Add New House" + "\n" + "3. Add New Room" + "\n"
                + "4. Back to menu" + "\n" + "5. Exit");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose) {
            case 1: {
                this.addNewVilla();
                break;
            }
            case 2: {
                this.addNewHouse();
                break;
            }
            case 3: {
                this.addNewRoom();
                break;
            } case 4:{
                backToMenu();
                break;
            } case 5:{
                System.exit(0);
                break;
            }
        }
    }

    private void backToMenu() {
    }

    public void addNewVilla() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Villa> villaArrayList = new ArrayList<Villa>();
        villaArrayList = VillaCsv.readVillaCsv();
        Villa villa = new Villa();
        System.out.println("Nhập mã dịch vụ");
        String id=inputId(1);
        villa.setId(id);
        System.out.println("Nhập tên dịch vụ");
        String nameSevice=inputNameSerVices();
        villa.setNameSevices(nameSevice);
        System.out.println("Diện tích sử dụng");
        String arenaUsed=inputAreaUsed();
        villa.setArenaUsed(Double.parseDouble(arenaUsed));
        System.out.println("Chi phí thuê");
        String rental=inputRental();
        villa.setRental(Integer.parseInt(rental));
        System.out.println("Số người tối đa");
        String maxNumberOfPeople=inputMaxNumberOfPeople();
        villa.setMaxNumberOfPeople(Integer.parseInt(maxNumberOfPeople));
        System.out.println("Kiểu thuê");
        String typeOfRent=inputTypeOfRent();
        villa.setTypeOfRent(typeOfRent);
        System.out.println("Tiêu chuẩn phòng");
        String roomStrandard=inputRoomStandard();
        villa.setRoomStandard(roomStrandard);
        System.out.println("Diện tích hồ bơi");
        String poolArena=inputAreaPool();
        villa.setPoolArena(Double.parseDouble(poolArena));
        System.out.println("Số tầng");
        String numberOfFloors=inputNumberOfFloor();
        villa.setNumberOfFloors(Integer.parseInt(numberOfFloors));
        villaArrayList.add(villa);
        VillaCsv.writeVillaCsv(villaArrayList);
        displayMainMenu();
    }

    public void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<House> houseArrayList = new ArrayList<House>();
        houseArrayList = HouseCSV.readHouseCsv();
        House house = new House();
        System.out.println("Nhập mã dịch vụ");
        String id=inputId(1);
        house.setId(id);
        System.out.println("Nhập tên dịch vụ");
        String nameSevice=inputNameSerVices();
        house.setNameSevices(nameSevice);
        System.out.println("Diện tích sử dụng");
        String arenaUsed=inputAreaUsed();
        house.setArenaUsed(Double.parseDouble(arenaUsed));
        System.out.println("Chi phí thuê");
        String rental=inputRental();
        house.setRental(Integer.parseInt(rental));
        System.out.println("Số người tối đa");
        String maxNumberOfPeople=inputMaxNumberOfPeople();
        house.setMaxNumberOfPeople(Integer.parseInt(maxNumberOfPeople));
        System.out.println("Kiểu thuê");
        String typeOfRent=inputTypeOfRent();
        house.setTypeOfRent(typeOfRent);
        System.out.println("Tiêu chuẩn phòng");
        String roomStrandard=inputRoomStandard();
        house.setRoomStandard(roomStrandard);
        System.out.println("Số tầng");
        String numberOfFloors=inputNumberOfFloor();
        house.setNumberOfFloors(Integer.parseInt(numberOfFloors));
        houseArrayList.add(house);
        HouseCSV.writeHouseCsv(houseArrayList);
        displayMainMenu();
    }

    public void addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Room> roomArrayList = new ArrayList<Room>();
        roomArrayList = RoomCSV.readRoomCsv();
        Room room = new Room();
        System.out.println("Nhập mã dịch vụ");
        String id=inputId(1);
        room.setId(id);
        System.out.println("Nhập tên dịch vụ");
        String nameSevice=inputNameSerVices();
        room.setNameSevices(nameSevice);
        System.out.println("Diện tích sử dụng");
        String arenaUsed=inputAreaUsed();
        room.setArenaUsed(Double.parseDouble(arenaUsed));
        System.out.println("Chi phí thuê");
        String rental=inputRental();
        room.setRental(Integer.parseInt(rental));
        System.out.println("Số người tối đa");
        String maxNumberOfPeople=inputMaxNumberOfPeople();
        room.setMaxNumberOfPeople(Integer.parseInt(maxNumberOfPeople));
        System.out.println("Kiểu thuê");
        String typeOfRent=inputTypeOfRent();
        room.setTypeOfRent(typeOfRent);
        System.out.println("Dịch vụ miễn phí đi kèm");
        room.setFreeServiceIncluded(scanner.nextLine());
        roomArrayList.add(room);
        RoomCSV.writeRoomCsv(roomArrayList);
        displayMainMenu();
    }

    private void showServices() {
        System.out.println("1.\tShow all Villa" + "\n"
                + "2.\tShow all House" + "\n"
                + "3.\tShow all Room" + "\n"
                + "4.\tShow All Name Villa Not Duplicate" + "\n"
                + "5.\tShow All Name House Not Duplicate" + "\n" +
                "6.\tShow All Name Name Not Duplicate" + "\n"
                + "7.\tBack to menu" + "\n"
                + "8.\tExit");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose){
            case 1:{
                showAllVilla();
                break;
            }
            case 2:{
                showAllHouse();
                break;
            }
            case 3:{
                showAllRoom();
                break;
            }
            case 7:{
                displayMainMenu();
                break;
            }
            case 8:{
                System.exit(0);
                break;
            }
        }
    }

    private void showAllVilla() {
        ArrayList<Villa> villaArrayList = new ArrayList<Villa>();
        villaArrayList = VillaCsv.readVillaCsv();
        for (Villa villa : villaArrayList) {
            System.out.println("ID: " + villa.getId());
            System.out.println("Tên dịch vụ: " + villa.getNameSevices());
            System.out.println("Diện tích sử dụng: " + villa.getArenaUsed());
            System.out.println("Chi phí thuê: " + villa.getRental());
            System.out.println("Số người tối đa: " + villa.getMaxNumberOfPeople());
            System.out.println("Kiểu thuê: " + villa.getTypeOfRent());
            System.out.println("Tiêu chuẩn phòng: " + villa.getRoomStandard());
            System.out.println("Diện tích hồ bơi: " + villa.getNumberOfFloors());
            System.out.println("Số tầng: " + villa.getNumberOfFloors());
            System.out.println("Dịch vụ đi kèm : "+villa.showInfor());
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to continue: ");
        scanner.nextLine();
        displayMainMenu();
    }
    private void showAllHouse() {
        ArrayList<House> houseArrayList = new ArrayList<House>();
        houseArrayList = HouseCSV.readHouseCsv();
        for (House house : houseArrayList) {
            System.out.println("ID: " + house.getId());
            System.out.println("Tên dịch vụ: " + house.getNameSevices());
            System.out.println("Diện tích sử dụng: " + house.getArenaUsed());
            System.out.println("Chi phí thuê: " + house.getRental());
            System.out.println("Số người tối đa: " + house.getMaxNumberOfPeople());
            System.out.println("Kiểu thuê: " + house.getTypeOfRent());
            System.out.println("Tiêu chuẩn phòng: " + house.getRoomStandard());
            System.out.println("Số tầng: " + house.getNumberOfFloors());
            System.out.println("Dịch vụ đi kèm : "+house.showInfor());
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to continue: ");
        scanner.nextLine();
        displayMainMenu();
    }
    private void showAllRoom() {
        ArrayList<Room> roomArrayList = new ArrayList<Room>();
        roomArrayList = RoomCSV.readRoomCsv();
        for (Room room : roomArrayList) {
            System.out.println("ID: " + room.getId());
            System.out.println("Tên dịch vụ: " + room.getNameSevices());
            System.out.println("Diện tích sử dụng: " + room.getArenaUsed());
            System.out.println("Chi phí thuê: " + room.getRental());
            System.out.println("Số người tối đa: " + room.getMaxNumberOfPeople());
            System.out.println("Kiểu thuê: " + room.getTypeOfRent());
            System.out.println("Dịch vụ miễn phí đi kèm: "+room.getFreeServiceIncluded());
            System.out.println("Dịch vụ đi kèm : "+room.showInfor());
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to continue: ");
        scanner.nextLine();
        displayMainMenu();
    }

    public String inputId(int i) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String id;
        do {
            System.out.print("Nhap vao id: ");
            id = scanner.nextLine();
            String patt;
            if (i == 1) {
                patt = "^SVVL-\\d{4}$";
            } else if (i == 2) {
                patt = "^SVHO-\\d{4}$";
            } else {
                patt = "^SVRO-\\d{4}$";
            }
            boolean math = id.matches(patt);
            if (math) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }
        } while (flag);
        return id;
    }


    public String inputNameSerVices() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String nameSerVices;
        do {
            System.out.print("Nhap vao ten dich vu: ");
            nameSerVices = scanner.nextLine();
            String patt = "^[A-Z]+[a-z0-9]{1,}+\\s+[a-zA-Z0-9\\s]{0,}";
            boolean math = nameSerVices.matches(patt);
            if (math) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }
        } while (flag);
        return nameSerVices;
    }

    public String inputAreaUsed() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String areaUsed;
        do {
            System.out.print("Nhap vao dien tich su dung: ");
            areaUsed = scanner.nextLine();
            String patt = "^[1-9]+(\\d){1,}+\\.+(\\d){1,}";
            boolean math = areaUsed.matches(patt);
            if (math && (Double.valueOf(areaUsed) > 30.0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }

        } while (flag);
        return areaUsed;
    }

    public String inputAreaPool() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String areaPool;
        do {
            System.out.print("Nhap vao dien tich ho boi: ");
            areaPool = scanner.nextLine();
            String patt = "^[1-9]+(\\d){1,}+\\.+(\\d){1,}";
            boolean math = areaPool.matches(patt);
            if (math && (Double.valueOf(areaPool) > 30.0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }

        } while (flag);
        return areaPool;
    }

    public String inputRental() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String rental;
        do {
            System.out.print("Nhap vao chi phi thue: ");
            rental = scanner.nextLine();
            String patt = "^[1-9]+[\\d]*$";
            boolean math = rental.matches(patt);
            if (math && (Integer.valueOf(rental) >0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }

        } while (flag);
        return rental;
    }

    public String inputMaxNumberOfPeople() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String maxNumberOfPeople;
        do {
            System.out.print("Nhap vao so nguoi toi da: ");
            maxNumberOfPeople = scanner.nextLine();
            String patt = "(\\d){1,2}";
            boolean math = maxNumberOfPeople.matches(patt);
            if (math && ((Integer.parseInt(maxNumberOfPeople) > 0) && (Integer.parseInt(maxNumberOfPeople) < 20))) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }

        } while (flag);
        return maxNumberOfPeople;
    }

    public String inputNumberOfFloor() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String numberOfFloor;
        do {
            System.out.print("Nhap vao so tang: ");
            numberOfFloor = scanner.nextLine();
            String patt = "(\\d){1,2}";
            boolean math = numberOfFloor.matches(patt);
            if (math && (Integer.parseInt(numberOfFloor) > 0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }

        } while (flag);
        return numberOfFloor;
    }

    public String inputTypeOfRent() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String typeOfRent = "";
        do {
            System.out.print("Nhap vao kieu thue: ");
            typeOfRent = scanner.nextLine();
            String patt = "day|month|year|hour|week";
            boolean math = typeOfRent.matches(patt);
            if (math) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }
        } while (flag);
        return typeOfRent;
    }

    public String inputRoomStandard() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String roomStandard = "";
        do {
            System.out.print("Nhap vao tieu chuan phong: ");
            roomStandard = scanner.nextLine();
            String patt = "(Normal|Premium|VIP)";
            boolean math = roomStandard.matches(patt);
            if (math) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }
        } while (flag);
        return roomStandard;
    }


    public void showAllNameVillaNotDuplicate() throws IOException {
        VillaCsv readCsvVilla = new VillaCsv();
        listVillaNotDuplicate = readCsvVilla.readCsvVillaNotDuplicate();
        int i = 0;
        for (String listVilla : listVillaNotDuplicate) {
            i++;
            System.out.println(i + "." + listVilla);
            System.out.println("------------------------------------------------------------------------");
        }
    }

    public void showAllNameHouseNotDuplicate() throws IOException {
        HouseCSV readCsvHouse = new HouseCSV();
        listHouseNotDuplicate = readCsvHouse.readCsvHouseNotDuplicate();
        int i = 0;
        for (String listHouse : listHouseNotDuplicate) {
            i++;
            System.out.println(i + "." + listHouse);
            System.out.println("------------------------------------------------------------------------");
        }
    }

    public void showAllNameRoomNotDuplicate() throws IOException {
        RoomCSV readCsvRoom = new RoomCSV();
        listRoomNotDuplicate = readCsvRoom.readCsvRoomNotDuplicate();
        int i = 0;
        for (String listRoom : listRoomNotDuplicate) {
            i++;
            System.out.println(i + "." + listRoom);
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
