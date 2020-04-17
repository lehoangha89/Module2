package AdvanceedObjectOrientedDesign.ThucHanh.InterfaceComparator;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0] = new Rectangle(3.3, 2.2);
        rectangle[1] = new Rectangle(4.4, 5.5, "Yellow", true);
        rectangle[2] = new Rectangle();

        System.out.println("Pre-sorted: ");
        for (Rectangle rectangles:rectangle){
            System.out.println(rectangles);
        }
        Comparator rectangleComparator=new RectangleComparator();
        Arrays.sort(rectangle,rectangleComparator);
        System.out.println("After-sorted: ");
        for (Rectangle rectangles:rectangle){
            System.out.println(rectangles);
        }
    }
}
