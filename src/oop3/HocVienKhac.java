package oop3;

public class HocVienKhac {

    String hoTen;
    String namSinh;

    HoSoCaNhan hoSoCaNhan = new HoSoCaNhan() {
        @Override
        public void capNhatHoSoCaNhan(String thongTinCanUpdate) {
            System.out.println("HocVienKhac da cap nhat ho so ca nhan");
        }
    };

    HocVien hocVien = new HocVien("Tien", "99") {
        @Override
        public void diHoc(String truongHoc) {
            System.out.println("HocVienKhac di hoc o " + truongHoc);
        }
    };

    public HocVienKhac(String hoTen, String namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }
}
