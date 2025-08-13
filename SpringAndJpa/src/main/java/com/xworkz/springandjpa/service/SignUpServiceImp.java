package com.xworkz.springandjpa.service;

import com.xworkz.springandjpa.dto.SignUpDTO;
import com.xworkz.springandjpa.entity.SignUpEntity;
import com.xworkz.springandjpa.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImp implements SignUpService{
    @Autowired
    SignUpRepository signUpRepository;
    @Autowired
    SignUpEntity signUpEntity;
    
    @Override
    public String save(SignUpDTO sign) {

        signUpEntity.setName(sign.getName());
        signUpEntity.setEmail(sign.getEmail());
        signUpEntity.setPassword(sign.getPassword());
        signUpEntity.setConfirmPassword(sign.getConfirmPassword());

        return signUpRepository.save(signUpEntity);
    }
}
