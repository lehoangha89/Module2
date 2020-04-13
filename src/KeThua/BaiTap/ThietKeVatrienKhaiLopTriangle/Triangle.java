package KeThua.BaiTap.ThietKeVatrienKhaiLopTriangle;

public class Triangle extends Shape{
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;
    public Triangle(){

    }
    public Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public Triangle(String color, boolean filled, double side1,double side2,double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double halfPerimeter(){
        return (this.getSide1()+this.getSide2()+this.getSide3())/2;
    }
    public double getArena(){
        return Math.sqrt(this.halfPerimeter()*(this.halfPerimeter()-this.getSide1())*(this.halfPerimeter()-this.getSide2())
                *(this.halfPerimeter()-this.getSide3()));
    }

    @Override
    public String toString() {
        return "A Triangle " +
                "side1=" + this.getSide1() +
                ", side2= " + this.getSide2() +
                ", side3= " + this.getSide3() +
                " and arena= " + this.getArena()+
                super.toString();
    }
}
