package CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.LinkedList;

public class LinkedTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        for (int i=0;i<linkedList.size();i++){
            System.out.println("Add First: "+linkedList.get(i));
        }
        System.out.println();
        linkedList.addLast(9);
        linkedList.addLast(8);
        linkedList.addLast(7);
        for (int i=0;i<linkedList.size();i++){
            System.out.println("Add Last: "+linkedList.get(i));
        }
        System.out.println();
        linkedList.add(3,4);
        linkedList.add(4,5);
        for (int i=0;i<linkedList.size();i++){
            System.out.println("Add Element: "+linkedList.get(i));
        }
        System.out.println();
        linkedList.remove(2);
        for (int i=0;i<linkedList.size();i++){
            System.out.println("Remove Index: "+linkedList.get(i));
        }
        System.out.println();
        linkedList.remove(3 );
        for (int i=0;i<linkedList.size();i++){
            System.out.println("Remove Element: "+linkedList.get(i));
        }
        System.out.println();
        LinkedList<Integer> cloneLinkedList= linkedList.clone();
        for (int i=0;i<cloneLinkedList.size();i++){
            System.out.println("Clone Element: "+cloneLinkedList.get(i));
        }
        System.out.println();

        System.out.println(linkedList.constrain(15));
        System.out.println();
        System.out.println(linkedList.indexOf(15));
        System.out.println("Phần tử đầu tiên: "+linkedList.getFirst());
        System.out.println("Phần tử cuối cùng: "+linkedList.getLast());
        linkedList.clear();
        System.out.println("Sau khi xóa mảng");


    }
}
