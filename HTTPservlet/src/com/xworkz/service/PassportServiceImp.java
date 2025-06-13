package com.xworkz.service;

import com.xworkz.dto.PassportDTO;
import com.xworkz.repository.PassportRepository;
import com.xworkz.repository.PassportRepositoryImp;

public class PassportServiceImp implements PassportService{
    @Override
    public String validateandsave(PassportDTO passportDTO) {

        if (passportDTO!=null){
            PassportRepository passportRepository=new PassportRepositoryImp();
            passportRepository.save();
        }
        return "sucess";
    }
}
