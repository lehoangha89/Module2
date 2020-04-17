package oop3;

public class HocVienCodeGym extends HocVien implements HoSoCaNhan {
    public String thongTinBenhAn;
    public static int ongTietKiem;

    public HocVienCodeGym(String hoTen, String namSinh, String thongTinBenhAn) {
        super(hoTen, namSinh);
        this.thongTinBenhAn = thongTinBenhAn;
    }

    public void boOngTietKiem(int tien) {
        ongTietKiem += tien;
    }

    @Override
    public void hocBai(String monHoc) {
        System.out.println(this.hoTen + " la hoc vien CG, dang hoc bai " + monHoc);
    }

    @Override
    public void diHoc(String truongHoc) {
        System.out.println(this.hoTen + " la hoc vien CG, di hoc o " + truongHoc);
    }

    @Override
    public void capNhatHoSoCaNhan(String thongTinCanUpdate) {
        //...
        System.out.println("OK, da cap nhat");
    }
}
