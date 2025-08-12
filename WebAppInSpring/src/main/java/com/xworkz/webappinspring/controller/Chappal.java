package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.ChappalDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Chappal {
    public Chappal() {
        System.out.println("Chappal Constructor");
    }

    @RequestMapping("/onClickChappal")
    public String onClickChappal(Model model, ChappalDTO chappalDTO){
        System.out.println("Running Chappal method");
//        System.out.println(chappalDTO.toString());

        model.addAttribute("value",chappalDTO);
        return "chappal";
    }
}