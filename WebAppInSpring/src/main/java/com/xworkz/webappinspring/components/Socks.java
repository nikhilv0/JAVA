package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Socks {
    public Socks() {
        System.out.println("Socks Constructor");
    }

    @RequestMapping("/onClickSocks")
    public String onClickSocks(@RequestParam String name, @RequestParam int price){
        System.out.println("Running Socks method");
        System.out.println(name+" "+price);
        return "socks.jsp";
    }
}
