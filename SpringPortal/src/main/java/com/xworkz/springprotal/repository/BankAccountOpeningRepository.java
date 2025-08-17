package com.xworkz.springprotal.repository;

import com.xworkz.springprotal.dto.BankAccountOpeningDTO;
import com.xworkz.springprotal.entity.BankAccountOpeningEntity;

public interface BankAccountOpeningRepository {

    String save(BankAccountOpeningEntity bankAccountOpeningEntity);

}
