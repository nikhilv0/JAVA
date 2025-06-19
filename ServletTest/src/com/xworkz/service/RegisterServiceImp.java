package com.xworkz.service;

import com.xworkz.dto.RegisterDTO;
import com.xworkz.repository.RegisterRepository;
import com.xworkz.repository.RegisterRepositoryImp;

public class RegisterServiceImp implements RegisterService{
    @Override
    public String validateAndSave(RegisterDTO registerDTO) {

        System.out.println("running Register service");
        if (registerDTO!=null){
            RegisterRepository registerRepository=new RegisterRepositoryImp();
            registerRepository.save(registerDTO);
        }

        return "Sucess";
    }
}
