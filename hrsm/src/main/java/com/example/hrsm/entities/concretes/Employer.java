package com.example.hrsm.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Employer {


    @Id
    @GeneratedValue
    @Column(name = "employers_id")
    private int id;
    @Column(name = "employers_name")
    private String companyName;
    @Column(name = "employers_adress")

    private String webAddress;
    @Column(name = "employers_phone_number")
    private String phoneNumber;


    public Employer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Employer(int id, String companyName, String webAddress, String phoneNumber) {
        this.id = id;
        this.companyName = companyName;
        this.webAddress = webAddress;
        this.phoneNumber = phoneNumber;


    }
}
