package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Set;

@Entity
@Table(name = "dichvu_dikem")
public class DichvuDiKem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameAccompanied;
    @Min(1)
    private int priceAccompanied;
    @Min(1)
    private int unit;
    private String statusOfUse;

    @OneToMany(mappedBy = "dichvuDiKem")
    private Set<ContractDetails> contractDetails;

    public DichvuDiKem() {
    }

    public DichvuDiKem(Long id, String nameAccompanied, int priceAccompanied, int unit, String statusOfUse) {
        this.id = id;
        this.nameAccompanied = nameAccompanied;
        this.priceAccompanied = priceAccompanied;
        this.unit = unit;
        this.statusOfUse = statusOfUse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameAccompanied() {
        return nameAccompanied;
    }

    public void setNameAccompanied(String nameAccompanied) {
        this.nameAccompanied = nameAccompanied;
    }

    public int getPriceAccompanied() {
        return priceAccompanied;
    }

    public void setPriceAccompanied(int priceAccompanied) {
        this.priceAccompanied = priceAccompanied;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getStatusOfUse() {
        return statusOfUse;
    }

    public void setStatusOfUse(String statusOfUse) {
        this.statusOfUse = statusOfUse;
    }

    public Set<ContractDetails> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetails> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
