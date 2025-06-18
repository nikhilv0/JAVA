package com.xworkz.repository;

import com.xworkz.dto.JobDTO;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JobRepositoryImp implements JobRepository {
    @Override
    public void save(JobDTO jobDTO) {
        System.out.println("running save in JobRepository");
        System.out.println("WARN:should save in DB");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//FQN
            String url="jdbc:mysql://localhost:3306/Connection";
            String username="root";
            String password="Nikki6360";

            Connection connection=DriverManager.getConnection(url,username,password);
            String sql="insert into job_app values(0,'"+jobDTO.getName()+"','"+jobDTO.getEmail()+"','"+jobDTO.getEducation()+"','"+jobDTO.getSkills()+"','"+jobDTO.getExpectedSalary()+"','"+jobDTO.getExperience()+"')";

            Statement statement=connection.createStatement();

            statement.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
