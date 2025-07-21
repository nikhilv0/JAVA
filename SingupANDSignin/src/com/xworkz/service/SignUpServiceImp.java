package com.xworkz.service;

import com.xworkz.dto.SignUpDTO;
import com.xworkz.repository.SignUpRepository;
import com.xworkz.repository.SignUpRepositoryImp;
import jakarta.mail.*;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.Properties;

public class SignUpServiceImp implements SignUpService {

    @Override
    public String sendOtpToMAil(String mailfromSession, String otpfromSession){

        final String fromEmail = "nikhilnikki6360@gmail.com";
        final String password = "tdxgmresdnwqvgdd";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });


        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailfromSession));
            message.setSubject("Your OTP Code");
            message.setText("Your One-Time Password (OTP) is: " + otpfromSession);

            Transport.send(message);
            System.out.println("✅ OTP email sent to " + mailfromSession);

        } catch (AddressException ae) {
            System.out.println("<h3 style='color:red;'>Invalid email address</h3>");
        } catch (MessagingException me) {
            System.out.println("<h3 style='color:red;'>Email sending failed</h3>");
        }
        return "success";
    }


    @Override
    public String validateAndsave(SignUpDTO signUpDTO) {
        if (signUpDTO != null) {
            String email = signUpDTO.getEmail();
            String userId = signUpDTO.getUserId();
            String password = signUpDTO.getPassword();
            String confPassword = signUpDTO.getConfirmPassword();

            if (!mailPattern(email)){
                System.out.println("invalid mail");
                return "enter valid email";
            }
            if (userId.length() < 2 || userId.length() > 20) {
                System.out.println("Invalid userId");
                return "enter valid userID";
            }
            if (!passwordPattern(password)) {
                System.out.println("Invalid password");
                return "enter valid password";
            }
            if (!password.equals(confPassword)) {
                System.out.println("mismatched password");
                return "mismatched password";
            }
            SignUpRepository signUpRepository = new SignUpRepositoryImp();
            signUpRepository.save(signUpDTO);

        }
        return "SuccessFully sumbitted";
    }

    @Override
    public SignUpDTO findBy(String mail,String password) {
        if (mailPattern(mail) && passwordPattern(password)){
            System.out.println("valid mail and password");
            SignUpRepository signUpRepository = new SignUpRepositoryImp();
            return signUpRepository.findById(mail,password);

        } else {
            System.out.println("invalid user Id and password*");
        }
        return null;
    }


    @Override
    public SignUpDTO findByUser( String email) {

        if (mailPattern(email)){
            System.out.println("valid email");
            SignUpRepository signUpRepository = new SignUpRepositoryImp();
            return signUpRepository.findByUser(email);

        } else {
            System.out.println("invalid email");
        }
        return null;
    }


    @Override
    public String generateOtp(String otp,String otpFromSession,String emailSession) {  //otp for sign
            if (otp.equals(otpFromSession)){
                System.out.println("valid otp for signIn");
                SignUpRepository signUpRepository=new SignUpRepositoryImp();
                signUpRepository.storeOTP(emailSession,otpFromSession);
                return "validated otp for singIn";
            }
            else {
//                System.out.println("Enter valid otp ");
                return "Enter valid otp";
            }
    }


    @Override
    public String validateForgototp(String forgototp,String otp, String email) { //otp for forgot
        if (forgototp.equals(otp)) {
            System.out.println("valid otp for Forgot");
            SignUpRepository signUpRepository = new SignUpRepositoryImp();
            signUpRepository.forgotStoreOTP(email, otp);
            return "validated otp for forgot";
        }
        else {
            return "Enter valid otp";
        }
    }

    @Override
    public String resetPass(String newPassword, String confirmPass,String forgotmail) {
        if (passwordPattern(newPassword)){
                System.out.println("Password is valid");

                SignUpRepository signUpRepository=new SignUpRepositoryImp();
                String savedCredentials=signUpRepository.saveCredentials(newPassword,forgotmail);

                return "Password is valid";
        } else if (!newPassword.equals(confirmPass)) {
            return "Missmatched password*";

        }
        return "Password must be >6 chars, digit, upper, lower, and special character*";
    }




    private static boolean passwordPattern(String newPassword) {
        return newPassword.length() > 6 && newPassword.matches(".*\\d.*")
                && newPassword.matches(".*[A-Z].*")
                && newPassword.matches(".*[a-z].*")
                && newPassword.matches(".*[@#$%^&+=!].*");
    }


    private static boolean mailPattern(String email) {
        return email.length() > 4 &&
                email.contains("@") &&
                email.contains(".") &&
                email.indexOf('@') > 0 &&
                email.lastIndexOf('.') > email.indexOf('@') + 1 &&
                !email.contains(" ");
    }

}


