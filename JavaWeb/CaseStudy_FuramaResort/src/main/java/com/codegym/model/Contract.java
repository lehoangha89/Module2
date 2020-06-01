package com.codegym.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "contracts")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String contractDate;
    private String contractEndDate;
    private String deposits;
    private String totalMoney;

    @OneToMany(mappedBy = "contract")
    private Set<ContractDetails> contractDetails;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "dichvu_id")
    private Dichvu dichvu;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Contract() {
    }

    public Contract(String contractDate, String contractEndDate, String deposits, String totalMoney) {
        this.contractDate = contractDate;
        this.contractEndDate = contractEndDate;
        this.deposits = deposits;
        this.totalMoney = totalMoney;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getDeposits() {
        return deposits;
    }

    public void setDeposits(String deposits) {
        this.deposits = deposits;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Set<ContractDetails> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetails> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Dichvu getDichvu() {
        return dichvu;
    }

    public void setDichvu(Dichvu dichvu) {
        this.dichvu = dichvu;
    }
}
