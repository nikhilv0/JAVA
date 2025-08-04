package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Egg {
    public Egg() {
        System.out.println("Egg Constructor");
    }

    @RequestMapping("/onClickEgg")
    public String onClickEgg(){
        System.out.println("Running Egg method");
        return "egg.jsp";
    }
}