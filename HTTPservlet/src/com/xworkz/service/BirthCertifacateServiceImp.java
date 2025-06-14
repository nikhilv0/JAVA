package com.xworkz.service;

import com.xworkz.dto.BirthCertificateDTO;
import com.xworkz.repository.BirthCertifacateRepositoryImp;
import com.xworkz.repository.BirthCertificateRepository;

public class BirthCertifacateServiceImp implements BirthCertificateservice{
    @Override
    public String validateandsave(BirthCertificateDTO birthCertificateDTO) {

        if (birthCertificateDTO!=null){
            BirthCertificateRepository birthCertificateRepository=new BirthCertifacateRepositoryImp();
            birthCertificateRepository.save(birthCertificateDTO);
        }
        return "sucess";


    }

}
