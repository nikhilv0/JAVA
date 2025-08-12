package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.MilkDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class Milk {
    public Milk() {
        System.out.println("Milk Constructor");
    }

    @RequestMapping("/onClickMilk")
    public String onClickMilk(Model model, MilkDTO milkDTO){
        System.out.println("Running Milk method");
//        System.out.println(milkDTO.toString());

        model.addAttribute("value",milkDTO);
        return "milk";
    }
}