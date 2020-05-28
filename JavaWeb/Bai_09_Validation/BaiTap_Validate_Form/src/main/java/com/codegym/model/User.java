package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "dangki")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    @Size(min = 5, max = 45)
    private String firstName;
    @NotEmpty
    @Size(min = 5, max = 45)
    private String lastName;
    @NotEmpty
    @Size(min = 5,max = 45)
    @Pattern(regexp = "^[A-Za-z0-9]*$",message = "Định dạng account không chính xác")
    private String account;
    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z0-9]*$",message = "Password không chính xác")
    private String password;
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Số điện thoại không chính xác")
    private String phoneNumber;
    @NotEmpty
    @Min(18)
    private String age;
    @NotEmpty
    @Email(message = "Định dạng email không chính xác")
    private String email;

    public User() {
    }

    public User(String firstName, String lastName,String account,String password, String phoneNumber, String age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account=account;
        this.password=password;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
