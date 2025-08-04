package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Biryani {
    public Biryani() {
        System.out.println("Biryani Constructor");
    }

    @RequestMapping("/onClickBiryani")
    public String onClickBiryani(){
        System.out.println("Running Biryani method");
        return "biryani.jsp";
    }
}