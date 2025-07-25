package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateStock",loadOnStartup = 1)
public class UpdateBloodStock extends HttpServlet {

    public UpdateBloodStock() {
        System.out.println("UpdateBloodStock Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bloodGroup=req.getParameter("bloodGroup") ;
        int Quantity=Integer.parseInt(req.getParameter("Quantity"));
        System.out.println();
    }
}
