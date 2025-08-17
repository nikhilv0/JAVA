package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.entity.SignInEntity;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.SignInRepository;
import com.xworkz.projectusingspringandjpa.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.Timestamp;


@org.springframework.stereotype.Service
public class SignInServiceImp implements SignInService {
    @Autowired
    SignUpRepository signUpRepository;

    @Autowired
    SignInRepository signInRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public String login(SignInDTO signInDTO) {

        SignUpEntity storedUser = signInRepository.getEntityByMail(signInDTO.getEmail());
        if (storedUser == null) {
            return "User not Found";
        }
        if (passwordEncoder.matches(signInDTO.getPassword(), storedUser.getPassword())) {
            SignInEntity signInEntity = new SignInEntity();
            signInEntity.setEmail(signInDTO.getEmail());
            signInEntity.setPassword(storedUser.getPassword());
            signInEntity.setVisitedAt(new Timestamp(System.currentTimeMillis()));
            System.out.println(signInRepository.login(signInEntity));
            return "Login successful!";
        }
        else {
            return "Invalid password!";
        }

    }
}
