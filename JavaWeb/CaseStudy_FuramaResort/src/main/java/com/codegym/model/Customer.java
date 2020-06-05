package com.codegym.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    @Pattern(regexp = "^(KH-)+[0-9]{4}$",message = "Định dạng đúng KH-XXXX")
    private String idCustomer;
    private String name;
    private String bidrthday;
    @Pattern(regexp = "^([0-9]{9})|([0-9]{12}$)",message = "9 hoặc 12 số")
    private String cmnd;
    @Pattern(regexp = "^((090|091|(\\(84\\)\\+91)|(\\(84\\)\\+90))+[0-9]{7})$",message = "vd:0901234567, (84)+901234567")
    private String phoneNumber;
    @Email(message = "định dạng Email không chính xác")
    private String email;
    private String address;

    @OneToMany(mappedBy = "customer")
    private Set<Contract> contracts;

    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    private CustomerType customerType;

    public Customer() {
    }

    public Customer(String idCustomer,String name, String bidrthday, String cmnd, String phoneNumber, String email, String address) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.bidrthday = bidrthday;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBidrthday() {
        return bidrthday;
    }

    public void setBidrthday(String bidrthday) {
        this.bidrthday = bidrthday;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
