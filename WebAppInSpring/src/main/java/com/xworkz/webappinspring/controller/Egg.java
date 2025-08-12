package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.EggDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Egg {
    public Egg() {
        System.out.println("Egg Constructor");
    }

    @RequestMapping("/onClickEgg")
    public String onClickEgg(Model model, EggDTO eggDTO){
        System.out.println("Running Egg method");
//        System.out.println(eggDTO.toString());

        model.addAttribute("value",eggDTO);
        return "egg";
    }
}