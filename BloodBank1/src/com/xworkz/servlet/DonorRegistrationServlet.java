package com.xworkz.servlet;

import com.xworkz.dto.DonorRegistrationDTO;
import com.xworkz.service.DonorRegistrationService;
import com.xworkz.service.DonorRegistrationServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;


@WebServlet(urlPatterns = "/Donorregister",loadOnStartup = 1)
public class DonorRegistrationServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        int id1=Integer.parseInt(id);
        System.out.println("ID:"+id1);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        int age= Integer.parseInt(req.getParameter("age"));
        String gender=(req.getParameter("gender"));
        String bloodGroup=req.getParameter("bloodGroup");
        Long contact= Long.valueOf(req.getParameter("contact"));
        String address=req.getParameter("address");
        LocalDate lastDonationDate= LocalDate.parse(req.getParameter("lastDonation"));

        Thread thread=Thread.currentThread();
        System.out.println(thread);

        DonorRegistrationDTO dto=new DonorRegistrationDTO(name,age,gender,bloodGroup,contact,address,lastDonationDate);
        System.out.println(dto);

        DonorRegistrationService donorRegistrationService=new DonorRegistrationServiceImp();
        String result=donorRegistrationService.validateAndSave(dto);
        System.out.println(result);
//      req.setAttribute("dto",dto);
//      it will pass all the dto

//servlet chaining
        RequestDispatcher dispatcher = req.getRequestDispatcher("DonorRegistration.jsp");
        req.setAttribute("result",result);
        if (!result.equals("successfully submitted Application")){
            req.setAttribute("dto",dto);
//          where this will pass with condition
        }
        dispatcher.forward(req, resp);

    }
}
