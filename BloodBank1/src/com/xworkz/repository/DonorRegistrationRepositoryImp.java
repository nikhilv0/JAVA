package com.xworkz.repository;

import com.xworkz.dto.DonorRegistrationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DonorRegistrationRepositoryImp implements DonorRegistrationRepository {
    @Override
    public void save(DonorRegistrationDTO donorRegistrationDTO) {

        System.out.println("running save in BirthCertificateRepository");
        System.out.println("WARN:should save in DB");


        try {
//            load  and register
            Class.forName("com.mysql.cj.jdbc.Driver");//FQN
            String url="jdbc:mysql://localhost:3306/Blood_Bank";
            String username="root";
            String password="Nikki6360";
//           create connection
            Connection connection= DriverManager.getConnection(url,username,password);
//           prepare statement
            String sql="insert into DonorRegistration values(0,'"+donorRegistrationDTO.getName()+"',"+donorRegistrationDTO.getAge()+",'"+donorRegistrationDTO.getGender()+"','"+donorRegistrationDTO.getBloodGroup()+"','"+donorRegistrationDTO.getContact()+"','"+donorRegistrationDTO.getAddress()+"','"+donorRegistrationDTO.getLastDonationDate()+"')";
            Statement statement=connection.createStatement();
//            excute statement
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
