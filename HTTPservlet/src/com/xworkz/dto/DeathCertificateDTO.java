package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DeathCertificateDTO implements Serializable {

    private String name;
    private String cause;
    private LocalDateTime date;
//    private String time;
    private int ageAtDeath;
    private String certifiedBy;
    private String hospitalName;
    private String mannerOfDeath;
    private String gender;
    private String marks;

    public DeathCertificateDTO() {
        System.out.println("running DeathCertificateDTO const");
    }

    public DeathCertificateDTO(String name, String cause, LocalDateTime date, int ageAtDeath, String certifiedBy, String hospitalName, String mannerOfDeath, String gender, String marks) {
        this.name = name;
        this.cause = cause;
        this.date = date;
//        this.time = time;
        this.ageAtDeath = ageAtDeath;
        this.certifiedBy = certifiedBy;
        this.hospitalName = hospitalName;
        this.mannerOfDeath = mannerOfDeath;
        this.gender = gender;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

//    public String getTime() {
//        return time;
//    }

//    public void setTime(String time) {
//        this.time = time;
//    }

    public int getAgeAtDeath() {
        return ageAtDeath;
    }

    public void setAgeAtDeath(int ageAtDeath) {
        this.ageAtDeath = ageAtDeath;
    }

    public String getCertifiedBy() {
        return certifiedBy;
    }

    public void setCertifiedBy(String certifiedBy) {
        this.certifiedBy = certifiedBy;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMannerOfDeath() {
        return mannerOfDeath;
    }

    public void setMannerOfDeath(String mannerOfDeath) {
        this.mannerOfDeath = mannerOfDeath;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

}
