package BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a size: ");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("Size should not exceed 20");
            }
        }while (size>20);
       array=new int[size];
       int i=0;
       while (i<array.length){
           System.out.print("Enter element in array "+(i+1)+": ");
           array[i]=scanner.nextInt();
           i++;
       }
       int min=array[0];
       for (int j=2;j<array.length;j++){
           if (array[j]<min){
               min=array[j];
           }
       }
        System.out.println("Min number in array: "+min);
    }

}
