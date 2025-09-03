package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;

public interface ForgotRepository {

    boolean mailExits(String email);

}
