package com.xworkz.servlet;

import com.xworkz.dto.BloodStockDTO;
import com.xworkz.service.BloodStockService;
import com.xworkz.service.BloodStockServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateStock", loadOnStartup = 1)
public class UpdateBloodStock extends HttpServlet {

    public UpdateBloodStock() {
        System.out.println("UpdateBloodStock Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bloodGroup = req.getParameter("bloodGroup");
        int Quantity = Integer.parseInt(req.getParameter("Quantity"));
        int idfromSession = (int) req.getSession(false).getAttribute("id");
        System.out.println("bloodGroup:" + bloodGroup + " " + "Quantity:" + Quantity);

        BloodStockDTO bloodStockDTO = new BloodStockDTO(bloodGroup, Quantity);

        BloodStockService bloodStockService = new BloodStockServiceImp();
        String valid = bloodStockService.ValidateNupdate(bloodStockDTO, idfromSession);
        System.out.println(valid);

        if (valid.equals("validated")) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateStock.jsp");
            String mess = "Successfully Updated";
            req.setAttribute("mess", mess);
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateStock.jsp");
            req.setAttribute("valid", valid);
            requestDispatcher.forward(req, resp);
        }
    }
}
