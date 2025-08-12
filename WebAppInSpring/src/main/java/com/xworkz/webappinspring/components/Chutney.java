package com.xworkz.webappinspring.components;

import com.xworkz.webappinspring.dto.ChappalDTO;
import com.xworkz.webappinspring.dto.ChutneyDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Chutney {
    public Chutney() {
        System.out.println("Chutney Constructor");
    }

    @RequestMapping("/onClickChuntey")
    public String onClickChutney(Model model){
        System.out.println("Running Chutney method");
//        System.out.println(chutneyDTO.toString());

        model.addAttribute("name","name is working");                        //1st way using model
        System.out.println(model);
        return "chutney";

    }
}
