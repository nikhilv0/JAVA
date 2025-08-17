package com.xworkz.projectusingspringandjpa.controller;

import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.service.SignInService;
import com.xworkz.projectusingspringandjpa.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class SignIn {
    @Autowired
    SignInService signInService;

    public SignIn() {
        System.out.println("SignIn Construct");
    }

    @RequestMapping("/signIn")
    public String signIn(Model model, SignInDTO signInDTO, BindingResult bindingResult){
        System.out.println("SignIn Page");

        if (bindingResult.hasErrors()){
           List<ObjectError> bindingResults=bindingResult.getAllErrors();
           for (ObjectError objectError:bindingResults){
               System.err.println(objectError.getDefaultMessage());
           }
        }
        System.out.println(signInDTO.toString());
        String valid= signInService.login(signInDTO);
        if (valid.equals("Login successful!")) {
            model.addAttribute("mess", valid);
            return "SignIn";
        }
        if (valid.equals("User not Found")){
            model.addAttribute("signInDTO", signInDTO);
            model.addAttribute("err", valid);
            return "SignIn";
        }else {
            model.addAttribute("invalids",valid);
            return "SignIn";
        }
    }

}
