package com.xworkz.repository;

import com.xworkz.constant.DBconstant;
import com.xworkz.dto.BloodStockDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BloodStockRepositoryImp implements BloodStockRepository {
    @Override
    public String stock(BloodStockDTO bloodStockDTO) {
        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection = DriverManager.getConnection(DBconstant.URL2.getValue(), DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String sql = "insert into blood_stock (id,blood_group,quantity,created_at) values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, bloodStockDTO.getBloodGroup());
            preparedStatement.setInt(3, bloodStockDTO.getQuantity());
            preparedStatement.setTimestamp(4, new Timestamp(System.currentTimeMillis()));

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
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return "Id is present";
            } else {
                return "Id not found";
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String update(BloodStockDTO bloodStockDTO, int id) {
        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection = DriverManager.getConnection(DBconstant.URL2.getValue(), DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String sql = "update blood_stock set quantity = ?,updated_at = CURRENT_TIMESTAMP WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, bloodStockDTO.getQuantity());
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "Successfully updated";
    }


    @Override
    public String delete(int id) {
        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection = DriverManager.getConnection(DBconstant.URL2.getValue(), DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String sql = "delete from blood_stock WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "Successfully deleted";
    }

    @Override
    public List<BloodStockDTO> viewStock(String bloodGroup) {
        List<BloodStockDTO> list = new ArrayList<>();

        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection = DriverManager.getConnection(DBconstant.URL2.getValue(), DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String sql = "select * from blood_stock WHERE blood_group=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, bloodGroup);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String blood_group = resultSet.getString("blood_group");
                int quantity = resultSet.getInt("quantity");
                Timestamp created_at = resultSet.getTimestamp("created_at");
                Timestamp updated_at = resultSet.getTimestamp("updated_at");

                BloodStockDTO bloodStockDTO = new BloodStockDTO(blood_group, quantity, id, created_at, updated_at);
                list.add(bloodStockDTO);
            }
            list.forEach(System.out::println);
            System.out.println("data found");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
