package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Chappal {
    public Chappal() {
        System.out.println("Chappal Constructor");
    }

    @RequestMapping("/onClickChappal")
    public String onClickChappal(){
        System.out.println("Running Chappal method");
        return "chappal.jsp";
    }
}