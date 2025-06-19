package com.xworkz.dto;

import java.io.Serializable;

public class RegisterDTO implements Serializable {

    private String name;
    private String email;
    private String password;
    private String conPassword;
    private Long contact;

    public RegisterDTO(String name, String email, String password, String conPassword, Long contact) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.conPassword = conPassword;
        this.contact = contact;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConPassword() {
        return conPassword;
    }

    public void setConPassword(String conPassword) {
        this.conPassword = conPassword;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "RegisterDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", conPassword='" + conPassword + '\'' +
                ", contact=" + contact +
                '}';
    }
}
