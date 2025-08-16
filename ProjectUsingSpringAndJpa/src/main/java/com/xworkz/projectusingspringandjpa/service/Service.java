package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.dto.SignUpDTO;
import com.xworkz.projectusingspringandjpa.entity.SignInEntity;

public interface Service {

    String save(SignUpDTO signUpDTO);

    String login(SignInDTO signInDTO);
}
