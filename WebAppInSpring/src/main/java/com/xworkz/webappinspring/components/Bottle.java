package com.xworkz.webappinspring.components;

import com.xworkz.webappinspring.dto.BottleDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
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