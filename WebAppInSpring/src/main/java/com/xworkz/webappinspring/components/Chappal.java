package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Chappal {
    public Chappal() {
        System.out.println("Chappal Constructor");
    }

    @RequestMapping("/onClickChappal")
    public String onClickChappal(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Chappal method");
        System.out.println(name+" "+price);
        return "chappal.jsp";
    }
}