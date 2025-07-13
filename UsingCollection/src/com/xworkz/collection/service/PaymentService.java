package com.xworkz.collection.service;

import com.xworkz.collection.DTO.PaymentDTO;

import java.util.List;

public interface PaymentService {

    String validateAndSave(PaymentDTO paymentDTO);

    List retrived(String mail);
}
