package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Parota {
    public Parota() {
        System.out.println("Parota Constructor");
    }

    @RequestMapping("/onClickParota")
    public String onClickParota(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Parota method");
        System.out.println(name+" "+price);
        return "parota.jsp";
    }
}