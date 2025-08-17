package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.dto.SignUpDTO;

public interface SignUpService {

    String save(SignUpDTO signUpDTO);

}
