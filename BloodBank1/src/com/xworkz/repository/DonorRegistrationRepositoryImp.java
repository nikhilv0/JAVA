package com.xworkz.repository;

import com.xworkz.constant.DBconstant;
import com.xworkz.dto.DonorRegistrationDTO;

import java.sql.*;

public class DonorRegistrationRepositoryImp implements DonorRegistrationRepository {
    @Override
    public String save(DonorRegistrationDTO donorRegistrationDTO) {

        System.out.println("running save in BirthCertificateRepository");
        System.out.println("WARN:should save in DB");


        try {
//           load  and register
            Class.forName("com.mysql.cj.jdbc.Driver");//FQN
//            String url="jdbc:mysql://localhost:3306/Blood_Bank";
//            String username="root";
//            String password="Nikki6360";
//           create connection
            Connection connection= DriverManager.getConnection(DBconstant.URL.getValue(),DBconstant.USERNAME.getValue(),DBconstant.PASSWORD.getValue());
            System.out.println("Connection:"+connection);
//           prepare statement
//            String sql="insert into DonorRegistration values(0,'"+donorRegistrationDTO.getName()+"',"+donorRegistrationDTO.getAge()+",'"+donorRegistrationDTO.getGender()+"','"+donorRegistrationDTO.getBloodGroup()+"','"+donorRegistrationDTO.getContact()+"','"+donorRegistrationDTO.getAddress()+"','"+donorRegistrationDTO.getLastDonationDate()+"')";
//            Statement statement=connection.createStatement();
//            excute statement
//            statement.executeUpdate(sql);

//            preparedStatement for sql injection
            String noConcatSql="insert into DonorRegistration values(?,?,?,?,?,?,?,?)";

//            pre-compile
            PreparedStatement preparedStatement= connection.prepareStatement(noConcatSql);

//            set values
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,donorRegistrationDTO.getName());
            preparedStatement.setInt(3,donorRegistrationDTO.getAge());
            preparedStatement.setString(4,donorRegistrationDTO.getBloodGroup());
            preparedStatement.setLong(5,donorRegistrationDTO.getContact());
            preparedStatement.setString(6,donorRegistrationDTO.getAddress());
            preparedStatement.set(7,donorRegistrationDTO.getLastDonationDate());
            preparedStatement.setString(4,donorRegistrationDTO.getName());

//            execute statement
            preparedStatement.executeUpdate();


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "false";
    }

    @Override
    public DonorRegistrationDTO findById(int id) {

        try {
//           load  and register
            Class.forName("com.mysql.cj.jdbc.Driver");//FQN
//            String url="jdbc:mysql://localhost:3306/Blood_Bank";
//            String username="root";
//            String password="Nikki6360";
//           create connection
            Connection connection= DriverManager.getConnection(DBconstant.URL.getValue(),DBconstant.USERNAME.getValue(),DBconstant.PASSWORD.getValue());
            System.out.println("Connection:"+connection);

            String sql="select * from DonorRegistration where id= " + id + " ";

            System.out.println("SQL"+sql);

            Statement statement=connection.createStatement();

            ResultSet resultSet=statement.executeQuery(sql);
            System.out.println("resultSet:"+resultSet);

            while(resultSet.next()){

                int pk=resultSet.getInt("id");
                String name=resultSet.getString("name");
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
