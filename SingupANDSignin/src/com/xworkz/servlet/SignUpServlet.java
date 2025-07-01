package com.xworkz.servlet;

import com.xworkz.dto.SignUpDTO;
import com.xworkz.repository.SignUpRepository;
import com.xworkz.repository.SignUpRepositoryImp;
import com.xworkz.service.SignUpService;
import com.xworkz.service.SignUpServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signUp",loadOnStartup = 1)

public class SignUpServlet extends HttpServlet {

    public SignUpServlet(){
        System.out.println("SignUpServlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email=req.getParameter("email");
        String userId=req.getParameter("userId");
        String password=req.getParameter("password");
        String confirmPassword=req.getParameter("confirmPassword");

        SignUpDTO dto=new SignUpDTO(email,userId,password,confirmPassword);

//        System.out.println(dto);

        SignUpService service=new SignUpServiceImp();
        String result=service.validateAndsave(dto);

        if (!result.equals("SuccessFully sumbitted")){
            System.out.println("form not submitted");
            req.setAttribute("dto",dto);
        }
        System.out.println(dto);
        System.out.println("Result:"+result);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("signUp.jsp");
        req.setAttribute("result",result);
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId=req.getParameter("userId");
        String password=req.getParameter("password");
        System.out.println("ID:"+userId);
        System.out.println("password:"+password);

        SignUpService service=new SignUpServiceImp();
        SignUpDTO signUpDTO=service.findBy(userId,password);

        if (signUpDTO!=null){
            System.out.println("data found");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp");
            req.setAttribute("dto",signUpDTO);
            requestDispatcher.forward(req,resp);

        }
        else {
            String message="Enter valid User ID and Password";
            System.out.println(message);
            req.setAttribute("message",message);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("signIn.jsp");
            requestDispatcher.forward(req,resp);
        }




    }
}
