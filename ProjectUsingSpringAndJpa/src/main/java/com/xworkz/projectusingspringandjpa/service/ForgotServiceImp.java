package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.ForgotRepository;
import com.xworkz.projectusingspringandjpa.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class ForgotServiceImp implements ForgotService{
    @Autowired
    ForgotRepository forgotRepository;

    @Autowired
    SignUpRepository signUpRepository;

    @Override
    public boolean MailExits(ForgotDTO forgotDTO) {
        System.out.println("Validating user exits!");

        return forgotRepository.MailExits(forgotDTO);
    }

    @Override
    public String updateToken(String token, ForgotDTO forgotDTO) {
        SignUpEntity signUpEntity = signUpRepository.findByEmail(forgotDTO.getEmail());
        if (signUpEntity == null) {
            return "User not found to store token";
        }
        signUpEntity.setResetToken(token);
        signUpEntity.setTokenExpiry(LocalDateTime.now().plusMinutes(15));
        signUpEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        String save=signUpRepository.save(signUpEntity);
        if (save.equals("Successfully Saved")){
        return "token saved successfully";
        }
        else return "Token not Saved ";
    }
}
