package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.entity.SignInEntity;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.SignInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.time.LocalDateTime;


@Service
public class SignInServiceImp implements SignInService {
    @Autowired
    SignInRepository signInRepository;

    @Autowired
    JavaMailSender javaMailSender;

    private HttpSession httpSession;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public String login(SignInDTO signInDTO) {

        SignUpEntity storedUser = signInRepository.getEntityByMail(signInDTO.getEmail());
        if (storedUser == null) {
            return "User not Found";
        }

        SecureRandom random = new SecureRandom();
        int otp1 = 100000 + random.nextInt(900000);
        LocalDateTime expiryTime = LocalDateTime.now().plusMinutes(2);
        String otp = String.valueOf(otp1);
        System.out.println("Your OTP is: " + otp);

        sendOtpToEmail(signInDTO, otp);

        String inputOtp = (String) httpSession.getAttribute("");
        if (otp.equals(inputOtp) && (LocalDateTime.now().isAfter(expiryTime))) {
//            Thread.sleep(1000);

            if (passwordEncoder.matches(signInDTO.getPassword(), storedUser.getPassword())) {
                SignInEntity signInEntity = new SignInEntity();
                signInEntity.setEmail(signInDTO.getEmail());
                signInEntity.setPassword(storedUser.getPassword());
                signInEntity.setVisitedAt(new Timestamp(System.currentTimeMillis()));
                System.out.println(signInRepository.login(signInEntity));
                return "Login successful!";
            } else {
                return "Invalid password!";
            }

        }
        return "Invalid Otp";

    }

    private void sendOtpToEmail(SignInDTO signInDTO, String otp) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("nikhilnikki6360@gmail.com");
        message.setTo(signInDTO.getEmail());
        message.setSubject("Your OTP for Login Verification");
        message.setText("Your One-Time Password (OTP) is: " + otp + "\n"
                + "This OTP is valid for 2 minutes.");

        javaMailSender.send(message);
    }
}

