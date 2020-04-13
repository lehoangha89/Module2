package LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class PhuongTrinhBac2 {

    double a, b, c;

    private PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public static void GiaiPhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có 1 nghiệm: " + "x= " + (-c / b));
            }
            return;
        }
        double delta = (b * b) - (4 * a * c);
        double x1, x2;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 =" + x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
        return;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số A: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số B: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số C: ");
        double c = scanner.nextDouble();
        PhuongTrinhBac2.GiaiPhuongTrinhBac2(a, b, c);
    }
}
