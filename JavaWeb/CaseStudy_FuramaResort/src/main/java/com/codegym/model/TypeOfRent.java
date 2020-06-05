package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Set;

@Entity
@Table(name = "type_of_rent")
public class TypeOfRent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameTypeOfRent;
    @Min(1)
    private int price;

    @OneToMany(mappedBy = "typeOfRent")
    private Set<Dichvu> dichvus;

    public TypeOfRent() {
    }

    public TypeOfRent(Long id, String nameTypeOfRent, int price) {
        this.id = id;
        this.nameTypeOfRent = nameTypeOfRent;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTypeOfRent() {
        return nameTypeOfRent;
    }

    public void setNameTypeOfRent(String nameTypeOfRent) {
        this.nameTypeOfRent = nameTypeOfRent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Set<Dichvu> getDichvus() {
        return dichvus;
    }

    public void setDichvus(Set<Dichvu> dichvus) {
        this.dichvus = dichvus;
    }
}
