package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Socks {
    public Socks() {
        System.out.println("Socks Constructor");
    }

    @RequestMapping("/onClickSocks")
    public String onClickSocks(){
        System.out.println("Running Socks method");
        return "socks.jsp";
    }
}
