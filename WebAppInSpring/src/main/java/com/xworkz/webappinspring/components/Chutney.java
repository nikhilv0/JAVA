package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Chutney {
    public Chutney() {
        System.out.println("Chutney Constructor");
    }

    @RequestMapping("/onClickChuntey")
    public String onClickChutney(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Chutney method");
        System.out.println(name+" "+price);
        return "chutney.jsp";
    }
}
