package BaiTap;

import java.util.Scanner;

public class SoLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int soDong;
        int soCot;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhâp số dòng");
        soDong=scanner.nextInt();
        System.out.println("Nhập số cột");
        soCot=scanner.nextInt();
        int array[][]=new int[soDong][soCot];
        System.out.println("Nhập vào phần tử của ma trận");
        for (int i=0;i<soDong;i++){
            for (int j=0;j<soCot;j++){
                array[i][j]=scanner.nextInt();
                System.out.println("[ "+i+" ]"+" [ "+j+" ]");
            }
        }
        int arrayMax=array[0][0];
        for (int i=0;i<soDong;i++){
            for (int j=0;j<soCot;j++){
                if (array[i][j]>arrayMax){
                        arrayMax=array[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất trong mảng là: "+arrayMax);
    }
}
