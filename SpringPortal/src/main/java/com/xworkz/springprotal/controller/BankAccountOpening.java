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
    public String accountOpen(@Valid BankAccountOpeningDTO bankAccountOpeningDTO,
                              BindingResult bindingResult,
                              Model model) {
        System.out.println("BankAccountOpening page");
        System.out.println("DTO: " + bankAccountOpeningDTO);

        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("bankAccountOpeningDTO", bankAccountOpeningDTO);
            return "BankAccountOpening";
        }


        String valid = bankAccountOpeningService.save(bankAccountOpeningDTO);

        if (valid.equals("Successfully Saved")) {
            model.addAttribute("message", "Form Successfully submitted");
        } else {
            model.addAttribute("bankAccountOpeningDTO", bankAccountOpeningDTO);
            model.addAttribute("error", "Form Not submitted");
        }
        return "BankAccountOpening";
    }
}
