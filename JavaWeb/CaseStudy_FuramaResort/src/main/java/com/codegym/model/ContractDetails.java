package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;


@Entity
@Table(name = "contractdetails")
public class ContractDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Min(1)
    private int amount;

    @ManyToOne
    @JoinColumn(name = "contracts_id")
    private Contract contract;
    @ManyToOne
    @JoinColumn(name = "dichvu_dikem_id")
    private DichvuDiKem dichvuDiKem;

    public ContractDetails() {
    }

    public ContractDetails(int amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public DichvuDiKem getDichvuDiKem() {
        return dichvuDiKem;
    }

    public void setDichvuDiKem(DichvuDiKem dichvuDiKem) {
        this.dichvuDiKem = dichvuDiKem;
    }
}
