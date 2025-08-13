package com.xworkz.springandjpa.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
@Component
@Data
@Entity
@Table(name = "SignUp")
public class SignUpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "signUp_name")
    private String name;
    @Column(name = "SignUp_email")
    private String email;
    @Column(name = "SignUp_password")
    private String password;
    @Column(name = "SignUp_confirmPassword")
    private String confirmPassword;
    @Column(name = "SignUp_phoneNumber")
    private Long phoneNumber;
}
