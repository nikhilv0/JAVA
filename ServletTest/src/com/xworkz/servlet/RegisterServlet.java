package com.xworkz.servlet;

import com.xworkz.dto.RegisterDTO;
import com.xworkz.service.RegisterService;
import com.xworkz.service.RegisterServiceImp;
import sun.rmi.server.Dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/register",loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {

    public RegisterServlet(){
        System.out.println("running RegisterServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("register.jsp");
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        String conPassword=req.getParameter("conPassword");
        Long contact= Long.valueOf(req.getParameter("contact"));

        Thread thread=new Thread();
        System.out.println(thread);
        RegisterDTO dto=new RegisterDTO(name,email,password,conPassword,contact);
        req.setAttribute("dto",dto);
        System.out.println(dto);

        RegisterService registerService=new RegisterServiceImp();
        registerService.validateAndSave(dto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
        dispatcher.forward(req, resp);

    }
}
