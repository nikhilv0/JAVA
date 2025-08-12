package com.xworkz.webappinspring.components;

import com.xworkz.webappinspring.dto.EggDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Egg {
    public Egg() {
        System.out.println("Egg Constructor");
    }

    @RequestMapping("/onClickEgg")
    public String onClickEgg(Model model){
        System.out.println("Running Egg method");
//        System.out.println(eggDTO.toString());

        model.addAttribute("name","name is working");                        //1st way using model
        System.out.println(model);
        return "egg.jsp";
    }
}