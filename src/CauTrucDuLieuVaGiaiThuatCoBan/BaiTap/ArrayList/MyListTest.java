package CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.println("add phan tu vao list: ");
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);

        for (int i=0;i<arrayList.size();i++){
            System.out.println("Phần tử trong Mảng: "+arrayList.element[i]);
        }

        System.out.println("Số phần tử trong mảng: "+arrayList.size());

        System.out.println("add phan tu vao list vi tri i: ");
        arrayList.add(2,1);
        arrayList.add(4,3);
        arrayList.add(6,4);
        for (int i=0;i<arrayList.size();i++){
            System.out.println("Phần tử trong mảng sau khi thay đổi: "+arrayList.element[i]);
        }

        ArrayList<Integer> arrayList1=arrayList.clone();
        for (int i=0;i<arrayList1.size();i++){
            System.out.println("Phần tử clone: "+arrayList1.element[i]);
        }

        System.out.println("Vị trí xuất hiện: "+arrayList.indexOf(5));
        System.out.println("Vị trí xuất hiện: "+arrayList.indexOf(1));

        arrayList.remove(1);
        arrayList.remove(3);
        arrayList.remove(5);
        for (int i=0;i<arrayList.size();i++){
            System.out.println("Phần tử trong mảng sau khi xóa: "+arrayList.element[i]);
        }

        arrayList.clear();
        System.out.println("Sau khi xóa mảng");
    }
}
