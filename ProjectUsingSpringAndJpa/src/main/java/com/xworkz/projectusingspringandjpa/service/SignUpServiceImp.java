package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.SignUpDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImp implements SignUpService {
    @Autowired
    SignUpRepository signUpRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public String save(SignUpDTO signUpDTO) {
        System.out.println("Validation for save");

        SignUpEntity signUpEntity=new SignUpEntity();
        signUpEntity.setFullName(signUpDTO.getFullName());
        signUpEntity.setEmail(signUpDTO.getEmail());
        signUpEntity.setPhone(signUpDTO.getPhone());
        signUpEntity.setGender(signUpDTO.getGender());
        signUpEntity.setAge(signUpDTO.getAge());
        signUpEntity.setAddress(signUpDTO.getAddress());
        String encryptedPassword = passwordEncoder.encode(signUpDTO.getPassword());
        signUpEntity.setPassword(encryptedPassword);

        return signUpRepository.save(signUpEntity);
    }
}
