package com.xworkz.servlet;

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

    public OtpServlet() {
        System.out.println("OtpServlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String otp=req.getParameter("otp");

        String otpFromSession=(String)req.getSession(false).getAttribute("otp");
        String emailSession=(String)req.getSession(false).getAttribute("mail");

        String Forgototp=(String)req.getSession(false).getAttribute("otp2");
        String Forgotemail=(String)req.getSession(false).getAttribute("email");



        SignUpService service=new SignUpServiceImp();
        String send=service.generateOtp(otp,otpFromSession,emailSession,Forgototp,Forgotemail);



        if (send.equals("validated otp for singIn")){
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req,resp);
        }
        else if (send.equals("validated otp for forgot")){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("forgot.jsp");
            String value="User Details:";
            req.setAttribute("value",value);
            String forgotDTO=(String)req.getSession(false).getAttribute("fogotsignupDTO") ;
            req.setAttribute("dto", forgotDTO);
            requestDispatcher.forward(req, resp);
        }
        else {
            System.out.println("enter valid otp");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("otp.jsp");
            String mess="Enter valid otp";
            req.setAttribute("mess",mess);
            requestDispatcher.forward(req,resp);

        }
    }
}
