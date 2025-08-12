package com.xworkz.webappinspring.components;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.webappinspring.dto.ChappalDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Chappal {
    public Chappal() {
        System.out.println("Chappal Constructor");
    }

    @RequestMapping("/onClickChappal")
    public String onClickChappal(Model model){
        System.out.println("Running Chappal method");
//        System.out.println(chappalDTO.toString());

        model.addAttribute("name","name is working");                        //1st way using model
        System.out.println(model);
        return "chappal";
    }
}