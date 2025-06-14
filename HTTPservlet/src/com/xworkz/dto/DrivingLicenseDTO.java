package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DrivingLicenseDTO implements Serializable {

    private String name;
    private String address;
    private Long mobile;
    private LocalDateTime appliedDate;
    private String vehicleType;

    public DrivingLicenseDTO() {
        System.out.println("running DrivingLicenseDTO const");
    }

    public DrivingLicenseDTO(String name, String address, Long mobile, LocalDateTime appliedDate, String vehicleType) {
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

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public LocalDateTime getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDateTime appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }


}
