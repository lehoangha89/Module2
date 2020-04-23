//package CaseStudy.Controllers;
//
//import CaseStudy.Commons.ScannerUtils;
//import CaseStudy.Models.Services;
//import CaseStudy.Models.Villa;
//
//import static CaseStudy.Commons.Menu.displayMenuAddNewService;
//import static CaseStudy.Controllers.MainController.backMainMenu;
//
//public class SeviceController {
//    public static void addNewServices(){
//        displayMenuAddNewService();
//        processMenuAddNewService();
//    }
//
//    private static void processMenuAddNewService() {
//        switch (ScannerUtils.scanner.nextLine()) {
//            case "1": {
//                addNewVilla();
//                break;
//            }
//            case "2": {
//                addNewHouse();
//                break;
//            }
//            case "3": {
//                addNewRoom();
//                break;
//            } case "4":{
//                processMain();
//                break;
//            }case "5"{
//                System.exit(0);
//                break;
//            } default:{
//                System.out.println("Nhập Lại");
//                backMainMenu();
//                break;
//            }
//        }
//    }
//
//    private static void addNewVilla() {
//        Services villa=new Villa();
//        villa=addNewService(villa);
//        System.out.println("Enter Room Standard");
//        ((Villa)villa).setRoomStandard(ScannerUtils.scanner.nextLine());
//
//    }
//
//    public static void showServices(){
//
//    }
//}
