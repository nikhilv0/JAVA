package com.xworkz.dto;

import java.io.Serializable;

public class DrivingLicenseDTO implements Serializable {

    private String name;
    private String address;
    private String mobile;
    private String appliedDate;
    private String vehicleType;

    public DrivingLicenseDTO() {
        System.out.println("running DrivingLicenseDTO const");
    }

    public DrivingLicenseDTO(String name, String address, String mobile, String appliedDate, String vehicleType) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.appliedDate = appliedDate;
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Getters and setters...
}
