package com.xworkz.servlet;

import com.xworkz.dto.SignUpDTO;
import com.xworkz.service.SignUpService;
import com.xworkz.service.SignUpServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/otp",loadOnStartup = 1)
public class OtpServlet extends HttpServlet {

     public OtpServlet(){
         System.out.println("OtpServlet Constructor");
     }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            if (req.getParameter("otp1").equals("signotp")) {
            signinotp(req, resp);

            } else if (req.getParameter("otp1").equals("forgototp")) {
            forgototp(req, resp);
            }
     }

    private static void signinotp (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String otp = req.getParameter("otp");

        String otpFromSession = (String) req.getSession(false).getAttribute("otp");
        String emailSession = (String) req.getSession(false).getAttribute("mail");

        SignUpService service = new SignUpServiceImp();
        String send = service.generateOtp(otp, otpFromSession, emailSession);
        System.out.println(send);


        if (send.equals("validated otp for singIn")) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("otp.jsp");
            req.setAttribute("mess", send);
            requestDispatcher.forward(req, resp);

        }
    }

    private static void forgototp(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String forgototp=req.getParameter("forgototp");

        String Forgototp=(String)req.getSession(false).getAttribute("otp2");
        String Forgotemail=(String)req.getSession(false).getAttribute("email");

        SignUpService service=new SignUpServiceImp();
        String validate=service.validateForgototp(forgototp,Forgototp,Forgotemail);
        System.out.println(validate);

        if (validate.equals("validated otp for forgot")){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("forgot.jsp");
            String value="User Details:";
            req.setAttribute("value",value);
            SignUpDTO forgotDTO=(SignUpDTO) req.getSession(false).getAttribute("fogotsignupDTO") ;
            req.setAttribute("dto", forgotDTO);
            requestDispatcher.forward(req, resp);
        }
        else {
            req.setAttribute("mess",validate);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("forgotOTP.jsp");
            requestDispatcher.forward(req,resp);
        }
    }
}





