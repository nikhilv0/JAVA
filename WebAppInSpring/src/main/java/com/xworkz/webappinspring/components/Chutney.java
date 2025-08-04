package com.xworkz.webappinspring.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Chutney {
    public Chutney() {
        System.out.println("Chutney Constructor");
    }

    @RequestMapping("/onClickChuntey")
    public String onClickChutney(){
        System.out.println("Running Chutney method");
        return "chutney.jsp";
    }
}
