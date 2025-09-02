package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.dto.SignUpDTO;
import com.xworkz.projectusingspringandjpa.entity.SignInEntity;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;


@Service
public class SignUpServiceImp implements SignUpService {
    @Autowired
    SignUpRepository signUpRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public String save(SignUpDTO signUpDTO) {
        System.out.println("Validation for save");

        if (signUpRepository.existsByEmail(signUpDTO.getEmail())){
            return "Email already exists!";
        }

        SignUpEntity signUpEntity=new SignUpEntity();
        signUpEntity.setFullName(signUpDTO.getFullName());
        signUpEntity.setEmail(signUpDTO.getEmail());
        signUpEntity.setPhone(signUpDTO.getPhone());
        signUpEntity.setGender(signUpDTO.getGender());
        signUpEntity.setAge(signUpDTO.getAge());
        signUpEntity.setAddress(signUpDTO.getAddress());
        String encryptedPassword = passwordEncoder.encode(signUpDTO.getPassword());
        signUpEntity.setPassword(encryptedPassword);
//        signUpEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));

        return signUpRepository.save(signUpEntity);
    }

}
