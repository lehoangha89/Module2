import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int number=sc.nextInt();
        int a=(int)(Math.round(number/100));
        int b=(int)(Math.round(number/10)-a*10);
        int c=number-100*a-10*b;
    }
}

