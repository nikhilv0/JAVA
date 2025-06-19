package com.xworkz.service;

import com.xworkz.dto.RegisterDTO;

public interface RegisterService {

    String validateAndSave(RegisterDTO registerDTO);
}
