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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String otp=req.getParameter("otp");

        SignUpService service=new SignUpServiceImp();
        String send=service.generateOtp(otp);

        if (send!=null){
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req,resp);
        }else {
            System.out.println("enter valid otp");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("otp.jsp");
            String mess="Back to sign In page";
            req.setAttribute("opt1",otp);
            req.setAttribute("mess",mess);
            requestDispatcher.forward(req,resp);

        }
    }
}
