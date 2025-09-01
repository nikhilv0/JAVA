package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.ForgotRepository;
import com.xworkz.projectusingspringandjpa.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ForgotServiceImp implements ForgotService{
    @Autowired
    ForgotRepository forgotRepository;

    SignUpRepository signUpRepository;

    @Override
    public boolean MailExits(ForgotDTO forgotDTO) {
        System.out.println("Validating user exits!");

        return forgotRepository.MailExits(forgotDTO);
    }

    @Override
    public String updateToken(String token, ForgotDTO forgotDTO) {
        if (!forgotRepository.MailExits(forgotDTO)){
            return "User not found to store token";
        }
        SignUpEntity signUpEntity=new SignUpEntity();
        signUpEntity.setResetToken(token);
        signUpEntity.setTokenExpiry(LocalDateTime.now().plusMinutes(15));
        signUpRepository.save(signUpEntity);
        return "token saved successfully";
    }
}
