package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.SoapDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Soap {
    public Soap() {
        System.out.println("Soap Constructor");
    }

    @RequestMapping("/onClickSoap")
    public String onClickSoap(Model model, SoapDTO soapDTO){
        System.out.println("Running Soap method");
//        System.out.println(soapDTO.toString());

        model.addAttribute("name",soapDTO);
        return "soap";

    }
}
