package AdvanceedObjectOrientedDesign.BaiTap;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares=new Square[3];
        squares[0]=new Square();
        squares[1]=new Square(10);
        squares[2]=new Square(20,"Black",true);
        System.out.println("Pre-resize: ");
        for (Square square:squares){
            System.out.println(square.getArea());
        }
        System.out.println("After-resize: ");
        for (Square square:squares){
            square.resize(10);
        }
    }
}
