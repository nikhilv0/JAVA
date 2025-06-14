package com.xworkz.service;

import com.xworkz.dto.MarriageCertificateDTO;
import com.xworkz.repository.MarriageCertificateRepository;
import com.xworkz.repository.MarriageCertificateRepositoryImp;

public class MarriageCertificateServiceImp implements MarriageCertificateService{
    @Override
    public String validateandsave(MarriageCertificateDTO marriageCertificateDTO) {

        if (marriageCertificateDTO!=null){
            MarriageCertificateRepository marriageCertificateRepository=new MarriageCertificateRepositoryImp();
            marriageCertificateRepository.save(marriageCertificateDTO);
        }

        return "sucess";
    }
}
