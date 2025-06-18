package com.xworkz.service;

import com.xworkz.dto.DonorRegistrationDTO;
import com.xworkz.repository.DonorRegistrationRepository;
import com.xworkz.repository.DonorRegistrationRepositoryImp;

import java.io.Serializable;

public class DonorRegistrationServiceImp implements DonorRegistrationService {

    @Override
    public String validateAndSave(DonorRegistrationDTO donorRegistrationDTO) {

        if (donorRegistrationDTO!=null){
            DonorRegistrationRepository donorRegistrationRepository=new DonorRegistrationRepositoryImp();
            donorRegistrationRepository.save(donorRegistrationDTO);
        }
        return "sucess";
    }
}
