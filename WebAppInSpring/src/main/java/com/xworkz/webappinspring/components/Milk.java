package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Milk {
    public Milk() {
        System.out.println("Milk Constructor");
    }

    @RequestMapping("/onClickMilk")
    public String onClickMilk(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Milk method");
        System.out.println(name+" "+price);
        return "milk.jsp";
    }
}