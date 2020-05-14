package Com;

import java.util.ArrayList;

public class Customer {
    public String name;
    public String birthday;
    public String address;
    public String img;

    public Customer(String name, String birthday, String address, String img) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
