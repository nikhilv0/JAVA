package com.xworkz.dto;

import java.io.Serializable;

public class PassportDTO implements Serializable {

    private String applicantName;
    private Long aadharNo;
    private String address;
    private String panNo;
    private String country;
    private String state;
    private String city;
    private int pinCode;
    private String passportType;
    private Long paymentRefNo;

    public PassportDTO() {
        System.out.println("running PassportDTO const");
    }

    public PassportDTO(String applicantName, Long aadharNo, String address, String panNo, String country, String state, String city, int pinCode, String passportType, Long paymentRefNo) {
        this.applicantName = applicantName;
        this.aadharNo = aadharNo;
        this.address = address;
        this.panNo = panNo;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.passportType = passportType;
        this.paymentRefNo = paymentRefNo;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public Long getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(Long aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getPassportType() {
        return passportType;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }

    public Long getPaymentRefNo() {
        return paymentRefNo;
    }

    public void setPaymentRefNo(Long paymentRefNo) {
        this.paymentRefNo = paymentRefNo;
    }
}

