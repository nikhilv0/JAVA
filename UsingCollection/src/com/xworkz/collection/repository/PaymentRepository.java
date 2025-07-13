package com.xworkz.collection.repository;

import com.xworkz.collection.DTO.PaymentDTO;

import java.util.List;

public interface PaymentRepository {

    String save(PaymentDTO paymentDTO);

    List retrive(String mail);
}
