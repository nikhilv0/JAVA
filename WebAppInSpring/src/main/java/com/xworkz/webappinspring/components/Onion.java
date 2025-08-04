package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Onion {
    public Onion() {
        System.out.println("Onion Constructor");
    }

    @RequestMapping("/onClickOnion")
    public String onClickOnion(){
        System.out.println("Running Onion method");
        return "onion.jsp";
    }
}