package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.CurryDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Curry {
    public Curry() {
        System.out.println("Curry Constructor");
    }

    @RequestMapping("/onClickCurry")
    public String onClickCurry(Model model, CurryDTO curryDTO){
        System.out.println("Running Curry method");
//        System.out.println(curryDTO.toString());

        model.addAttribute("value",curryDTO);
        return "curry";

    }
}