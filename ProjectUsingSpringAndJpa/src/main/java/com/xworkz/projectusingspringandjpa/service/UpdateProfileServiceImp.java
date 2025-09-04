package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.UpdateProfileDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.SignInRepository;
import com.xworkz.projectusingspringandjpa.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class UpdateProfileServiceImp implements UpdateProfileService{

    @Autowired
    SignUpRepository signUpRepository;

    @Autowired
    SignInRepository signInRepository;

    @Override
    public String updateProfile(UpdateProfileDTO updateProfileDTO) {
        System.out.println("Validating updateProfile");

        SignUpEntity existing = signInRepository.getEntityByMail(updateProfileDTO.getEmail());
        if (existing == null) {
            return "User not Found";
        }
        existing.setFullName(updateProfileDTO.getFullName());
        existing.setEmail(updateProfileDTO.getEmail());
        existing.setPhone(updateProfileDTO.getPhone());
        existing.setGender(updateProfileDTO.getGender());
        existing.setAge(updateProfileDTO.getAge());
        existing.setAddress(updateProfileDTO.getAddress());
        existing.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        String updated=signUpRepository.save(existing);
        if (updated.equals("Successfully Saved")){
        return "updated Successfully";
        }
        return "updateProfileDTO Not Updated";
    }
}
