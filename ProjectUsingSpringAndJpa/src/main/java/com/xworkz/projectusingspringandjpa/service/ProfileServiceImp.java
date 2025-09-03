package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.ProfileRepository;
import com.xworkz.projectusingspringandjpa.repository.ForgotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImp implements ProfileService {

    @Autowired
    ForgotRepository forgotRepository;

    @Autowired
    ProfileRepository profileRepository;

    @Override
    public boolean exitsByMail(String email) {
        System.out.println("Validation for exitsByMail");
        return forgotRepository.mailExits(email);
    }

    @Override
    public List<SignUpEntity> getEntityByMail(String email) {
        System.out.println("Validation for entity");
        return profileRepository.getEntityByMail(email);
    }
}
