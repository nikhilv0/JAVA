package com.xworkz.collection.service;

import com.xworkz.collection.DTO.PaymentDTO;
import com.xworkz.collection.repository.PaymentRepository;
import com.xworkz.collection.repository.PaymentRepositoryImp;

import java.util.Collections;
import java.util.List;

public class PaymentServiceImp implements PaymentService{
    @Override
    public String validateAndSave(PaymentDTO paymentDTO) {
        PaymentRepository paymentRepository=new PaymentRepositoryImp();
        String save=paymentRepository.save(paymentDTO);
        System.out.println(save);
        return "Successfully validated";
    }

    @Override
    public List retrived(String mail) {
        PaymentRepository paymentRepository=new PaymentRepositoryImp();
        return  paymentRepository.retrive(mail);
    }


}
