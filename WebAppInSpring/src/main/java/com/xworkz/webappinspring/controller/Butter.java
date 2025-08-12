package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.ButterDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Butter {
    public Butter() {
        System.out.println("Butter Constructor");
    }

    @RequestMapping("/onClickButter")
    public String onClickButter(Model model, ButterDTO butterDTO){
        System.out.println("Running Butter method");
//        System.out.println(butterDTO.toString());

        model.addAttribute("value",butterDTO);
        return "butter";
    }
}
