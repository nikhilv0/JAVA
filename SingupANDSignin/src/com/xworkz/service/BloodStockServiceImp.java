package com.xworkz.service;

import com.xworkz.dto.BloodStockDTO;
import com.xworkz.repository.BloodStockRepository;
import com.xworkz.repository.BloodStockRepositoryImp;

import java.util.List;

public class BloodStockServiceImp implements BloodStockService {

    BloodStockRepository bloodStockRepository = new BloodStockRepositoryImp();

    @Override
    public String validateAndSave(BloodStockDTO bloodStockDTO) {
        if (bloodStockDTO != null) {
            if (bloodDTOcheck(bloodStockDTO)) {
                System.out.println(bloodStockRepository.stock(bloodStockDTO));
                return "validated";
            } else {
                return "Enter valid Details";
            }
        }
        return "false";
    }


    @Override
    public String updateByid(int id, int units) {
        if ((id > 0) && (units > 0)) {
            System.out.println(bloodStockRepository.updateBYid(id));
            return "valid Id";
        }
        return "Enter Valid Id";
    }

    @Override
    public String ValidateNupdate(BloodStockDTO bloodStockDTO, int id) {
        if (bloodStockDTO != null && id > 0) {
            System.out.println(bloodStockRepository.update(bloodStockDTO, id));
            return "validated";
        } else {
            return "Enter valid Details";
        }
    }

    @Override
    public String deleteNupdate(int id) {
        if (id != 0) {
            System.out.println(bloodStockRepository.delete(id));
            return "valid id";
        } else {
            return "Enter valid id";
        }
    }

    @Override
    public List<BloodStockDTO> viewStock(String bloodGroup) {
        if (bloodGroup.matches("^(A|B|AB|O)[+-]$")) {
            System.out.println("valid bloodGroup");
            return bloodStockRepository.viewStock(bloodGroup);
        } else {
            System.out.println("Enter valid bloodGroup");
            return null;
        }
    }


    private static boolean bloodDTOcheck(BloodStockDTO bloodStockDTO) {
        return bloodStockDTO.getBloodGroup().matches("^(A|B|AB|O)[+-]$") && (bloodStockDTO.getQuantity() != 0);
    }
}
