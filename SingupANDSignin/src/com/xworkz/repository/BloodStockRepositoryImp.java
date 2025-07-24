package com.xworkz.repository;

import com.xworkz.constant.DBconstant;
import com.xworkz.dto.BloodStockDTO;

import java.sql.*;

public class BloodStockRepositoryImp implements BloodStockRepository {
    @Override
    public String stock(BloodStockDTO bloodStockDTO) {
        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection = DriverManager.getConnection(DBconstant.URL2.getValue(), DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String sql = "insert into blood_stock (id,group,quantity,created_at) values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(1, bloodStockDTO.getBloodGroup());
            preparedStatement.setString(2, bloodStockDTO.getQuantity());
            preparedStatement.setTimestamp(3, new Timestamp(System.currentTimeMillis()));

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "saved";
    }

    @Override
    public String updateBYid(int id) {

        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection = DriverManager.getConnection(DBconstant.URL2.getValue(), DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String sql = "select * from blood_stock where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "Id is present";
    }
}
