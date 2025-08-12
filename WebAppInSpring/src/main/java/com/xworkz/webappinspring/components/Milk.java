package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")
public class Milk {
    public Milk() {
        System.out.println("Milk Constructor");
    }

    @RequestMapping("/onClickMilk")
    public String onClickMilk(Model model){
        System.out.println("Running Milk method");
//        System.out.println(milkDTO.toString());

        model.addAttribute("name","name is working");                        //1st way using model
        System.out.println(model);
        return "milk";
    }
}