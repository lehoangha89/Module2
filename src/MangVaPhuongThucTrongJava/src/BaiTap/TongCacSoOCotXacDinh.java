package BaiTap;

import java.util.Scanner;

public class TongCacSoOCotXacDinh {
    public static void main(String[] args) {
        int soDong,soCot;
        int tong;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số dòng");
        soDong=scanner.nextInt();
        System.out.println("Nhập số cột");
        soCot=scanner.nextInt();
        System.out.println("Số cột cần tính tổng");
        tong=scanner.nextInt();
        int array[][]=new int[soDong][soCot];
        System.out.println("Nhập các phần tử trong mảng");
        for (int i=0;i<soDong;i++){
            for (int j=0;j<soCot;j++){
                array[i][j]=scanner.nextInt();
                System.out.println("[ "+i+" ]"+" [ "+j+" ]");
            }
        }
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i][tong];
        }
        System.out.println("Tổng của cột "+tong+" là: "+sum);
    }
}
