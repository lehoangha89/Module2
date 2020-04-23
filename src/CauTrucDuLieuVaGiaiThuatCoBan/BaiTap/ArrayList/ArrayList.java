package CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.ArrayList;

import java.util.Arrays;

public class ArrayList<E> {
    private int size=0;
    static final int DEFAULT_CAPACITY=10;
    Object element[];

    public ArrayList() {
        element=new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        if (capacity>=0){
            element=new Object[capacity];
        }else {
            throw new IllegalArgumentException ("capacity "+capacity);
        }
    }
    public int size(){
        return this.size;
    }
    public void clear(){
        size=0;
        for (int i=0;i<element.length;i++){
            element[i]=null;
        }
    }
    public boolean add(E e){
        if (element.length==size){
            this.ensureCapacity(5);
        }
        element[size]=e;
        size++;
        return true;
    }
    public void add(E e,int index){
        if (index>element.length){
            throw new IllegalArgumentException("index: "+index);
        }else {
            this.ensureCapacity(5);
        }if (element[index]==null){
            element[index]=e;
            size++;
        }else {
            for (int i=size+1;i>=index;i--){
                element[i]=element[i-1];
            }
            element[index]=e;
            size++;
        }
    }

    public void ensureCapacity(int minCapacity){
        if (minCapacity>=0){
            int newSize=this.element.length+minCapacity;
            element = Arrays.copyOf(element, newSize);
        }else {
            throw new IllegalArgumentException("minCapacity: "+minCapacity);
        }
    }
    public void display(){
        for (int i=0;i<this.size();i++){
            System.out.print(this.element[i]+" ");
        }
    }
    public ArrayList<E> clone() {
        ArrayList<E> tmp = new ArrayList<>();
        tmp.element = Arrays.copyOf(element, size);
        tmp.size = size;

        return tmp;
    }
    public int indexOf(E e){
        int index=-1;
        for (int i=0 ; i<size;i++){
            if(element[i].equals(e)){
                return i;
            }
        }
        return  index;
    }
    public E remove(int index) {
        for (int i = index; i < this.size(); i++) {
            this.element[i] = this.element[i + 1];
        }
        this.size--;
        return (E) this.element;
    }
}
