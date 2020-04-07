package NgonNguLapTrinhJaVa.BaiTap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        String number = sc.nextLine();
        switch (number.length()){
            case 0:
                System.out.print("Khong");
                break;
            case 1:
                System.out.print("Mot");
                break;
            case 2:
                System.out.print("Hai");
                break;
            case 3:
                System.out.print("Ba");
                break;
            case 4:
                System.out.print("Bon");
                break;
            case 5:
                System.out.print("Nam");
                break;
            case 6:
                System.out.println("Sau");
                break;
            case 7:
                System.out.println("Bay");
                break;
            case 8:
                System.out.println("Tam");
                break;
            case 9:
                System.out.println("Chin");
            break;
        }
    }
}
