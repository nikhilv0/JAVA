package com.xworkz.springprotal.service;

import com.xworkz.springprotal.dto.BankAccountOpeningDTO;
import com.xworkz.springprotal.entity.BankAccountOpeningEntity;
import com.xworkz.springprotal.repository.BankAccountOpeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class BankAccountOpeningServiceImp implements BankAccountOpeningService{

    @Autowired
    BankAccountOpeningRepository bankAccountOpeningRepository;

    @Override
    public String save(BankAccountOpeningDTO bankAccountOpeningDTO) {
        System.out.println("Validation for save");

        BankAccountOpeningEntity bankAccountOpeningEntity=new BankAccountOpeningEntity();
        bankAccountOpeningEntity.setHolderName(bankAccountOpeningDTO.getHolderName());
        bankAccountOpeningEntity.setDob(bankAccountOpeningDTO.getDob());
        bankAccountOpeningEntity.setEmail(bankAccountOpeningDTO.getEmail());
        bankAccountOpeningEntity.setPhone(bankAccountOpeningDTO.getPhone());
        bankAccountOpeningEntity.setAccountType(bankAccountOpeningDTO.getAccountType());
        bankAccountOpeningEntity.setAadhaar(bankAccountOpeningDTO.getAadhaar());
        bankAccountOpeningEntity.setPan(bankAccountOpeningDTO.getPan());
        bankAccountOpeningEntity.setOpenedAt(new Timestamp(System.currentTimeMillis()));

        return bankAccountOpeningRepository.save(bankAccountOpeningEntity);
    }
}
