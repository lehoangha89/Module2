package LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    private QuadraticEquation(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
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
    public double delta(){
        return (this.getB()*this.getB())-4*this.getA()*this.getC();
    }
    public double Nghiem1(){
        return (-this.getB()+Math.sqrt(this.delta()))/(2*this.getA());
    }
    public double Nghiem2(){
        return (-this.getB()-Math.sqrt(this.delta()))/(2*this.getA());
    }
    public double NghiemKep(){
        return -this.getB()/(2*this.getA());
    }
    public void GiaiPT(){
        if (this.delta()>0){
            System.out.println("Phương trình có 2 nghiệm là: "+"x1 = "+this.Nghiem1()+" và x2 = "+this.Nghiem2());
        }else if (this.delta()==0){
            System.out.println("Phương trình có nghiệm kép: "+"x1 = x2 ="+this.NghiemKep());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập hệ số A: ");
        double a=scanner.nextDouble();
        System.out.println("Nhập hệ số B: ");
        double b=scanner.nextDouble();
        System.out.println("Nhập hệ số C: ");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        quadraticEquation.GiaiPT();
    }
}
