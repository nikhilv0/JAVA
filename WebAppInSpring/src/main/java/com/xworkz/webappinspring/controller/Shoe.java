package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.ShoeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Shoe {
    public Shoe() {
        System.out.println("Shoe Constructor");
    }

    @RequestMapping("/onClickShoe")
    public String onClickShoe(Model model, ShoeDTO shoeDTO){
        System.out.println("Running Shoe method");
//        System.out.println(shoeDTO.toString());

        model.addAttribute("value",shoeDTO);
        return "shoe";
    }
}