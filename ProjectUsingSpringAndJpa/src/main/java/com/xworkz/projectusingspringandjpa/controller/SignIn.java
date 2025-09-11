package com.xworkz.projectusingspringandjpa.controller;

import com.mysql.cj.Session;
import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.SignUpRepository;
import com.xworkz.projectusingspringandjpa.service.SignInService;
import com.xworkz.projectusingspringandjpa.service.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/")
public class SignIn {
    @Autowired
    SignInService signInService;

    @Autowired
    SignUpRepository signUpRepository;

    public SignIn() {
        System.out.println("SignIn Construct");
    }

    @RequestMapping("/signIn")
    public String signIn(Model model, SignInDTO signInDTO, BindingResult bindingResult, HttpSession httpSession) {
        System.out.println("SignIn Page");

        httpSession.setAttribute("emailFromSession", signInDTO.getEmail());

        if (bindingResult.hasErrors()) {
            List<ObjectError> bindingResults = bindingResult.getAllErrors();
            for (ObjectError objectError : bindingResults) {
                System.err.println(objectError.getDefaultMessage());
            }
        }
        System.out.println(signInDTO);
        String valid = signInService.login(signInDTO);
        if ("User Found".equals(valid)) {
            String otpSent = (String) httpSession.getAttribute("generatedOtp");
            model.addAttribute("otpSent", otpSent);
            model.addAttribute("email", signInDTO.getEmail());
            model.addAttribute("mess", valid);
            return "SignIn";
        }
        model.addAttribute("mess", valid);
        return "SignIn";
    }


    @RequestMapping("/verifyOtp")
    public String verifyOtp(@RequestParam("otp") String otp,@RequestParam("email") String email,Model model, SignInDTO signInDTO,BindingResult bindingResult,HttpSession httpSession){

        Optional<SignUpEntity> optionalUser = signUpRepository.findByEmail(signInDTO.getEmail());

        if (optionalUser.isPresent()) {
            SignUpEntity user = optionalUser.get();

            // 🔒 Check if locked
            if (signInService.isAccountLocked(user)) {
                model.addAttribute("invalids", "Account locked. Try again after 24 hours.");
                return "SignIn";
            }

            String verified = signInService.verifyOtp(otp, signInDTO);

            if (verified.equals("Login successful!")) {
                user.setFailedAttempts(0);
                user.setLocked(false);
                user.setLockTime(null);
                signUpRepository.save(user);
                model.addAttribute("mess", verified);
                return "Dashboard";
            } else {
                int attempts = user.getFailedAttempts() + 1;
                user.setFailedAttempts(attempts);

                if (attempts >= 3) {
                    user.setLocked(true);
                    user.setLockTime(LocalDateTime.now());
                    model.addAttribute("invalids", "Account locked for 24 hours due to 3 failed attempts.");
                } else {
                    model.addAttribute("invalids", verified + " | Attempts: " + attempts);
                }

                signUpRepository.save(user);
            }
        } else {
            model.addAttribute("invalids", "User not found");
        }

        return "SignIn";
    }
}

