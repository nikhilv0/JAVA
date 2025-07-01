package com.xworkz.repository;

import com.xworkz.dto.SignUpDTO;

public interface SignUpRepository {

    String save(SignUpDTO signUpDTO);

    SignUpDTO findById(String userId,String password);
}
