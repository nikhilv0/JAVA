package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.BottleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class Bottle {
    public Bottle() {
        System.out.println("Bottle Constructor");
    }

    @RequestMapping("/onClickBottle")
    public String onClickBottle(Model model, BottleDTO bottleDTO){
        System.out.println("Running Bottle method");

        model.addAttribute("value",bottleDTO);
        return "bottle";

    }
}