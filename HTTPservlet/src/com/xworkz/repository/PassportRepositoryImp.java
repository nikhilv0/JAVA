package com.xworkz.repository;

import com.xworkz.dto.PassportDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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

            Connection connection= DriverManager.getConnection(url,username,password);

            String sql="insert into Passport values(0,'"+passportDTO.getApplicantName()+"','"+passportDTO.getAadharNo()+"','"+passportDTO.getAddress()+"','"+passportDTO.getPanNo()+"','"+passportDTO.getCountry()+"','"+passportDTO.getState()+"','"+passportDTO.getCity()+"','"+passportDTO.getPinCode()+"','"+passportDTO.getPassportType()+"','"+passportDTO.getPaymentRefNo()+"')";
            Statement statement=connection.createStatement();

            statement.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
