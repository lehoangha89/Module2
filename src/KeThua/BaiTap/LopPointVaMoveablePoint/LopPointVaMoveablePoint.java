package KeThua.BaiTap.LopPointVaMoveablePoint;

public class LopPointVaMoveablePoint {
    public static void main(String[] args) {
        LopPoint lopPoint=new LopPoint();
        System.out.println(lopPoint);
        lopPoint=new LopPoint(1.1f,2.2f);
        System.out.println(lopPoint);

        MoveablePoint moveablePoint=new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint=new MoveablePoint(1.2f,2.3f,3.3f,4.4f);
        System.out.println(moveablePoint);
    }
}
