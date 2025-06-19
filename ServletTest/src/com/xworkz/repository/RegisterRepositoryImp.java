package com.xworkz.repository;

import com.xworkz.dto.RegisterDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterRepositoryImp implements RegisterRepository{
    @Override
    public void save(RegisterDTO registerDTO) {

        System.out.println("running Register Repository");
        try {
//            load  and register
            Class.forName("com.mysql.cj.jdbc.Driver");//FQN
            String url="jdbc:mysql://localhost:3306/Test_DB";
            String username="root";
            String password="Nikki6360";
//           create connection
            Connection connection= DriverManager.getConnection(url,username,password);
//           prepare statement
            String sql="insert into Register_form values(0,'"+registerDTO.getName()+"','"+registerDTO.getEmail()+"','"+registerDTO.getPassword()+"','"+registerDTO.getConPassword()+"',"+registerDTO.getContact()+")";
            Statement statement=connection.createStatement();
//            excute statement
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
