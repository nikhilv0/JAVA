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
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/updateStock", loadOnStartup = 1)
public class UpdateBloodStock extends HttpServlet {

    public UpdateBloodStock() {
        System.out.println("UpdateBloodStock Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("action").equals("Save Changes")) {
            UpdateStock(req, resp);
        } else {
            DeleteStock(req, resp);
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bloodGroup = req.getParameter("bloodGroup");
        System.out.println("bloodGroup:" + bloodGroup);

        BloodStockService bloodStockService = new BloodStockServiceImp();
        List<BloodStockDTO> list = bloodStockService.viewStock(bloodGroup);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewBloodStock.jsp");
        if (list != null) {
            String mess = "valid bloodGroup";
            req.setAttribute("mess", mess);
            req.setAttribute("list", list);
        } else {
            String valid = "Enter valid bloodGroup";
            req.setAttribute("valid", valid);
        }
        requestDispatcher.forward(req, resp);

    }


    private static void UpdateStock(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int Quantity = Integer.parseInt(req.getParameter("quantity"));
        int id=Integer.parseInt(req.getParameter("id"));

        BloodStockDTO bloodStockDTO = new BloodStockDTO(Quantity);
        System.out.println(bloodStockDTO);

        BloodStockService bloodStockService = new BloodStockServiceImp();
        String valid = bloodStockService.ValidateNupdate(bloodStockDTO, id);
        System.out.println(valid);

        if (valid.equals("validated")) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewBloodStock.jsp");
            String mess = "Successfully Updated";
            req.setAttribute("mess", mess);
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewBloodStock.jsp");
            req.setAttribute("valid", valid);
            requestDispatcher.forward(req, resp);
        }
    }


    private static void DeleteStock(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idfromfront = req.getParameter("id");
        int id = 0;
        String valid = "";

        if (idfromfront != null && idfromfront.matches("\\d+")) {
            id = Integer.parseInt(idfromfront);
            System.out.println("ID: " + id);

            BloodStockService bloodStockService = new BloodStockServiceImp();
            valid = bloodStockService.deleteNupdate(id);
            System.out.println(valid);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("IdForDeleteStock.jsp");

            if (valid.equals("valid id")) {
                String mess = "Successfully deleted";
                req.setAttribute("mess", mess);
            } else {
                req.setAttribute("valid", valid);
            }

            requestDispatcher.forward(req, resp);

        } else {
            valid = "Please enter a valid numeric ID.";
            req.setAttribute("valid", valid);
            req.getRequestDispatcher("IdForDeleteStock.jsp").forward(req, resp);
        }
    }
}
