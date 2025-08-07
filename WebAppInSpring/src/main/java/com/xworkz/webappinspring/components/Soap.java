package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Soap {
    public Soap() {
        System.out.println("Soap Constructor");
    }

    @RequestMapping("/onClickSoap")
    public String onClickSoap(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Soap method");
        System.out.println(name+" "+price);
        return "soap.jsp";
    }
}
