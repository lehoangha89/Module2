package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "services")
public class Dichvu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameService;
    private int areaUser;
    private int numberOfFloors;
    private int maxNumberOfPeople;
    private int cost;
    private String status;

    @OneToMany(mappedBy = "dichvu")
    private Set<Contract> contracts;

    public Dichvu() {
    }

    public Dichvu(String nameService, int areaUser, int numberOfFloors, int maxNumberOfPeople, int cost, String status) {
        this.nameService = nameService;
        this.areaUser = areaUser;
        this.numberOfFloors = numberOfFloors;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.cost = cost;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAreaUser() {
        return areaUser;
    }

    public void setAreaUser(int areaUser) {
        this.areaUser = areaUser;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}
