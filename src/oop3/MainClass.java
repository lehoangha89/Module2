package oop3;

public class MainClass {
    final double PI = 3.14;

    public static void main(String[] args) {
//        HocVienCodeGym hocVienCG1 = new HocVienCodeGym("Duy", "97", "bi sot");
//        hocVienCG1.boOngTietKiem(15);
//        System.out.println(hocVienCG1.ongTietKiem);
//        HocVienCodeGym hocVienCG2 = new HocVienCodeGym("Toan", "98", "bi cam");
//        hocVienCG2.boOngTietKiem(30);
//        System.out.println(hocVienCG2.ongTietKiem);
//
//        // Normal
//        HocVien hocVien = new HocVien("Thai", "20");
//        hocVien.hocBai("SQL");
//
//        // Implicit
//        HocVien hocVien2 = new HocVienCodeGym("Duy", "97", "bi sot");
//        hocVien2.hocBai("Java OOP");
//
//        // Explicit
//        HocVienCodeGym hocVien3 = (HocVienCodeGym) hocVien2;
//        hocVien3.boOngTietKiem(50);
//        System.out.println(HocVienCodeGym.ongTietKiem);
//        hocVien3.hocBai("Java Inheritance");

        // abstract
        HocVien hocVien = new HocVienCodeGym("Duy", "97", "bi sot");
        hocVien.diHoc("TT CodeGym");

        // interface
        HocVienCodeGym hocVien2 = new HocVienCodeGym("Hoang", "97", "bi sot");
        hocVien2.capNhatHoSoCaNhan("tuoi la 20");

        // anonymous
        HocVienKhac hocVienKhac = new HocVienKhac("Duy", "97");
        hocVienKhac.hoSoCaNhan.capNhatHoSoCaNhan("tuoi 77");
        hocVienKhac.hocVien.diHoc("truong khac");
    }
}
