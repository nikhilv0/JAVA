package com.xworkz.dto;

import java.io.Serializable;

public class SignUpDTO implements Serializable {

    private String email;
    private String userId;
    private String password;
    private String confirmPassword;

    public SignUpDTO(String email, String userId, String password, String confirmPassword) {
        this.email = email;
        this.userId = userId;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public SignUpDTO(String userId, String email, String password) {
        this.userId=userId;
        this.email=email;
        this.password=password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "SignUpDTO{" +
                "name='" + email + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }


}
