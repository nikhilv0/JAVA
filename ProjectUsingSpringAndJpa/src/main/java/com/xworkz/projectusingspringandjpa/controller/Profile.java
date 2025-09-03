package com.xworkz.projectusingspringandjpa.controller;

import com.xworkz.projectusingspringandjpa.dto.UpdateProfileDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.service.ProfileService;
import com.xworkz.projectusingspringandjpa.service.UpdateProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class Profile {

    @Autowired
    ProfileService profileService;

    @Autowired
    UpdateProfileService updateProfileService;

    public Profile() {
        System.out.println("Profile Constructor");
    }

    @RequestMapping(value = "/Profile", method = RequestMethod.POST)
    public String profile(HttpSession session, Model model) {
        System.out.println("Profile method");

        String email = (String) session.getAttribute("emailFromSession");

        boolean exits = profileService.exitsByMail(email);
        if (email != null && exits) {
            List<SignUpEntity> list = profileService.getEntityByMail(email);
            System.out.println(list.toString());
            model.addAttribute("list", list);
            return "Profile";
        }
        model.addAttribute("err", "No Entity Found By Email");
        return "Profile";
    }

    @RequestMapping("/updateProfile")
    public String updateProfile(Model model, UpdateProfileDTO updateProfileDTO, BindingResult bindingResult) {
        System.out.println("updateProfile Method");

        if (bindingResult.hasErrors()) {
            List<ObjectError> objectErrors = bindingResult.getAllErrors();
            for (ObjectError objectError : objectErrors) {
                System.err.println(objectError.getDefaultMessage());
            }
        }

        System.out.println(updateProfileDTO.toString());
        boolean exits = profileService.exitsByMail(updateProfileDTO.getEmail());
        if (exits) {
            String updated = updateProfileService.updateProfile(updateProfileDTO);
            System.out.println(updated);
            if (updated.equals("updated Successfully")) {
                model.addAttribute("msg", updated);
                return "Profile";
            }
            model.addAttribute("err",updated);
            return "Profile";
        }
        model.addAttribute("err","No User Found");
        return "Profile";
    }
}
