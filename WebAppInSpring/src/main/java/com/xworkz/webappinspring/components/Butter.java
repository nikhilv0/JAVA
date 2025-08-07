package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Butter {
    public Butter() {
        System.out.println("Butter Constructor");
    }

    @RequestMapping("/onClickButter")
    public String onClickButter(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Butter method");
        System.out.println(name+" "+price);
        return "butter.jsp";
    }
}
