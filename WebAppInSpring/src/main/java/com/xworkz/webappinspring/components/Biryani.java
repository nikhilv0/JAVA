package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Biryani {
    public Biryani() {
        System.out.println("Biryani Constructor");
    }

    @RequestMapping("/onClickBiryani")
    public String onClickBiryani(@RequestParam String name,@RequestParam int price){
        System.out.println("Running Biryani method");
        System.out.println(name+" "+price);
        return "biryani.jsp";
    }
}