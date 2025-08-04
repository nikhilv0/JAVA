package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Parota {
    public Parota() {
        System.out.println("Parota Constructor");
    }

    @RequestMapping("/onClickParota")
    public String onClickParota(){
        System.out.println("Running Parota method");
        return "parota.jsp";
    }
}