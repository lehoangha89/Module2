package AdvanceedObjectOrientedDesign.BaiTap;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangle=new Rectangle[3];
        rectangle[0]=new Rectangle();
        rectangle[1]=new Rectangle(1.1,1.2);
        rectangle[2]=new Rectangle(2.2,3.3,"red",false);
        System.out.println("Pre-resize: ");
        for (Rectangle rectangles:rectangle){
            System.out.println(rectangles.getArea());
        }
        System.out.println("After-resize: ");
        for (Rectangle rectangles:rectangle){
            rectangles.resize(20);
        }
    }
}
