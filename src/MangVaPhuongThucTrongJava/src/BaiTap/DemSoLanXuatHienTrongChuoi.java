package BaiTap;

import java.util.Scanner;

public class DemSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra");
        String str=scanner.nextLine();
        System.out.println("Nhập vào kí tự cần kiểm tra ");
        Character a=scanner.next().charAt(0);
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==a){
                count++;
            }
        }
        System.out.println("so lan xuat hien cua "+a+" trong chuoi "+str+" la: "+count);
    }
}
