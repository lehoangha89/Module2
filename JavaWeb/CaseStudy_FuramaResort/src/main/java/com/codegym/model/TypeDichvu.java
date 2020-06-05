package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "type_service")
public class TypeDichvu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dichvuType;

    @OneToMany(mappedBy = "typeDichvu")
    private Set<Dichvu> dichvus;

    public TypeDichvu() {
    }

    public TypeDichvu(Long id, String dichvuType) {
        this.id = id;
        this.dichvuType = dichvuType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDichvuType() {
        return dichvuType;
    }

    public void setDichvuType(String dichvuType) {
        this.dichvuType = dichvuType;
    }

    public Set<Dichvu> getDichvus() {
        return dichvus;
    }

    public void setDichvus(Set<Dichvu> dichvus) {
        this.dichvus = dichvus;
    }
}
