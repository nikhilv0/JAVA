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

@WebServlet(urlPatterns = "/bloodStock", loadOnStartup = 1)
public class BloodStockServlet extends HttpServlet {

    public BloodStockServlet() {
        System.out.println(" BloodStockServlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("action").equals("stock")){
        AddStock(req, resp);
    }
        else {
            updateStockbyID(req,resp);
        }
    }

    private static void AddStock(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bloodgroup = req.getParameter("bloodGroup");
        String quantity = req.getParameter("Quantity");
        int quantity1=Integer.parseInt(quantity);

        BloodStockDTO bloodStockDTO = new BloodStockDTO(bloodgroup, quantity1);
        System.out.println(bloodStockDTO);

        BloodStockService bloodStockService = new BloodStockServiceImp();
        String validate = bloodStockService.validateAndSave(bloodStockDTO);
        System.out.println(validate);

        if (validate.equals("validated")) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("bloodStock.jsp");
            String send = "SucessFully Submitted";
            req.setAttribute("mess", send);
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("bloodStock.jsp");
            req.setAttribute("valid", validate);
            req.setAttribute("dto", bloodStockDTO);
            requestDispatcher.forward(req, resp);
        }
    }

    private static void updateStockbyID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        int id1=Integer.parseInt(id);
        HttpSession idfromHttpSession=req.getSession();
        idfromHttpSession.setAttribute("id",id1);
        System.out.println("Id:"+id1);

        BloodStockService bloodStockService=new BloodStockServiceImp();
        String valid=bloodStockService.updateByid(id1);
        System.out.println(valid);

        RequestDispatcher requestDispatcher;
        if (valid.equals("valid Id")){
            requestDispatcher = req.getRequestDispatcher("updateStock.jsp");
        }else {
            requestDispatcher = req.getRequestDispatcher("IdForUpdateStock.jsp");
        }
        req.setAttribute("mess",valid);
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
