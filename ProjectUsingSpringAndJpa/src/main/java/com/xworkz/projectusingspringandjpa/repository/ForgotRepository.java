package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;

public interface ForgotRepository {

    boolean MailExits(ForgotDTO forgotDTO);

}
