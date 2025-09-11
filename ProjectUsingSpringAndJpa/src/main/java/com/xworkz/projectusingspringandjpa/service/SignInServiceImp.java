package com.xworkz.projectusingspringandjpa.service;

import com.xworkz.projectusingspringandjpa.dto.SignInDTO;
import com.xworkz.projectusingspringandjpa.entity.SignInEntity;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import com.xworkz.projectusingspringandjpa.repository.SignInRepository;
import com.xworkz.projectusingspringandjpa.repository.SignUpRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;

@Slf4j
@Service
public class SignInServiceImp implements SignInService {
    @Autowired
    SignInRepository signInRepository;

    @Autowired
    SignUpRepository signUpRepository;

    @Autowired
    JavaMailSender javaMailSender;

    @Autowired
    private HttpSession httpSession;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public String login(SignInDTO signInDTO) {

        SignUpEntity storedUser = signInRepository.getEntityByMail(signInDTO.getEmail());
        if (storedUser == null) {
            return "User not Found";
        }

        String otp = generateOtp();
        sendOtpToEmail(signInDTO, otp);

        return "User Found";
    }

    @Override
    public String verifyOtp(String otp, SignInDTO signInDTO) {
        SignUpEntity storedUser = signInRepository.getEntityByMail(signInDTO.getEmail());
        if (storedUser == null) {
            return "User not Found";
        }
        String generatedOtp = (String) httpSession.getAttribute("generatedOtp");
        LocalDateTime experyTime = (LocalDateTime) httpSession.getAttribute("expiryTimeForOtp");

        if (otp.equals(generatedOtp) && (LocalDateTime.now().isAfter(experyTime))) {
//            Thread.sleep(1000);
//            if (passwordEncoder.matches(signInDTO.getPassword(), storedUser.getPassword())) {
            SignInEntity signInEntity = new SignInEntity();
            signInEntity.setEmail(signInDTO.getEmail());
            signInEntity.setOtp(otp);
            signInEntity.setVisitedAt(new Timestamp(System.currentTimeMillis()));
            log.info(signInRepository.login(signInEntity));
            return "Login successful!";
        }
        return "Invalid otp!";
    }

    public boolean isAccountLocked(SignUpEntity user) {
        if (user.getLocked()!=null) {
            LocalDateTime lockTime = user.getLockTime();
            LocalDateTime now = LocalDateTime.now();

            long diffHours = Duration.between(lockTime, now).toHours();

            if (diffHours >= 24) {
                // unlock after 24 hours
                user.setLocked(false);
                user.setFailedAttempts(0);
                user.setLockTime(null);
                signUpRepository.save(user);
                return false;
            }
            return true; // still locked
        }
        return false;
    }



    private String generateOtp() {
        SecureRandom random = new SecureRandom();
        int otp1 = 100000 + random.nextInt(900000);
        LocalDateTime expiryTime = LocalDateTime.now().plusMinutes(5);
        httpSession.setAttribute("expiryTimeForOtp", expiryTime);
        String otp = String.valueOf(otp1);
        httpSession.setAttribute("generatedOtp", otp);
        System.out.println("Your OTP is: " + otp);
        return otp;
    }

    private void sendOtpToEmail(SignInDTO signInDTO, String otp) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("nikhilnikki6360@gmail.com");
        message.setTo(signInDTO.getEmail());
        message.setSubject("Your OTP for Login Verification");
        message.setText("Your One-Time Password (OTP) is: " + otp + "\n"
                + "This OTP is valid for 5 minutes.");

        javaMailSender.send(message);
    }
}

