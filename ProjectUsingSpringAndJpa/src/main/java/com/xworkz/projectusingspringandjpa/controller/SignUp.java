package com.xworkz.projectusingspringandjpa.controller;

import com.xworkz.projectusingspringandjpa.dto.SignUpDTO;
import com.xworkz.projectusingspringandjpa.service.Service;
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
    Service service;

    public SignUp() {
        System.out.println("SignUp Constructor");
    }

    @RequestMapping("/signUp")
    public String signUp(@Valid Model model, SignUpDTO signUpDTO, BindingResult bindingResult){
        System.out.println("SignUp page");

        if (bindingResult.hasErrors()){
            List<ObjectError> objectErrors=bindingResult.getAllErrors();
            for (ObjectError objectError:objectErrors){
                System.err.println(objectError.getDefaultMessage());
            }
        }
        System.out.println(signUpDTO.toString());

        String valid= service.save(signUpDTO);
        if (valid.equals("Successfully Saved")){
            model.addAttribute("message","Form Successfully submitted");
        }
        if (valid.equals("Email already exists!")){
            model.addAttribute("signUpDTO",signUpDTO);
            model.addAttribute("error", valid);
        }
        else {
            model.addAttribute("signUpDTO",signUpDTO);
            model.addAttribute("error", "Form Not submitted");
        }
        return "SignUp";
    }
}
