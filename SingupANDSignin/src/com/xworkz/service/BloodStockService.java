package com.xworkz.service;

import com.xworkz.dto.BloodStockDTO;

import java.util.List;

public interface BloodStockService {

    String validateAndSave(BloodStockDTO bloodStockDTO);//stock blood

    String updateByid(int id);//search id for update stock

    String ValidateNupdate(BloodStockDTO bloodStockDTO,int id);//update stock

    String deleteNupdate(int id);//delete stock

    List<BloodStockDTO> viewStock(String bloodGroup);//view bloodStock
}
