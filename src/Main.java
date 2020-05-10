import CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.ArrayList.ArrayList;

public class Main {
    public static void main(String[] args) {
        String abc = "abc";
        String a= new String("abc");
        System.out.println(abc.hashCode());
        System.out.println(a.hashCode());
        System.out.println(Integer.toHexString(a.hashCode()));
    }
}
