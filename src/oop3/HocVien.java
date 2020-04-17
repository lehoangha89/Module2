package oop3;

public abstract class HocVien {
    public String hoTen;
    public String namSinh;

    public HocVien(String hoTen, String namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public void hocBai(String monHoc) {
        System.out.println(this.hoTen + " hoc bai " + monHoc);
    }

    public abstract void diHoc(String truongHoc);
}
