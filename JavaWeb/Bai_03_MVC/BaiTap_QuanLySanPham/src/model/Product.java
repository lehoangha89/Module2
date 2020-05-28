package model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String addressProduction;
    private String img;

    public Product() {
    }

    public Product(int id, String name, double price, String addressProduction,String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.addressProduction = addressProduction;
        this.img=img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddressProduction() {
        return addressProduction;
    }

    public void setAddressProduction(String addressProduction) {
        this.addressProduction = addressProduction;
    }
}
