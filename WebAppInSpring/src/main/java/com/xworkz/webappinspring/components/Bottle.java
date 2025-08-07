package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Bottle {
    public Bottle() {
        System.out.println("Bottle Constructor");
    }

    @RequestMapping("/onClickBottle")
    public String onClickBottle(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Bottle method");
        System.out.println(name+" "+price);
        return "bottle.jsp";
    }
}