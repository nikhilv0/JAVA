package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.dto.SignUpDTO;
import com.xworkz.projectusingspringandjpa.entity.SignInEntity;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.sql.Timestamp;


@org.springframework.stereotype.Service
public class ServiceImp implements Service {
    @Autowired
    Repository repository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public String save(SignUpDTO signUpDTO) {
        System.out.println("Validation for save");

        if (repository.existsByEmail(signUpDTO.getEmail())){
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
        signUpEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));

        return repository.save(signUpEntity);
    }

    @Override
    public String login(SignInDTO signInDTO) {

        SignUpEntity storedUser = repository.getEntityByMail(signInDTO.getEmail());
        if (storedUser == null) {
            return "User not Found";
        }
        if (passwordEncoder.matches(signInDTO.getPassword(), storedUser.getPassword())) {
            SignInEntity signInEntity = new SignInEntity();
            signInEntity.setEmail(signInDTO.getEmail());
            signInEntity.setPassword(storedUser.getPassword());
            signInEntity.setVisitedAt(new Timestamp(System.currentTimeMillis()));
            System.out.println(repository.login(signInEntity));
            return "Login successful!";
        }
        else {
            return "Invalid password!";
        }

    }
}
