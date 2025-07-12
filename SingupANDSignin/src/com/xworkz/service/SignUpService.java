package com.xworkz.service;

import com.xworkz.dto.SignUpDTO;

public interface SignUpService {

    String validateAndsave(SignUpDTO dto);//signUp

    default SignUpDTO findBy(String mail,String password){//signIn

        return null;
    }
    SignUpDTO findByUser(String userId,String email);//forgot

    String generateOtp(String otp,String otpFromSession);//otp
}
