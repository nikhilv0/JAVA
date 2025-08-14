package com.xworkz.springandjpa.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Data
public class SignUpDTO implements Serializable {

    private String name;
    private String email;
    private String password;
    private String confirmPassword;
    private Long phoneNumber;
}
