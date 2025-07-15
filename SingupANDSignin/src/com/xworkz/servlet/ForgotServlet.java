package com.xworkz.servlet;

import com.xworkz.dto.SignUpDTO;
import com.xworkz.service.SignUpService;
import com.xworkz.service.SignUpServiceImp;
import jakarta.mail.*;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Properties;

@WebServlet(urlPatterns = "/Forgot",loadOnStartup = 1)
public class ForgotServlet extends HttpServlet {

    public ForgotServlet() {
        System.out.println("ForgotServlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("emailOrUserId");
        HttpSession httpSession= req.getSession();
        httpSession.setAttribute("email",email);
//        String userId = req.getParameter("emailOrUserId");
        System.out.println("Mail:" + email);
//        System.out.println("userId:" + userId);

        SignUpService service = new SignUpServiceImp();
        SignUpDTO signUpDTO = service.findByUser(email);
        HttpSession forgotdto=req.getSession();
        httpSession.setAttribute("fogotsignupDTO",signUpDTO);

        if (signUpDTO != null) {
            System.out.println("data found");
            SecureRandom secureRandom=new SecureRandom();
            String otp2 = String.format("%06d",secureRandom.nextInt(1000000));
            System.out.println("OTP: "+ otp2 + "for ForgotPage ");
            HttpSession httpSession1=req.getSession();
            httpSession1.setAttribute("otp2",otp2);

            doGet(req,resp);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("forgotOTP.jsp");
            req.setAttribute("dto", signUpDTO);
            requestDispatcher.forward(req, resp);
        } else {
            String message = "Enter valid mail and Password";
            System.out.println(message);
            req.setAttribute("message", message);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("forgot.jsp");
            requestDispatcher.forward(req, resp);

        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String mailfromSession=(String) req.getSession(false).getAttribute("email");
        String otpfromSession=(String) req.getSession(false).getAttribute("otp2");
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
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailfromSession));
            message.setSubject("Your OTP Code");
            message.setText("Your One-Time Password (OTP) is: " + otpfromSession);

            Transport.send(message);
            System.out.println("✅ OTP email sent to " + mailfromSession);

        } catch (AddressException ae) {
            resp.getWriter().println("<h3 style='color:red;'>Invalid email address</h3>");
        } catch (MessagingException me) {
            resp.getWriter().println("<h3 style='color:red;'>Email sending failed</h3>");
        }
    }
}
