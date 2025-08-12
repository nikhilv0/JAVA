package com.xworkz.webappinspring.components;

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
    public String onClickBottle(Model model){
        System.out.println("Running Bottle method");
//        System.out.println(bottleDTO.toString());

        model.addAttribute("name","name is working");                        //1st way using model
        System.out.println(model);
        return "bottle";

    }
}