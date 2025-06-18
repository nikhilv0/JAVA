package com.xworkz.servlet;

import com.xworkz.dto.DrivingLicenseDTO;
import com.xworkz.service.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/DrivingLicense", loadOnStartup = 1)
public class DrivingLicenseServlet extends HttpServlet {

    public DrivingLicenseServlet() {
        System.out.println("running DrivingLicenseServlet const");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        Long mobile = Long.valueOf(req.getParameter("mobile"));
        LocalDateTime appliedDate = LocalDateTime.parse(req.getParameter("appliedDate"));
        String vehicleType = req.getParameter("vehicleType");

        Thread thread=Thread.currentThread();
        System.out.println(thread);

        System.out.println("name: " + name + "\naddress: " + address + "\nmobile: " + mobile + "\nappliedDate: " + appliedDate + "\nvehicleType: " + vehicleType);

        DrivingLicenseDTO dto = new DrivingLicenseDTO(name, address, mobile, appliedDate, vehicleType);
        req.setAttribute("licenseDTO", dto);

        DrivingLicenseService drivingLicenseService = new DrivingLicenseServiceImp();
        String result=drivingLicenseService.validateandsave(dto);
        System.out.println("result"+result);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Result");
        dispatcher.forward(req, resp);
    }
}
