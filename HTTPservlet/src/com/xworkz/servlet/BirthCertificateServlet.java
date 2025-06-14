package com.xworkz.servlet;

import com.xworkz.dto.BirthCertificateDTO;
import com.xworkz.service.BirthCertifacateServiceImp;
import com.xworkz.service.BirthCertificateservice;
import com.xworkz.service.Jobservice;
import com.xworkz.service.JobserviceImp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/BirthCertificate", loadOnStartup = 1)
public class BirthCertificateServlet extends HttpServlet {

    public BirthCertificateServlet() {
        System.out.println("running BirthCertificateServlet const");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String birthId = req.getParameter("birthId");
        String hospitalName = req.getParameter("hospitalName");
        String fatherName = req.getParameter("fatherName");
        String motherName = req.getParameter("motherName");
        String dateTime = req.getParameter("birthDateTime");
        String doctorName = req.getParameter("doctorName");
        String nurseName = req.getParameter("nurseName");
        String hospitalType = req.getParameter("hospitalType");
        LocalDateTime dateTime1=LocalDateTime.parse(dateTime);

        Thread thread=Thread.currentThread();
        System.out.println(thread);

        System.out.println("birthId: " + birthId + "\nhospitalName: " + hospitalName + "\nfatherName: " + fatherName + "\nmotherName: " + motherName + "\ndateTime: " + dateTime + "\ndoctorName: " + doctorName + "\nnurseName: " + nurseName + "\nhospitalType: " + hospitalType);

        BirthCertificateDTO dto = new BirthCertificateDTO(birthId, hospitalName, fatherName, motherName, dateTime1, doctorName, nurseName, hospitalType);
        req.setAttribute("birthDTO", dto);

        BirthCertificateservice birthCertificateservice =new BirthCertifacateServiceImp();
        String result=birthCertificateservice.validateandsave(dto);
        System.out.println("result"+result);


        RequestDispatcher dispatcher = req.getRequestDispatcher("Result");
        dispatcher.forward(req, resp);
    }
}
