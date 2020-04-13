import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 8}, {3, 5, 6}, {7, 8, 9}};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cột cần tính tổng: ");
        int j=input.nextInt();
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i][j];
        }
        System.out.print("Tổng của cột " +j+" là: "+sum);
    }
}
