package KeThua.BaiTap.ThietKeVatrienKhaiLopTriangle;

public class ThietkeVaTrienKhaiLopTriangle {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);
        shape=new Shape("blue",false);
        System.out.println(shape);

        Triangle triangle=new Triangle();
        System.out.println(triangle);
        triangle=new Triangle(10.1,10.2,10.3);
        System.out.println(triangle);
        triangle=new Triangle("green",true,10.5,20.6,30.7);
        System.out.println(triangle);
    }
}
