package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.OnionDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Onion {
    public Onion() {
        System.out.println("Onion Constructor");
    }

    @RequestMapping("/onClickOnion")
    public String onClickOnion(Model model, OnionDTO onionDTO){
        System.out.println("Running Onion method");
//        System.out.println(onionDTO.toString());

        model.addAttribute("value",onionDTO);
        return "onion";

    }
}