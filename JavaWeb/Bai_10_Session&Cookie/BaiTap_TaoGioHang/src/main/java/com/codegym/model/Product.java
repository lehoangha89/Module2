package com.codegym.model;

import javax.persistence.*;

//@Entity
//@Table(name = "products")
//public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String name;
//    private int price;
//    private String img;
//    private int amount=0;
//
//    public Product() {
//    }
//
//    public Product(Long id, String name, int price, String img) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//        this.img = img;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getImg() {
//        return img;
//    }
//
//    public void setImg(String img) {
//        this.img = img;
//    }
//
//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }
//    public void addAmount() {
//        amount++;
//    }
//    public void delAmount() {
//        amount--;
//    }
//}



@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    int price;
    String img;
    int amount = 0;

    public int getAmount() {
        return amount;
    }

    public void addAmount() {
        amount++;
    }
    public void delAmount() {
        amount--;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product() {
    }

    public Product(String name, int price, String img) {
        this.name = name;
        this.price = price;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String imgUrl) {
        this.img = imgUrl;
    }
}
