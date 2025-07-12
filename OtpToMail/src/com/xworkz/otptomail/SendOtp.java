package com.xworkz.otptomail;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Random;

@WebServlet(urlPatterns = "/otp",loadOnStartup = 1)
public class SendOtp extends HttpServlet {

    private String generateOtp() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000); // 6-digit OTP
        return String.valueOf(otp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String otpFromSession = generateOtp();
        System.out.println(otpFromSession);
        String mail=req.getParameter("email");
//        String mailFromSession = (String) req.getSession(false).getAttribute("mail");


        final String fromEmail = "nikhilnikki6360@gmail.com";
        final String password = "tdxgmresdnwqvgdd";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });


        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail));
            message.setSubject("Your OTP Code");
            message.setText("Your One-Time Password (OTP) is: " + otpFromSession);

            Transport.send(message);

            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println("<h3 style='color:green;'>OTP sent successfully to " + mail + "</h3>");

        } catch (
                MessagingException e) {
            resp.getWriter().println("<h3 style='color:red;'>Failed to send OTP</h3>");
        }
    }
}

