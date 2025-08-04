package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Shoe {
    public Shoe() {
        System.out.println("Shoe Constructor");
    }

    @RequestMapping("/onClickShoe")
    public String onClickShoe(){
        System.out.println("Running Shoe method");
        return "shoe.jsp";
    }
}