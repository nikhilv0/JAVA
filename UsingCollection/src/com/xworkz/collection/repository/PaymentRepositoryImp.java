package com.xworkz.collection.repository;

import com.xworkz.collection.DTO.PaymentDTO;
import com.xworkz.collection.dbconstant.DBconstant;

import java.sql.*;

public class PaymentRepositoryImp implements PaymentRepository{
    @Override
    public String save(PaymentDTO paymentDTO) {
        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection= DriverManager.getConnection(DBconstant.URL.getValue(),DBconstant.USERNAME.getValue(),DBconstant.PASSWORD.getValue());

            String sql="insert into payment_info values(?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);

            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,paymentDTO.getName());
            preparedStatement.setString(3,paymentDTO.getLastName());
            preparedStatement.setString(4,paymentDTO.getEmail());
            preparedStatement.setString(5,paymentDTO.getAddress());
            preparedStatement.setString(6, paymentDTO.getZipCode());
            preparedStatement.setString(7,paymentDTO.getUpiID());
            preparedStatement.setTimestamp(8,new Timestamp(System.currentTimeMillis()));

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "Sucessfully Saved";
    }
}
