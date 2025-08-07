package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Curry {
    public Curry() {
        System.out.println("Curry Constructor");
    }

    @RequestMapping("/onClickCurry")
    public String onClickCurry(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Curry method");
        System.out.println(name+" "+price);
        return "curry.jsp";
    }
}