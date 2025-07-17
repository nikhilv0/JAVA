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

@WebServlet(urlPatterns = "/reset",loadOnStartup = 1)
public class ForgotCredentials extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String newPassword=req.getParameter("newPassword");
        String confirmPassword=req.getParameter("confirmPassword");
        System.out.println("newPassword: "+newPassword+"\nconfirmPassword: "+confirmPassword);

       String forgotmail=(String)req.getSession(false).getAttribute("forgotmail");
        req.setAttribute("dto", forgotmail);

        SignUpService service=new SignUpServiceImp();
        String reset=service.resetPass(newPassword,confirmPassword, String.valueOf(forgotmail));
        System.out.println(reset);

        if (reset.equals("Password is valid")){
            req.setAttribute("mess",reset);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req,resp);
        }
        else {
            req.setAttribute("mess",reset);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("forgotCredentials.jsp");
            requestDispatcher.forward(req,resp);
        }


    }
}
