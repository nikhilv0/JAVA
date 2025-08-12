package com.xworkz.webappinspring.components;

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
    public String onClickOnion(Model model){
        System.out.println("Running Onion method");
//        System.out.println(onionDTO.toString());

        model.addAttribute("name","name is working");                        //1st way using model
        System.out.println(model);
        return "onion";

    }
}