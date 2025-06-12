package com.xworkz.servlet;

import com.xworkz.dto.PassportDTO;

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
        String aadharNo = req.getParameter("aadharNo");
        String address = req.getParameter("address");
        String panNo = req.getParameter("panNo");
        String country = req.getParameter("country");
        String state = req.getParameter("state");
        String city = req.getParameter("city");
        String pinCode = req.getParameter("pinCode");
        String passportType = req.getParameter("passportType");
        String paymentRefNo = req.getParameter("paymentRefNo");

        System.out.println("applicantName:"+applicantName + "\naadharNo: " + aadharNo + "\naddress: " + address + "\npanNo: " + panNo + "\ncountry: " + country + "\nstate: " + state + "\ncity: " + city + "\npinCode: " + pinCode + "\npassportType: " + passportType + "\npaymentRefNo: " + paymentRefNo);

        PassportDTO dto = new PassportDTO(applicantName, aadharNo, address, panNo, country, state, city, pinCode, passportType, paymentRefNo);
        req.setAttribute("passportDTO", dto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("Result");
        dispatcher.forward(req, resp);
    }
}