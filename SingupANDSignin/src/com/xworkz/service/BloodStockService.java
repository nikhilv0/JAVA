package com.xworkz.service;

import com.xworkz.dto.BloodStockDTO;

public interface BloodStockService {

    String validateAndSave(BloodStockDTO bloodStockDTO);//stock blood

    String updateByid(int id);//search id for update stock

    String ValidateNupdate(BloodStockDTO bloodStockDTO,int id);//update stock

    String deleteNupdate(int id);//delete stock
}
