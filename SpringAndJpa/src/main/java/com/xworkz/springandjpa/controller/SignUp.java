package com.xworkz.springandjpa.controller;

import com.xworkz.springandjpa.dto.SignUpDTO;
import com.xworkz.springandjpa.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SignUp {
    @Autowired
    SignUpService signUpService;

    public SignUp() {
        System.out.println("SignUp Constructor");
    }
    @RequestMapping("/signUp")
    public String onClick(Model model,SignUpDTO sign ){
        System.out.println("onClick Method");
        model.addAttribute("value",sign);
        System.out.println(sign.toString());

        System.out.println(signUpService.save(sign));
        return "SignUp";
    }

}
