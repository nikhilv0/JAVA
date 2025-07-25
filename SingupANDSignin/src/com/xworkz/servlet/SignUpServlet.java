package com.xworkz.servlet;

import com.xworkz.dto.SignUpDTO;
import com.xworkz.service.SignUpService;
import com.xworkz.service.SignUpServiceImp;
import jakarta.mail.*;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.Properties;

@WebServlet(urlPatterns = "/signUp", loadOnStartup = 1)

public class SignUpServlet extends HttpServlet {

    public SignUpServlet() {
        System.out.println("SignUpServlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("action").equals("signup")) {
            signUpLogic(req, resp);

        } else if (req.getParameter("action").equals("signin")) {
            signinLogic(req, resp);
//            doGet(req, resp);
        }

    }

    private static void signUpLogic(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String userId = req.getParameter("userId");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        SignUpDTO dto = new SignUpDTO(email, userId, password, confirmPassword);

//        System.out.println(dto);

        SignUpService service = new SignUpServiceImp();
        String result = service.validateAndsave(dto);

        if (!result.equals("SuccessFully sumbitted")) {
            System.out.println("form not submitted");
            req.setAttribute("dto", dto);
        }
        System.out.println(dto);
        System.out.println("Result:" + result);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("signUp.jsp");
        req.setAttribute("result", result);
        requestDispatcher.forward(req, resp);
    }


    private static void signinLogic(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String userId= req.getParameter("userId");
        String mail = req.getParameter("email");
        HttpSession httpSessionMail = req.getSession();
        httpSessionMail.setAttribute("mail", mail);
        String password = req.getParameter("password");
//        System.out.println("ID:"+userId);
        System.out.println("mail:" + mail);
        System.out.println("password:" + password);

        SignUpService service = new SignUpServiceImp();
        SignUpDTO signUpDTO = service.findBy(mail, password);

        if (signUpDTO != null) {
            System.out.println("data found");
            SecureRandom secureRandom = new SecureRandom();
            String otp1 = String.format("%06d", secureRandom.nextInt(1000000));
            System.out.println("Secure OTP: " + otp1);

            HttpSession httpSessionOTP = req.getSession();
            httpSessionOTP.setAttribute("otp", otp1);
            sendOtpEmail(mail, otp1, resp);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("otp.jsp");
            req.setAttribute("dto", signUpDTO);
            requestDispatcher.forward(req, resp);
        } else {
            String message = "Enter valid mail and Password";
            System.out.println(message);
            req.setAttribute("message", message);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("signIn.jsp");
            requestDispatcher.forward(req, resp);
        }
    }


    private static void sendOtpEmail(String mailTo, String otp, HttpServletResponse resp) {
        final String fromEmail = "nikhilnikki6360@gmail.com";
        final String password = "tdxgmresdnwqvgdd";

        SignUpService service = new SignUpServiceImp();
        String mail = service.sendOtpToMAil(mailTo, otp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
