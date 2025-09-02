package com.xworkz.projectusingspringandjpa.controller;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;
import com.xworkz.projectusingspringandjpa.service.ForgotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/")
public class ForgotPage {
    @Autowired
    ForgotService forgotService;
    @Autowired
    JavaMailSender mailSender;

    public ForgotPage() {
        System.out.println("ForgotPage Constructor");
    }
    @RequestMapping("/forgotPassword")
    public String forgotPassword(HttpServletRequest request,Model model, ForgotDTO forgotDTO, BindingResult bindingResult){
        System.out.println("Forgot Page");

        if(bindingResult.hasErrors()){
           List<ObjectError>bindingResults= bindingResult.getAllErrors();
           for (ObjectError objectError:bindingResults){
               System.err.println(objectError.getDefaultMessage());
           }
        }
        System.out.println(forgotDTO.toString());
        boolean exists= forgotService.MailExits(forgotDTO);
        if (!exists){
            model.addAttribute("error", "Email not found!");
            return "Forgot";
        }

        String token= UUID.randomUUID().toString();
        String updateToken=forgotService.updateToken(token,forgotDTO);
        System.out.println(updateToken);

        if (updateToken.equals("token saved successfully")) {
            String link = getSiteURL(request) + "/reset?token=" + token;

            sendResetEmail(forgotDTO, link);
            model.addAttribute("msg", "A password reset link has been sent to your email.");

            return "Forgot";
        }
        else {
            model.addAttribute("token",updateToken);
            return "Forgot";
        }
    }

    private String getSiteURL(HttpServletRequest request) {
        return request.getRequestURL().toString().replace(request.getServletPath(), "");
    }

    private void sendResetEmail(ForgotDTO forgotDTO, String link) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("nikhilnikki6360@gmail.com");
        message.setTo(forgotDTO.getEmail());
        message.setSubject("Password Reset Request");
        message.setText("Click the link below to reset your password:\n" + link);

        mailSender.send(message);
    }

}
