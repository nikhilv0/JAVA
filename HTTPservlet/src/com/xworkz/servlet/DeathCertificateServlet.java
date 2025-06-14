package com.xworkz.servlet;

import com.xworkz.dto.DeathCertificateDTO;
import com.xworkz.service.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/DeathCertificateService", loadOnStartup = 1)
public class DeathCertificateServlet extends HttpServlet {

    public DeathCertificateServlet() {
        System.out.println("running DeathCertificateServlet const");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String cause = req.getParameter("cause");
        String date = req.getParameter("date");
//        String time = req.getParameter("time");
        int ageAtDeath = Integer.parseInt(req.getParameter("ageAtDeath"));
        String certifiedBy = req.getParameter("certifiedBy");
        String hospitalName = req.getParameter("hospitalName");
        String mannerOfDeath = req.getParameter("mannerOfDeath");
        String gender = req.getParameter("gender");
        String marks = req.getParameter("marks");
        LocalDateTime dateTime=LocalDateTime.parse(date);


        Thread thread=Thread.currentThread();
        System.out.println(thread);

        System.out.println("name: " + name + "\ncause: " + cause + "\ndate: " + dateTime + "\nageAtDeath: " + ageAtDeath + "\ncertifiedBy: " + certifiedBy + "\nhospitalName: " + hospitalName + "\nmannerOfDeath: " + mannerOfDeath + "\ngender: " + gender + "\nmarks: " + marks);
        DeathCertificateDTO dto = new DeathCertificateDTO(name, cause, dateTime, ageAtDeath, certifiedBy, hospitalName, mannerOfDeath, gender, marks);
        req.setAttribute("deathDTO", dto);

        DeathCertificateService deathCertificateService =new DealthCertificateServiceImp();
        String result=deathCertificateService.validateandsave(dto);
        System.out.println("result"+result);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Result");
        dispatcher.forward(req, resp);
    }
}