package com.xworkz.repository;

import com.xworkz.dto.DonorRegistrationDTO;

public interface DonorRegistrationRepository {

    String save(DonorRegistrationDTO donorRegistrationDTO);

    DonorRegistrationDTO findBy(int id);
}

