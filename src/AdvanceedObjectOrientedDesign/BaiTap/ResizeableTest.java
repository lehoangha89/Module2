package AdvanceedObjectOrientedDesign.BaiTap;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
        shapeArray[0]= new Circle(6.2);
        shapeArray[1]= new Rectangle(2, 3.2);
        shapeArray[2]= new Square(10);
        for (Shape shape: shapeArray) {
            shape.resize(getRandom());
            System.out.println();
        }
    }
    public static double getRandom() {
        return (Math.round((Math.random() * 50 )+ 1));
    }

}

