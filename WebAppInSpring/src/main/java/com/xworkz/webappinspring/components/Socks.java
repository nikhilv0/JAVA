package com.xworkz.webappinspring.components;

import com.xworkz.webappinspring.dto.SocksDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Socks {
    public Socks() {
        System.out.println("Socks Constructor");
    }

    @RequestMapping("/onClickSocks")
    public String onClickSocks(Model model){
        System.out.println("Running Socks method");
//        System.out.println(socksDTO.toString());

        model.addAttribute("name","name is working");                        //1st way using model
        System.out.println(model);
        return "socks";
    }
}
