package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Soap {
    public Soap() {
        System.out.println("Soap Constructor");
    }

    @RequestMapping("/onClick")
    public String onClick(){
        System.out.println("Running Soap method");
        return "soap.jsp";
    }
}
