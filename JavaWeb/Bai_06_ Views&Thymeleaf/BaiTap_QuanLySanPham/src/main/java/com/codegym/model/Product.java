package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String manufacturing;
    private String img;

    public Product() {
    }

    public Product(int id, String name, double price, String manufacturing, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturing = manufacturing;
        this.img=img;
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

    public String getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(String manufacturing) {
        this.manufacturing = manufacturing;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
