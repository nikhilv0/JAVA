package com.xworkz.repository;

import com.xworkz.dto.DeathCertificateDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeathCertificateRepositoryImp implements DeathCertificateRepository{
    @Override
    public void save(DeathCertificateDTO deathCertificateDTO) {
        System.out.println("running save in DeathCertificateRepository");
        System.out.println("WARN:should save in DB");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//FQN
            String url="jdbc:mysql://localhost:3306/Connection";
            String username="root";
            String password="Nikki6360";

            Connection connection= DriverManager.getConnection(url,username,password);
            String sql="insert into death_Certificate values(0,'"+deathCertificateDTO.getName()+"','"+deathCertificateDTO.getCause()+"','"+deathCertificateDTO.getDate()+"','"+deathCertificateDTO.getTime()+"',"+deathCertificateDTO.getAgeAtDeath()+",'"+deathCertificateDTO.getCertifiedBy()+"','"+deathCertificateDTO.getHospitalName()+"','"+deathCertificateDTO.getMannerOfDeath()+"','"+deathCertificateDTO.getGender()+"','"+deathCertificateDTO.getMarks()+"')";
            Statement statement= connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println(connection);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
