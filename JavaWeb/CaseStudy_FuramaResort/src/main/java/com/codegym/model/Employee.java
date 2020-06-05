package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameEmployee;
    private String birthday;
    @Pattern(regexp = "^([0-9]{9})|([0-9]{12}$)",message = "9 hoặc 12 số")
    private String cmnd;
    @Min(1)
    private String salary;
    @Email(message = "Email không đúng định dạng")
    private String email;
    @Pattern(regexp = "^((090|091|(\\(84\\)\\+91)|(\\(84\\)\\+90))+[0-9]{7})$",message = "vd:0901234567, (84)+901234567")
    private String phoneNumber;
    private String address;

    @ManyToOne
    @JoinColumn(name = "level_employee_id")
    private LevelEmployee levelEmployee;
    @ManyToOne
    @JoinColumn(name = "part_emlpoyee_id")
    private PartEmployee partEmployee;
    @ManyToOne
    @JoinColumn(name = "position_employee_id")
    private PositionEmployee positionEmployee;
    @OneToMany(mappedBy = "employee")
    private Set<Contract> contracts;

    public Employee() {
    }

    public Employee(String nameEmployee, String birthday, String cmnd,String salary, String email, String phoneNumber, String address) {
        this.nameEmployee = nameEmployee;
        this.birthday = birthday;
        this.cmnd = cmnd;
        this.salary = salary;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LevelEmployee getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(LevelEmployee levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public PartEmployee getPartEmployee() {
        return partEmployee;
    }

    public void setPartEmployee(PartEmployee partEmployee) {
        this.partEmployee = partEmployee;
    }

    public PositionEmployee getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(PositionEmployee positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}
