package com.xworkz.service;

import com.xworkz.dto.DeathCertificateDTO;
import com.xworkz.repository.BirthCertifacateRepositoryImp;
import com.xworkz.repository.BirthCertificateRepository;
import com.xworkz.repository.DeathCertificateRepository;
import com.xworkz.repository.DeathCertificateRepositoryImp;

public class DealthCertificateServiceImp implements DeathCertificateService{
    @Override
    public String validateandsave(DeathCertificateDTO deathCertificateDTO) {

        if (deathCertificateDTO!=null){
            DeathCertificateRepository deathCertificateRepository=new DeathCertificateRepositoryImp();
            deathCertificateRepository.save();
        }

        return "sucess";
    }
}
