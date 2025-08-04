package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Bottle {
    public Bottle() {
        System.out.println("Bottle Constructor");
    }

    @RequestMapping("/onClickBottle")
    public String onClickBottle(){
        System.out.println("Running Bottle method");
        return "bottle.jsp";
    }
}