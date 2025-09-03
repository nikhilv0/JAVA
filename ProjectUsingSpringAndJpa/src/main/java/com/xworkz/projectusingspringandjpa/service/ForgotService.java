package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;

public interface ForgotService {

    boolean mailExits(ForgotDTO forgotDTO);

    String updateToken(String token,ForgotDTO forgotDTO);

    boolean isValidToken(String token);

    String resetPassword(String token, String password);
}
