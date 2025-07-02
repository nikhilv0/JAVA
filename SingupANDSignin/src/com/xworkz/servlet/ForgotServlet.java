package com.xworkz.servlet;

import com.xworkz.dto.SignUpDTO;
import com.xworkz.service.SignUpService;
import com.xworkz.service.SignUpServiceImp;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Forgot",loadOnStartup = 1)
public class ForgotServlet extends HttpServlet {

    public ForgotServlet() {
        System.out.println("ForgotServlet constructor");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mail = req.getParameter("emailOrUserId");
        String userId = req.getParameter("emailOrUserId");
        System.out.println("Mail:" + mail);
        System.out.println("userId:" + userId);

        SignUpService service = new SignUpServiceImp();
        SignUpDTO signUpDTO = service.findByUser(userId, mail);

        if (signUpDTO != null) {
            System.out.println("data found");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("forgot.jsp");
            String value="User Details:";
            req.setAttribute("value",value);
            req.setAttribute("dto", signUpDTO);
            requestDispatcher.forward(req, resp);
        } else {
            String message = "Enter valid User ID and Password";
            System.out.println(message);
            req.setAttribute("message", message);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("forgot.jsp");
            requestDispatcher.forward(req, resp);

        }
    }
}
