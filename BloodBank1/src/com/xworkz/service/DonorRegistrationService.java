package com.xworkz.service;

import com.xworkz.dto.DonorRegistrationDTO;

import java.io.Serializable;

public interface DonorRegistrationService extends Serializable {

    String validateAndSave(DonorRegistrationDTO donorRegistrationDTO);
}
