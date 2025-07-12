package com.xworkz.repository;

import com.xworkz.dto.SignUpDTO;

public interface SignUpRepository {

    String save(SignUpDTO signUpDTO);

    SignUpDTO findById(String mail,String password);//sign in

    SignUpDTO findByUser(String userId,String email); //forget
}
