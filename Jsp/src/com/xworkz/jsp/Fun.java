package com.xworkz.jsp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/form",loadOnStartup = 1)
public class Fun extends GenericServlet {

    public Fun(){
        System.out.println("running const fun");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        String name=servletRequest.getParameter("name");
        String password=servletRequest.getParameter("password");

        System.out.println("name:"+name);
        System.out.println("password:"+password);

        dto dto1=new dto();
        dto1.setName(name);
        dto1.setPassword(password);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("/Result.jsp");
//        servletRequest.setAttribute("name",name);
//        servletRequest.setAttribute("password",password);
        servletRequest.setAttribute("dto",dto1);
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
