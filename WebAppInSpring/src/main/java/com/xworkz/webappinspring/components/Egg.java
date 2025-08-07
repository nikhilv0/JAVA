package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Egg {
    public Egg() {
        System.out.println("Egg Constructor");
    }

    @RequestMapping("/onClickEgg")
    public String onClickEgg(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Egg method");
        System.out.println(name+" "+price);
        return "egg.jsp";
    }
}