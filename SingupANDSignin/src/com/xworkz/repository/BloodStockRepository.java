package com.xworkz.repository;

import com.xworkz.dto.BloodStockDTO;

public interface BloodStockRepository {

    String stock(BloodStockDTO bloodStockDTO);//blood stock

    String updateBYid(int id);//check by id

    String update(BloodStockDTO bloodStockDTO,int id);//update stock

    String delete(String bloodGroup);//delete stock

}
