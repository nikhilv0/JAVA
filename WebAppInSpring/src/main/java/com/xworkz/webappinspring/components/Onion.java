package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Onion {
    public Onion() {
        System.out.println("Onion Constructor");
    }

    @RequestMapping("/onClickOnion")
    public String onClickOnion(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Onion method");
        System.out.println(name+" "+price);
        return "onion.jsp";
    }
}