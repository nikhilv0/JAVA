package com.xworkz.servlet;

import com.xworkz.dto.PassportDTO;
import com.xworkz.service.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/PassportApplication", loadOnStartup = 1)
public class PassportServlet extends HttpServlet {

    public PassportServlet() {
        System.out.println("running PassportServlet const");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String applicantName = req.getParameter("applicantName");
        Long aadharNo = Long.valueOf(req.getParameter("aadhaarNo"));
        String address = req.getParameter("address");
        String panNo = req.getParameter("panNo");
        String country = req.getParameter("country");
        String state = req.getParameter("state");
        String city = req.getParameter("city");
        int pincode = Integer.parseInt(req.getParameter("pincode"));
        String passportType = req.getParameter("passportType");
        Long paymentRefNo = Long.valueOf(req.getParameter("paymentRef"));

        Thread thread=Thread.currentThread();
        System.out.println(thread);

        System.out.println("applicantName:"+applicantName + "\naadharNo: " + aadharNo + "\naddress: " + address + "\npanNo: " + panNo + "\ncountry: " + country + "\nstate: " + state + "\ncity: " + city + "\npinCode: " + pincode + "\npassportType: " + passportType + "\npaymentRefNo: " + paymentRefNo);

        PassportDTO dto = new PassportDTO(applicantName, aadharNo, address, panNo, country, state, city, pincode, passportType, paymentRefNo);
        req.setAttribute("passportDTO", dto);

        PassportService passportService =new PassportServiceImp();
        String result=passportService.validateandsave(dto);
        System.out.println("result"+result);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Result");
        dispatcher.forward(req, resp);
    }
}