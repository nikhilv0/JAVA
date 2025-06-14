package com.xworkz.dto;

import java.io.Serializable;

public class JobDTO implements Serializable {

    private String name;
    private String email;
    private String education;
    private String skills;
    private Double expectedSalary;
    private String experience;

    public JobDTO(){
        System.out.println("running JobDTO const");
    }

    public JobDTO(String name, String email, String experience, Double expectedSalary, String skills, String education) {
        this.name = name;
        this.email = email;
        this.experience = experience;
        this.expectedSalary = expectedSalary;
        this.skills = skills;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(Double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
