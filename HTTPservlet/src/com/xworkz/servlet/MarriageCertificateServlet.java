package com.xworkz.servlet;

import com.xworkz.dto.MarriageCertificateDTO;
import com.xworkz.service.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/MarriageCertificateService", loadOnStartup = 1)
public class MarriageCertificateServlet extends HttpServlet {

    public MarriageCertificateServlet() {
        System.out.println("running MarriageCertificateServlet const");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String groomName = req.getParameter("groomName");
        String brideName = req.getParameter("brideName");
        String location = req.getParameter("location");
        String address = req.getParameter("address");
        String religion = req.getParameter("religion");
        String date = req.getParameter("date");
        String witness1 = req.getParameter("witness1");
        String witness2 = req.getParameter("witness2");
        String officer = req.getParameter("officer");

        Thread thread=Thread.currentThread();
        System.out.println(thread);

        System.out.println("groomName: " + groomName + "\nbrideName: " + brideName + "\nlocation: " + location + "\naddress: " + address + "\nreligion: " + religion + "\ndate: " + date + "\nwitness1: " + witness1 + "\nwitness2: " + witness2 + "\nofficer: " + officer);

        MarriageCertificateDTO dto = new MarriageCertificateDTO(groomName, brideName, location, address, religion, date, witness1, witness2, officer);
        req.setAttribute("marriageDTO", dto);

        MarriageCertificateService marriageCertificateService =new MarriageCertificateServiceImp();
        String result=marriageCertificateService.validateandsave(dto);
        System.out.println("result"+result);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Result");
        dispatcher.forward(req, resp);
    }
}