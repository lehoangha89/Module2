package AdvanceedObjectOrientedDesign.BaiTap;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circle=new Circle[3];
        circle[0]=new Circle();
        circle[1]=new Circle(5);
        circle[2]=new Circle(2.2,"blue",true);
        System.out.println("Pre-resize: ");
        for (Circle circles:circle){
            System.out.println(circles.getArea());
        }
        System.out.println("After-resize: ");
        for (Circle circles:circle){
            circles.resize(50);
        }
    }
}
