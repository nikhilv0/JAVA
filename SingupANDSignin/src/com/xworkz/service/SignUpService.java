package com.xworkz.service;

import com.xworkz.dto.SignUpDTO;

public interface SignUpService {

    String validateAndsave(SignUpDTO dto);//signUp

    default SignUpDTO findBy(String mail,String password){//signIn

        return null;
    }

    String validateForgototp(String forgototp,String otp,String email);//forgot

    SignUpDTO findByUser(String email);//forgot

    String generateOtp(String otp,String otpFromSession,String emailSession);//otp


}
