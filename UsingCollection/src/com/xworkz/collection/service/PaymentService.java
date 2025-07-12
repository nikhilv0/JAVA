package com.xworkz.collection.service;

import com.xworkz.collection.DTO.PaymentDTO;

public interface PaymentService {

    String validateAndSave(PaymentDTO paymentDTO);
}
