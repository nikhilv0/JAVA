package com.xworkz.collection.servlet;

import com.xworkz.collection.DTO.PaymentDTO;

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
        String lastName=req.getParameter("lastName"); //???

//        PaymentDTO paymentDTO=new PaymentDTO(name,lastName);
//        System.out.println(paymentDTO);

        List<PaymentDTO> list=new ArrayList<>();
        list.add(new PaymentDTO(name,lastName));
        for (PaymentDTO paymentDTO:list){
            System.out.println(paymentDTO);
        }
    }
}

