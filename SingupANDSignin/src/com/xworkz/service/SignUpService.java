package com.xworkz.service;

import com.xworkz.dto.SignUpDTO;

public interface SignUpService {

    String validateAndsave(SignUpDTO dto);

    default SignUpDTO findBy(String userId,String password){

        return null;
    }
    SignUpDTO findByUser(String userId,String email);

    String generateOtp(String otp,String otpFromSession);
}
