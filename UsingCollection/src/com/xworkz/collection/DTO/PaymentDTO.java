package com.xworkz.collection.DTO;

import java.io.Serializable;
import java.time.LocalDate;

public class PaymentDTO implements Serializable {

    private String name;
    private String lastName;
    private String email;
    private String country;
    private String zipCode;
    private String upiID;
//    private String cardName;
//    private int cardNumber;
//    private String date;
//    private short cvv;

    public PaymentDTO(String name,String lastName,String email,String country, String zipCode,String upiID){ //cardName, int cardNumber, String date,short cvv)
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.country=country;
        this.zipCode=zipCode;
        this.upiID=upiID;
//        this.cardName=cardName;
//        this.cardNumber=cardNumber;
//        this.date=date;
//        this.cvv=cvv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getUpiID() {
        return upiID;
    }

    public void setUpiID(String upiID) {
        this.upiID = upiID;
    }

//    public String getCardName() {
//        return cardName;
//    }
//
//    public void setCardName(String cardName) {
//        this.cardName = cardName;
//    }
//
//    public int getCardNumber() {
//        return cardNumber;
//    }
//
//    public void setCardNumber(int cardNumber) {
//        this.cardNumber = cardNumber;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public short getCvv() {
//        return cvv;
//    }
//
//    public void setCvv(short cvv) {
//        this.cvv = cvv;
//    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", upiID='" + upiID + '\'' +
//                ", cardName='" + cardName + '\'' +
//                ", cardNumber=" + cardNumber +
//                ", date='" + date + '\'' +
//                ", cvv=" + cvv +
                '}';
    }

    public PaymentDTO(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
