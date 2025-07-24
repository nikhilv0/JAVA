package com.xworkz.service;

import com.xworkz.dto.BloodStockDTO;
import com.xworkz.repository.BloodStockRepository;
import com.xworkz.repository.BloodStockRepositoryImp;

public class BloodStockServiceImp implements BloodStockService {
    @Override
    public String validateAndSave(BloodStockDTO bloodStockDTO) {
        if (bloodStockDTO.getBloodGroup().matches("[A-Z],-,+") && (!bloodStockDTO.getQuantity().isEmpty())) {
            BloodStockRepository bloodStockRepository = new BloodStockRepositoryImp();
            System.out.println(bloodStockRepository.stock(bloodStockDTO));
            return "validated";
        } else {
            return "Enter valid Details";
        }
    }

    @Override
    public String updateByid(int id) {
        if (id>0){
            BloodStockRepository bloodStockRepository=new BloodStockRepositoryImp();
            System.out.println(bloodStockRepository.updateBYid(id));
            return "valid Id";
        }
        return "Enter Valid Id";
    }
}
