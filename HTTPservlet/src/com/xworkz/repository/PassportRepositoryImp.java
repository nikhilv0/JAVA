package com.xworkz.repository;

import com.xworkz.dto.PassportDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PassportRepositoryImp implements PassportRepository{
    @Override
    public void save(PassportDTO passportDTO) {
        System.out.println("running save in PassportRepository");
        System.out.println("WARN:should save in DB");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//FQN
            String url="jdbc:mysql://localhost:3306/Connection";
            String username="root";
            String password="Nikki6360";
            try {
                Connection connection= DriverManager.getConnection(url,username,password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
