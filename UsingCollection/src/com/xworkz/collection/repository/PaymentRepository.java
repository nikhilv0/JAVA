package com.xworkz.collection.repository;

import com.xworkz.collection.DTO.PaymentDTO;

public interface PaymentRepository {

    String save(PaymentDTO paymentDTO);
}
