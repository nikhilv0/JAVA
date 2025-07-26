package com.xworkz.repository;

import com.xworkz.dto.BloodStockDTO;

import java.util.List;

public interface BloodStockRepository {

    String stock(BloodStockDTO bloodStockDTO);//blood stock

    String updateBYid(int id);//check by id

    String update(BloodStockDTO bloodStockDTO,int id);//update stock

    String delete(int id);//delete stock

    List<BloodStockDTO> viewStock(String bloodGroup);//view bloodStock

}
