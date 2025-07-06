package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DonorRegistrationDTO implements Serializable {

    String name;
    int age;
    String gender;
    String bloodGroup;
    Long contact;
    String address;
    LocalDate lastDonationDate;

    public DonorRegistrationDTO(String name, int age, String gender, String bloodGroup, Long contact, String address, LocalDate lastDonationDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.contact = contact;
        this.address = address;
        this.lastDonationDate = lastDonationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLastDonationDate() {
        return lastDonationDate;
    }

    public void setLastDonationDate(LocalDate lastDonationDate) {
        this.lastDonationDate = lastDonationDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "DonorRegistrationDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", contact=" + contact +
                ", address='" + address + '\'' +
                ", lastDonationDate=" + lastDonationDate +
                '}';
    }
}

