package com.xworkz.collection.servlet;

import com.xworkz.collection.DTO.PaymentDTO;
import com.xworkz.collection.service.PaymentService;
import com.xworkz.collection.service.PaymentServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(urlPatterns = "/payment",loadOnStartup = 1)
public class PaymentServlet extends HttpServlet {

    public PaymentServlet(){
        System.out.println("PaymentServlet Construct");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String lastName=req.getParameter("lastName");
        String email=req.getParameter("email");
        String address=req.getParameter("address");
        String zipCode=req.getParameter("ZIPCode");
        String upiID=req.getParameter("upi-id");

        PaymentDTO paymentDTO=new PaymentDTO(name,lastName,email,address,zipCode,upiID);
        System.out.println(paymentDTO);

        PaymentService paymentService=new PaymentServiceImp();
        String validate=paymentService.validateAndSave(paymentDTO);
        System.out.println(validate);

        }
    }

