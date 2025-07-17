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
        HttpSession forgotmailsession=req.getSession();
        forgotmailsession.setAttribute("forgotmail",email);
//        System.out.println("userId:" + userId);

        SignUpService service = new SignUpServiceImp();
        SignUpDTO signUpDTO = service.findByUser(email);
//        HttpSession forgotdto=req.getSession();
//        httpSession.setAttribute("fogotsignupDTO",signUpDTO);   needed for setting values in front

        if (signUpDTO != null) {
            System.out.println("data found");
            SecureRandom secureRandom=new SecureRandom();
            String otp2 = String.format("%06d",secureRandom.nextInt(1000000));
            System.out.println("OTP: "+ otp2 + " for ForgotPage ");
            HttpSession httpSession1=req.getSession();
            httpSession1.setAttribute("otp2",otp2);

            doGet(req,resp);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("forgotOTP.jsp");
            req.setAttribute("dto", signUpDTO);
            requestDispatcher.forward(req, resp);
        } else {
            String message = "Enter valid mail*";
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

        SignUpService service = new SignUpServiceImp();
        String sendOtpToMAil = service.sendOtpToMAil(mailfromSession,otpfromSession);
    }
}
