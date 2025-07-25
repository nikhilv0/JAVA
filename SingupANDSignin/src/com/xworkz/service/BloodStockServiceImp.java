package com.xworkz.service;

import com.xworkz.dto.BloodStockDTO;
import com.xworkz.repository.BloodStockRepository;
import com.xworkz.repository.BloodStockRepositoryImp;

public class BloodStockServiceImp implements BloodStockService {
    @Override
    public String validateAndSave(BloodStockDTO bloodStockDTO) {
        if (bloodStockDTO != null) {
            if (bloodDTOcheck(bloodStockDTO)) {
                BloodStockRepository bloodStockRepository = new BloodStockRepositoryImp();
                System.out.println(bloodStockRepository.stock(bloodStockDTO));
                return "validated";
            } else {
                return "Enter valid Details";
            }
        }
        return "false";
    }


    @Override
    public String updateByid(int id) {
        if (id > 0) {
            BloodStockRepository bloodStockRepository = new BloodStockRepositoryImp();
            System.out.println(bloodStockRepository.updateBYid(id));
            return "valid Id";
        }
        return "Enter Valid Id";
    }

    @Override
    public String ValidateNupdate(BloodStockDTO bloodStockDTO, int id) {
        if (bloodStockDTO != null) {
            if (bloodDTOcheck(bloodStockDTO)) {
                BloodStockRepository bloodStockRepository = new BloodStockRepositoryImp();
                System.out.println(bloodStockRepository.update(bloodStockDTO, id));
                return "validated";
            } else {
                return "Enter valid Details";
            }
        }
        return "false";
    }

    @Override
    public String deleteNupdate(String bloodGroup) {
        if (bloodGroup.matches("^(A|B|AB|O)[+-]$")){
            BloodStockRepository bloodStockRepository = new BloodStockRepositoryImp();
            System.out.println(bloodStockRepository.delete(bloodGroup));
            return "valid bloodGroup";
        }else {
        return "Enter valid bloodGroup";
        }
    }


    private static boolean bloodDTOcheck(BloodStockDTO bloodStockDTO) {
        return bloodStockDTO.getBloodGroup().matches("^(A|B|AB|O)[+-]$") && (bloodStockDTO.getQuantity() != 0);
    }
}
