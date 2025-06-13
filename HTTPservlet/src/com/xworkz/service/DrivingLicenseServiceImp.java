package com.xworkz.service;

import com.xworkz.dto.DeathCertificateDTO;
import com.xworkz.dto.DrivingLicenseDTO;
import com.xworkz.repository.DrivingLicenseRepository;
import com.xworkz.repository.DrivingLicenseRepositoryImp;

public class DrivingLicenseServiceImp implements DrivingLicenseService{

    @Override
    public String validateandsave(DrivingLicenseDTO drivingLicenseDTO) {

        if (drivingLicenseDTO!=null){
            DrivingLicenseRepository drivingLicenseRepository=new DrivingLicenseRepositoryImp();
            drivingLicenseRepository.save();
        }
        return "sucess";
    }
}
