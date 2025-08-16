package com.xworkz.projectusingspringandjpa.controller;

import com.xworkz.projectusingspringandjpa.dto.SignUpDTO;
import com.xworkz.projectusingspringandjpa.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class SignUp {
    @Autowired
    SignUpService signUpService;

    public SignUp() {
        System.out.println("SignUp Constructor");
    }

    @RequestMapping("/signUp")
    public String onSignUp(@Valid Model model, SignUpDTO signUpDTO, BindingResult bindingResult){
        System.out.println("onSignUp page");

        if (bindingResult.hasErrors()){
            List<ObjectError> objectErrors=bindingResult.getAllErrors();
            for (ObjectError objectError:objectErrors){
                System.err.println(objectError.getDefaultMessage());
            }
        }
        System.out.println(signUpDTO.toString());

        String valid=signUpService.save(signUpDTO);
        if (valid.equals("Successfully Saved")){
            model.addAttribute("signUpDTO",signUpDTO);
            model.addAttribute("message","Form Successfully submitted");
            return "SignUp";
        }else {
            model.addAttribute("error", bindingResult);
            return "SignUp";
        }
    }
}
