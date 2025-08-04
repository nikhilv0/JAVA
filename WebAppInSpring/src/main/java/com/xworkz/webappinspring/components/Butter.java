package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Butter {
    public Butter() {
        System.out.println("Butter Constructor");
    }

    @RequestMapping("/onClickButter")
    public String onClickButter(){
        System.out.println("Running Butter method");
        return "butter.jsp";
    }
}
