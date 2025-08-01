package com.xworkz.fromexcel.service;
import jakarta.mail.*;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.List;
import java.util.Properties;

public class FromExcelServiceImp implements FromExcelService {


    @Override
    public String sendOtpToMAil(String mailfromSession){

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
            message.setText("Your One-Time Password (OTP) is: " );

            Transport.send(message);
            System.out.println("✅email sent to " + mailfromSession);

        } catch (AddressException ae) {
            System.out.println("<h3 style='color:red;'>Invalid email address</h3>");
        } catch (MessagingException me) {
            System.out.println("<h3 style='color:red;'>Email sending failed</h3>");
        }
        return "success";
    }

}
