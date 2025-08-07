package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Shoe {
    public Shoe() {
        System.out.println("Shoe Constructor");
    }

    @RequestMapping("/onClickShoe")
    public String onClickShoe(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Shoe method");
        System.out.println(name+" "+price);
        return "shoe.jsp";
    }
}