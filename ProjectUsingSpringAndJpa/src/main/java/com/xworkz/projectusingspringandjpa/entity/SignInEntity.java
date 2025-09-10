package com.xworkz.projectusingspringandjpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "SignIn_table")

public class SignInEntity {
    public SignInEntity() {
        System.out.println("SignInEntity Constructor");
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "user_email",nullable = false,length = 45)
    private String email;

//    @Column(name = "user_password",nullable = false,length = 70)
//    private String password;

    @Column(name = "user_otp",nullable = false,length = 6)
    private String otp;

    @Column(name = "user_visitedAt" ,nullable = false)
    private Timestamp visitedAt;
}
