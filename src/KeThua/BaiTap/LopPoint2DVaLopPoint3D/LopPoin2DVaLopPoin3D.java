package KeThua.BaiTap.LopPoint2DVaLopPoint3D;

public class LopPoin2DVaLopPoin3D {
    public static void main(String[] args) {
        LopPoint2D lop2D=new LopPoint2D();
        System.out.println(lop2D);
        lop2D=new LopPoint2D(2.2f,3.3f);
        System.out.println(lop2D);
        LopPoint3D lop3D=new LopPoint3D();
        System.out.println(lop3D);
        lop3D=new LopPoint3D(2.3f,3.2f,4.4f);
        System.out.println(lop3D);
    }
}
