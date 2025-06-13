package com.xworkz.servlet;

import com.xworkz.dto.jobDTO;
import com.xworkz.service.Jobservice;
import com.xworkz.service.JobserviceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/jobapp" ,loadOnStartup = 1)
public class jobServlet extends HttpServlet {

    public jobServlet(){
        System.out.println("running jobServlet const");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String education=req.getParameter("education");
        String skills=req.getParameter("skills");
        String salary=req.getParameter("salary");
        String experience=req.getParameter("experience");
        double expectsal=Double.parseDouble(salary);

        Thread thread=Thread.currentThread();
        System.out.println(thread);
        System.out.println("name: "+name+"\n email :"+email+"\n education: "+education+"\n skills: "+skills+"\n salary: "+salary+"\n experience: "+experience);

        jobDTO jobDTO1=new jobDTO(name,email,education,expectsal,experience,skills);
        req.setAttribute("jobDTO",jobDTO1);

        Jobservice jobservice =new JobserviceImp();
        String result=jobservice.validateandsave(jobDTO1);
        System.out.println("Result:"+result);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("Result");
        requestDispatcher.forward(req,resp);

    }
}
