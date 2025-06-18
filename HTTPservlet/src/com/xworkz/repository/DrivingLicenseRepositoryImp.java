package com.xworkz.repository;

import com.xworkz.dto.DrivingLicenseDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DrivingLicenseRepositoryImp implements DrivingLicenseRepository{
    @Override
    public void save(DrivingLicenseDTO drivingLicenseDTO) {
        System.out.println("running save in DrivingLicenseRepository");
        System.out.println("WARN:should save in DB");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//FQN
            String url="jdbc:mysql://localhost:3306/Connection";
            String username="root";
            String password="Nikki6360";

            Connection connection= DriverManager.getConnection(url,username,password);
            String sql="insert into Driving_License values(0,'"+drivingLicenseDTO.getName()+"','"+drivingLicenseDTO.getAddress()+"','"+drivingLicenseDTO.getMobile()+"','"+drivingLicenseDTO.getAppliedDate()+"','"+drivingLicenseDTO.getVehicleType()+"')";
            Statement statement=connection.createStatement();

            statement.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
