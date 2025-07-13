package com.xworkz.service;

import com.xworkz.dto.SignUpDTO;

public interface SignUpService {

    String validateAndsave(SignUpDTO dto);//signUp

    default SignUpDTO findBy(String mail,String password){//signIn

        return null;
    }

    String validateForgototp(String otp,String email);

    SignUpDTO findByUser(String email);//forgot

    String generateOtp(String otp,String otpFromSession,String emailSession,String forgotOTP,String forgotMail);//otp


}
