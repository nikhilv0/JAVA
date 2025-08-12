package com.xworkz.webappinspring.components;

import com.xworkz.webappinspring.dto.ShoeDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Shoe {
    public Shoe() {
        System.out.println("Shoe Constructor");
    }

    @RequestMapping("/onClickShoe")
    public String onClickShoe(Model model){
        System.out.println("Running Shoe method");
//        System.out.println(shoeDTO.toString());

        model.addAttribute("name","name is working");                        //1st way using model
        System.out.println(model);
        return "shoe";
    }
}