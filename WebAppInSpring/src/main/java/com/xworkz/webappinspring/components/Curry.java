package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Curry {
    public Curry() {
        System.out.println("Curry Constructor");
    }

    @RequestMapping("/onClickCurry")
    public String onClickCurry(){
        System.out.println("Running Curry method");
        return "curry.jsp";
    }
}