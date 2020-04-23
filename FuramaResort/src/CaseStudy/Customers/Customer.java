package CaseStudy.Customers;

import CaseStudy.Models.Services;

public class Customer {
    private String nameCustomer;
    private String birthday;
    private String gender;
    private int cmnd;
    private int phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Services services;

    public Customer() {
    }

    public Customer(String nameCustomer, String birthday, String gender, int cmnd,
                    int phoneNumber, String email, String typeOfCustomer, String address, Services services) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.services = services;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }
    public String showInfor(){
        return "1.Ho va ten: " + this.getNameCustomer() + "\n"
                + "2.Ngay sinh: " + this.getBirthday() + "\n"
                + "3.Gioi tinh: " + this.getGender() + "\n"
                + "4.CMND: " + this.getCmnd() + "\n"
                + "5.So dien thoai: " + this.getPhoneNumber() + "\n"
                + "6.Email: " + this.getEmail() + "\n"
                + "7.Loai khach hang: " + this.getTypeOfCustomer() + "\n"
                + "8.Dia chi: " + this.getAddress() + "\n";
    }
}
