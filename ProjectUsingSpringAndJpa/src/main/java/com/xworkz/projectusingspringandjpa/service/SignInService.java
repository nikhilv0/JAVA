package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.dto.SignUpDTO;

public interface SignInService {

    String login(SignInDTO signInDTO);

    String verifyOtp(String otp,SignInDTO signInDTO);

}
