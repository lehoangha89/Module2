package NgonNguLapTrinhJaVa.ThucHanh;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Width");
        width=sc.nextFloat();
        System.out.println("Enter Height");
        height=sc.nextFloat();
        float arena=width*height;
        System.out.println("Arena is: "+arena);
    }
}
