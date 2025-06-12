package com.xworkz.servlet;

import com.xworkz.dto.DrivingLicenseDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/DrivingLicense", loadOnStartup = 1)
public class DrivingLicenseServlet extends HttpServlet {

    public DrivingLicenseServlet() {
        System.out.println("running DrivingLicenseServlet const");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String mobile = req.getParameter("mobile");
        String appliedDate = req.getParameter("appliedDate");
        String vehicleType = req.getParameter("vehicleType");

        System.out.println("name: " + name + "\naddress: " + address + "\nmobile: " + mobile + "\nappliedDate: " + appliedDate + "\nvehicleType: " + vehicleType);

        DrivingLicenseDTO dto = new DrivingLicenseDTO(name, address, mobile, appliedDate, vehicleType);
        req.setAttribute("licenseDTO", dto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Result");
        dispatcher.forward(req, resp);
    }
}
