package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Milk {
    public Milk() {
        System.out.println("Milk Constructor");
    }

    @RequestMapping("/onClickMilk")
    public String onClickMilk(){
        System.out.println("Running Milk method");
        return "milk.jsp";
    }
}