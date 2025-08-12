package com.xworkz.webappinspring.controller;
import com.xworkz.webappinspring.dto.BiriyaniDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class Biryani {
    public Biryani() {
        System.out.println("Biryani Constructor");
    }

    @RequestMapping("/onClickBiryani")
    public ModelAndView onClickBiryani(ModelAndView model, BiriyaniDTO biriyaniDTO){
        System.out.println("Running Biryani method");

//        model.addAttribute("name","name is working");                        //1st way using model
//        System.out.println(model);


        model.addObject("value",biriyaniDTO);        // 2nd way using modelAndView
        model.setViewName("biryani");
        return model;

    }
}