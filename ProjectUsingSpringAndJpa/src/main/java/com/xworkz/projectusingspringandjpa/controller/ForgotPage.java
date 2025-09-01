package com.xworkz.projectusingspringandjpa.controller;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.service.ForgotService;
import com.xworkz.projectusingspringandjpa.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/")
public class ForgotPage {
    @Autowired
    ForgotService forgotService;

    public ForgotPage() {
        System.out.println("ForgotPage Constructor");
    }
    @RequestMapping("/forgotPassword")
    public String forgotPassword(HttpServletRequest request,Model model, ForgotDTO forgotDTO, BindingResult bindingResult){
        System.out.println("Forgot Page");

        if(bindingResult.hasErrors()){
           List<ObjectError>bindingResults= bindingResult.getAllErrors();
           for (ObjectError objectError:bindingResults){
               System.err.println(objectError.getDefaultMessage());
           }
        }
        System.out.println(forgotDTO.toString());
        boolean exists= forgotService.MailExits(forgotDTO);
        if (!exists){
            model.addAttribute("error", "Email not found!");
            return "Forgot";
        }

        String token= UUID.randomUUID().toString();
        String save=forgotService.updateToken(token,forgotDTO);
        System.out.println(save);


        return "forget";
    }
}
