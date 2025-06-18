package com.xworkz.repository;

import com.xworkz.dto.MarriageCertificateDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MarriageCertificateRepositoryImp implements MarriageCertificateRepository{
    @Override
    public void save(MarriageCertificateDTO marriageCertificateDTO) {
        System.out.println("running save in MarriageCertificateRepository");
        System.out.println("WARN:should save in DB");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//FQN
            String url="jdbc:mysql://localhost:3306/Connection";
            String username="root";
            String password="Nikki6360";

            Connection connection= DriverManager.getConnection(url,username,password);
            String sql="insert into Marriage_Certificate values(0,'"+marriageCertificateDTO.getGroomName()+"','"+marriageCertificateDTO.getBrideName()+"','"+marriageCertificateDTO.getLocation()+"','"+marriageCertificateDTO.getAddress()+"','"+marriageCertificateDTO.getReligion()+"','"+marriageCertificateDTO.getDate()+"','"+marriageCertificateDTO.getWitness1()+"','"+marriageCertificateDTO.getWitness2()+"','"+marriageCertificateDTO.getOfficerPresent()+"')";
            Statement statement=connection.createStatement();

            statement.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
