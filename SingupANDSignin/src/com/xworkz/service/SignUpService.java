package com.xworkz.service;

import com.xworkz.dto.SignUpDTO;

public interface SignUpService {

    String validateAndsave(SignUpDTO dto);

    default SignUpDTO findBy(String userId,String password){

        return null;
    }
}
