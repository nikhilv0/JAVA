package com.xworkz.service;

import com.xworkz.dto.BloodStockDTO;

public interface BloodStockService {

    String validateAndSave(BloodStockDTO bloodStockDTO);

    String updateByid(int id);
}
