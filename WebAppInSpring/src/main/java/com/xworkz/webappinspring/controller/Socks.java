package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.SocksDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class Socks {
    public Socks() {
        System.out.println("Socks Constructor");
    }

    @RequestMapping("/onClickSocks")
    public String onClickSocks(Model model, SocksDTO socksDTO){
        System.out.println("Running Socks method");
//        System.out.println(socksDTO.toString());

        model.addAttribute("name",socksDTO);
        return "socks";
    }
}
