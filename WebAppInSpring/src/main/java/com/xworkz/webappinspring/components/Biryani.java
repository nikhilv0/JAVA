package com.xworkz.webappinspring.components;
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
    public ModelAndView onClickBiryani(ModelAndView model){
        System.out.println("Running Biryani method");

//        model.addAttribute("name","name is working");                        //1st way using model
//        System.out.println(model);


        model.addObject("name","hooo kttaaa");        // 2nd way using modelAndView
        model.setViewName("biryani");
        return model;

    }
}