package com.xworkz.webappinspring.components;

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
    public String onClickCurry(Model model){
        System.out.println("Running Curry method");
//        System.out.println(curryDTO.toString());

        model.addAttribute("name","name is working");                        //1st way using model
        System.out.println(model);
        return "curry";

    }
}