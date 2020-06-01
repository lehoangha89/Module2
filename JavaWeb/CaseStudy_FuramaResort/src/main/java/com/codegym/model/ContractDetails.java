package com.codegym.model;

import javax.persistence.*;


@Entity
@Table(name = "contractdetails")
public class ContractDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int amount;

   @ManyToOne
   @JoinColumn(name = "contract_id")
   private Contract contract;

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
}
