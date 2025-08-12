package com.xworkz.webappinspring.components;

import com.xworkz.webappinspring.dto.SoapDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Soap {
    public Soap() {
        System.out.println("Soap Constructor");
    }

    @RequestMapping("/onClickSoap")
    public String onClickSoap(Model model){
        System.out.println("Running Soap method");
//        System.out.println(soapDTO.toString());

        model.addAttribute("name","name is working");                        //1st way using model
        System.out.println(model);
        return "soap";

    }
}
