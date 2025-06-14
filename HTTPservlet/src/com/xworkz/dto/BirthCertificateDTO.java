package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BirthCertificateDTO implements Serializable {

    private String birthId;
    private String hospitalName;
    private String fatherName;
    private String motherName;
    private LocalDateTime dateTime;
    private String doctorName;
    private String nurseName;
    private String hospitalType;

    public BirthCertificateDTO() {
        System.out.println("running BirthCertificateDTO const");
    }

    public BirthCertificateDTO(String birthId, String hospitalName, String fatherName, String motherName, LocalDateTime dateTime, String doctorName, String nurseName, String hospitalType) {
        this.birthId = birthId;
        this.hospitalName = hospitalName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.dateTime = dateTime;
        this.doctorName = doctorName;
        this.nurseName = nurseName;
        this.hospitalType = hospitalType;
    }

    public String getBirthId() {
        return birthId;
    }

    public void setBirthId(String birthId) {
        this.birthId = birthId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }

}
