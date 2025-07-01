package com.xworkz.repository;

import com.xworkz.constant.DBconstant;
import com.xworkz.dto.SignUpDTO;

import java.sql.*;
import java.time.LocalDate;

public class SignUpRepositoryImp implements SignUpRepository {
    @Override
    public String save(SignUpDTO signUpDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DBconstant.URL.getProp(), DBconstant.USERNAME.getProp(), DBconstant.PASSWORD.getProp());

            String sql = "insert into sign_up values(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, signUpDTO.getEmail());
            preparedStatement.setString(3, signUpDTO.getUserId());
            preparedStatement.setString(4, signUpDTO.getPassword());
//            preparedStatement.setString(5,signUpDTO.getConfirmPassword());
            preparedStatement.setDate(5, java.sql.Date.valueOf(LocalDate.now()));

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "false";
    }

    @Override
    public SignUpDTO findById(String userId,String password) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(DBconstant.URL.getProp(),DBconstant.USERNAME.getProp(), DBconstant.PASSWORD.getProp());

            String sql = "SELECT * FROM sign_up WHERE user_id = '" + userId + "' AND password = '" + password + "'";
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);

            while (resultSet.next()) {
                int pk = resultSet.getInt("id");
                String name = resultSet.getString("user_id");
                String Password= resultSet.getString("password");
                String email=resultSet.getString("email");
//                String conformPassword=resultSet.getString("confirmPassword");


                SignUpDTO signUpDTO1 = new SignUpDTO(name,email,Password);
                System.out.println(signUpDTO1);
                return signUpDTO1;
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
 }
}
