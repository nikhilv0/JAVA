package com.xworkz.repository;

import com.xworkz.dto.SignUpDTO;

public interface SignUpRepository {

    String save(SignUpDTO signUpDTO);

    SignUpDTO findById(String mail,String password);//sign in

    SignUpDTO findByUser(String email); //forget

    String storeOTP(String otp,String emailSession);//store otp

    String forgotStoreOTP(String forgotOTP, String forgotMail);//store forgototp

    String saveCredentials(String newPassword,String forgotmail);//save forgot credentials

    boolean isEmailExists(String email);// emailExits
}
