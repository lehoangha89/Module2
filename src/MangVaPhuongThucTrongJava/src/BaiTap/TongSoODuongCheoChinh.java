package BaiTap;

import java.util.Scanner;

public class TongSoODuongCheoChinh {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào bậc của ma trân");
        n=scanner.nextInt();
        int array[][]=new int[n][n];
        System.out.println("Nhập các phần tử cho mảng");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                array[i][j]=scanner.nextInt();
                System.out.print("[ "+i+" ]"+"[ "+j+" ]");
            }
        }for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println("tổng phần tử trong mảng: "+sum);
    }
}
