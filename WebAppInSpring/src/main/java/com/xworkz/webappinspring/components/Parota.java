package com.xworkz.webappinspring.components;

import com.xworkz.webappinspring.dto.ParotaDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Parota {
    public Parota() {
        System.out.println("Parota Constructor");
    }

    @RequestMapping("/onClickParota")
    public String onClickParota(Model model){
        System.out.println("Running Parota method");
//        System.out.println(parota.toString());

        model.addAttribute("name","name is working");                        //1st way using model
        System.out.println(model);
        return "parota";

    }
}