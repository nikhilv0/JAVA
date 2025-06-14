package com.xworkz.repository;

import com.xworkz.dto.BirthCertificateDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BirthCertifacateRepositoryImp implements BirthCertificateRepository{


    @Override
    public void save(BirthCertificateDTO birthCertificateDTO) {
        System.out.println("running save in BirthCertificateRepository");
        System.out.println("WARN:should save in DB");


        try {
//            load  and register
            Class.forName("com.mysql.cj.jdbc.Driver");//FQN
            String url="jdbc:mysql://localhost:3306/Connection";
            String username="root";
            String password="Nikki6360";
//           create connection
            Connection connection= DriverManager.getConnection(url,username,password);
//           prepare statement
            String sql="insert into Birth_certificate values(0,'"+birthCertificateDTO.getBirthId()+"','"+birthCertificateDTO.getHospitalName()+"','"+birthCertificateDTO.getFatherName()+"','"+birthCertificateDTO.getMotherName()+"','"+birthCertificateDTO.getDateTime()+"','"+birthCertificateDTO.getDoctorName()+"','"+birthCertificateDTO.getNurseName()+"','"+birthCertificateDTO.getHospitalType()+"')";
            Statement statement=connection.createStatement();
//            excute statement
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
