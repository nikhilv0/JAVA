package com.xworkz.repository;

import com.xworkz.dto.BloodStockDTO;

public interface BloodStockRepository {

    String stock(BloodStockDTO bloodStockDTO);//blood stock

    String updateBYid(int id);//check by id
}
