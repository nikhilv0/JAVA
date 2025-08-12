package com.xworkz.webappinspring.components;

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
    public String onClickButter(Model model){
        System.out.println("Running Butter method");
//        System.out.println(butterDTO.toString());

        model.addAttribute("name","name is working");                        //1st way using model
//        System.out.println(model);
        return "butter";
    }
}
