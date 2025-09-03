package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.UpdateProfileDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class UpdateProfileServiceImp implements UpdateProfileService{

    @Autowired
    SignUpRepository signUpRepository;

    @Override
    public String updateProfile(UpdateProfileDTO updateProfileDTO) {
        System.out.println("Validating updateProfile");

        SignUpEntity signUpEntity=new SignUpEntity();
        signUpEntity.setFullName(updateProfileDTO.getFullName());
        signUpEntity.setEmail(updateProfileDTO.getEmail());
        signUpEntity.setPhone(updateProfileDTO.getPhone());
        signUpEntity.setGender(updateProfileDTO.getGender());
        signUpEntity.setAge(updateProfileDTO.getAge());
        signUpEntity.setAddress(updateProfileDTO.getAddress());
        signUpEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        String updated=signUpRepository.save(signUpEntity);
        if (updated.equals("Successfully Saved")){
        return "updated Successfully";
        }
        return "updateProfileDTO Not Updated";
    }
}
