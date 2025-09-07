package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.entity.SignInEntity;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.SignInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.sql.Timestamp;


@Service
public class SignInServiceImp implements SignInService {
    @Autowired
    SignInRepository signInRepository;

    @Autowired
    JavaMailSender javaMailSender;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public String login(SignInDTO signInDTO) {

        SignUpEntity storedUser = signInRepository.getEntityByMail(signInDTO.getEmail());
        if (storedUser == null) {
            return "User not Found";
        }

        SecureRandom random = new SecureRandom();
        int otp = 100000 + random.nextInt(900000);
        System.out.println("Your OTP is: " + otp);

        sendOtpToEmail(signInDTO, otp);

        if (passwordEncoder.matches(signInDTO.getPassword(), storedUser.getPassword())) {
            SignInEntity signInEntity = new SignInEntity();
            signInEntity.setEmail(signInDTO.getEmail());
            signInEntity.setPassword(storedUser.getPassword());
            signInEntity.setVisitedAt(new Timestamp(System.currentTimeMillis()));
            System.out.println(signInRepository.login(signInEntity));
            return "Login successful!";
        }
        else {
            return "Invalid password!";
        }

    }

    private void sendOtpToEmail(SignInDTO signInDTO,int otp){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom("nikhilnikki6360@gmail.com");
        message.setTo(signInDTO.getEmail());
        message.setSubject("Your OTP for Login Verification");
        message.setText("Your One-Time Password (OTP) is: " + otp);

        javaMailSender.send(message);
    }
}
