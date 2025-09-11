package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.dto.SignUpDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;

public interface SignInService {

    String login(SignInDTO signInDTO);

    String verifyOtp(String otp,SignInDTO signInDTO);

    boolean isAccountLocked(SignUpEntity user);

}
