package com.xworkz.projectusingspringandjpa.controller;

import com.mysql.cj.Session;
import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.service.SignInService;
import com.xworkz.projectusingspringandjpa.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class SignIn {
    @Autowired
    SignInService signInService;

    public SignIn() {
        System.out.println("SignIn Construct");
    }

    @RequestMapping("/signIn")
    public String signIn(Model model, SignInDTO signInDTO, BindingResult bindingResult, HttpSession httpSession){
        System.out.println("SignIn Page");

        httpSession.setAttribute("emailFromSession",signInDTO.getEmail());

        // Track attempts
        Integer attempts = (Integer) httpSession.getAttribute("loginAttempts");
        Long lockTime = (Long) httpSession.getAttribute("lockTime"); // store when locked

        if (attempts == null) {
            attempts = 0;
        }

        // If locked
        if (lockTime != null) {
            long currentTime = System.currentTimeMillis();
            long diffHours = (currentTime - lockTime) / (1000 * 60 * 60);

            if (diffHours < 24) {
                model.addAttribute("invalids", "Account locked due to 3 failed attempts. Try again after 24 hours.");
                return "SignIn";
            } else {
                // Unlock after 24 hours
                httpSession.setAttribute("loginAttempts", 0);
                httpSession.removeAttribute("lockTime");
            }
        }

        if (bindingResult.hasErrors()){
           List<ObjectError> bindingResults=bindingResult.getAllErrors();
           for (ObjectError objectError:bindingResults){
               System.err.println(objectError.getDefaultMessage());
           }
        }
        System.out.println(signInDTO.toString());
        String valid= signInService.login(signInDTO);
        if (valid.equals("Login successful!")) {
            httpSession.setAttribute("loginAttempts", 0);
            httpSession.removeAttribute("lockTime");
            model.addAttribute("mess", valid);
            return "Dashboard";
        }

        // If login failed
        attempts++;
        httpSession.setAttribute("loginAttempts", attempts);

        if (attempts >= 3) {
            httpSession.setAttribute("lockTime", System.currentTimeMillis());
            model.addAttribute("invalids", "Account locked for 24 hours due to 3 failed attempts.");
        } else {
            model.addAttribute("invalids", valid + " | Attempts: " + attempts);
        }

        return "SignIn";
    }

}
