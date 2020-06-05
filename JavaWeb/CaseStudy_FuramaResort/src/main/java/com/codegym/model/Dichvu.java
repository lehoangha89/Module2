package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
@Table(name = "services")
public class Dichvu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    @Pattern(regexp = "^(DV-)+\\d{4}$")
    private String idService;
    private String nameService;
    @Min(1)
    private int areaUser;
    @Min(1)
    private int numberOfFloors;
    @Min(1)
    private int maxNumberOfPeople;
    @Min(1)
    private int cost;
    private String status;

    @OneToMany(mappedBy = "dichvu")
    private Set<Contract> contracts;
    @ManyToOne
    @JoinColumn(name = "type_service_id")
    private TypeDichvu typeDichvu;
    @ManyToOne
    @JoinColumn(name = "type_of_rent_id")
    private TypeOfRent typeOfRent;

    public TypeOfRent getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(TypeOfRent typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public Dichvu() {
    }

    public Dichvu(String idService,String nameService, int areaUser, int numberOfFloors, int maxNumberOfPeople, int cost, String status) {
        this.idService = idService;
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

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
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

    public TypeDichvu getTypeDichvu() {
        return typeDichvu;
    }

    public void setTypeDichvu(TypeDichvu typeDichvu) {
        this.typeDichvu = typeDichvu;
    }
}
