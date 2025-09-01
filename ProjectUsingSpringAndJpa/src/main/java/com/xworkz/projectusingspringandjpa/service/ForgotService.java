package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;

public interface ForgotService {

    boolean MailExits(ForgotDTO forgotDTO);

    String updateToken(String token,ForgotDTO forgotDTO);
}
