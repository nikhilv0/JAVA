package com.xworkz.webappinspring.controller;

import com.xworkz.webappinspring.dto.ChutneyDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Chutney {
    public Chutney() {
        System.out.println("Chutney Constructor");
    }

    @RequestMapping("/onClickChuntey")
    public String onClickChutney(Model model, ChutneyDTO chutneyDTO){
        System.out.println("Running Chutney method");
//        System.out.println(chutneyDTO.toString());

        model.addAttribute("value",chutneyDTO);
        return "chutney";

    }
}
