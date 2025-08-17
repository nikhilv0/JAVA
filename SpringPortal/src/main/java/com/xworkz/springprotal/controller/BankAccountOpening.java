package com.xworkz.springprotal.controller;

import com.xworkz.springprotal.dto.BankAccountOpeningDTO;
import com.xworkz.springprotal.service.BankAccountOpeningService;
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
public class BankAccountOpening {

    @Autowired
    BankAccountOpeningService bankAccountOpeningService;

    public BankAccountOpening() {
        System.out.println("BankAccountOpening Controller");
    }

    @RequestMapping("/accountOpen")
    public String accountOpen(@Valid Model model, BankAccountOpeningDTO bankAccountOpeningDTO, BindingResult bindingResult) {
        System.out.println("SignUp page");

        if (bindingResult.hasErrors()) {
            List<ObjectError> objectErrors = bindingResult.getAllErrors();
            for (ObjectError objectError : objectErrors) {
                System.err.println(objectError.getDefaultMessage());
            }
        }
        System.out.println(bankAccountOpeningDTO.toString());

        String valid = bankAccountOpeningService.save(bankAccountOpeningDTO);
        if (valid.equals("Successfully Saved")) {
            model.addAttribute("message", "Form Successfully submitted");
        } else {
            model.addAttribute("signUpDTO", bankAccountOpeningDTO);
            model.addAttribute("error", "Form Not submitted");
        }
        return "BankAccountOpening";
    }

}
