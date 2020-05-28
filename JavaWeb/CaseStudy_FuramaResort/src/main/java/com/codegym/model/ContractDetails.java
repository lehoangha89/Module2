package com.codegym.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "contractdetails")
public class ContractDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int amount;

    @ManyToMany
    @JoinTable(name = "contractdetails_contract",
            joinColumns = @JoinColumn(name = "contractdetails_id"),
            inverseJoinColumns = @JoinColumn(name = "contract_id"))
    private Collection<Contract> contracts;

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

    public Collection<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Collection<Contract> contracts) {
        this.contracts = contracts;
    }
}
