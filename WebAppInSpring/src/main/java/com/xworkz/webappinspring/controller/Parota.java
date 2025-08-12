package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.ParotaDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Parota {
    public Parota() {
        System.out.println("Parota Constructor");
    }

    @RequestMapping("/onClickParota")
    public String onClickParota(Model model, ParotaDTO parotaDTO){
        System.out.println("Running Parota method");
//        System.out.println(parota.toString());

        model.addAttribute("value",parotaDTO);
        return "parota";

    }
}