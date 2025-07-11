package com.xworkz.repository;

import com.xworkz.constant.DBconstant;
import com.xworkz.dto.SignUpDTO;

import java.sql.*;
import java.time.LocalDate;

public class SignUpRepositoryImp implements SignUpRepository {
    @Override
    public String save(SignUpDTO signUpDTO) {
        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection = DriverManager.getConnection(DBconstant.URL.getValue(), DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

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
    public SignUpDTO findById(String mail,String password) {

        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection=DriverManager.getConnection(DBconstant.URL.getValue(),DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String sql = "SELECT * FROM sign_up WHERE email = '" + mail + "'";
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);

            while (resultSet.next()) {
                int pk = resultSet.getInt("id");
                String user = resultSet.getString("user_id");
                String Password= resultSet.getString("password");
                String email=resultSet.getString("email");
//                String conformPassword=resultSet.getString("confirmPassword");

                System.out.println("from DB");
                SignUpDTO signUpDTO1 = new SignUpDTO(user,email,Password);
                System.out.println(signUpDTO1);
                return signUpDTO1;
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
 }

    @Override
    public SignUpDTO findByUser(String userId, String email) {

        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection=DriverManager.getConnection(DBconstant.URL.getValue(),DBconstant.USERNAME.getValue(), DBconstant.PASSWORD.getValue());

            String sql="select * from sign_up where user_Id= '"+ userId +"'or email= '"+email+"'";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                int pk=resultSet.getInt("id");
                String user1=resultSet.getString("user_Id");
                String mail=resultSet.getString("email");
                String password=resultSet.getString("password");

                SignUpDTO signUpDTO=new SignUpDTO(user1,mail,password);
                System.out.println(signUpDTO);
                return signUpDTO;
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public String storeOTP(String emailSession,String otpSession) {

        try {
            Class.forName(DBconstant.DRIVER.getValue());
            Connection connection=DriverManager.getConnection(DBconstant.URL.getValue(),DBconstant.USERNAME.getValue(),DBconstant.PASSWORD.getValue());

            String sql="insert into otp values(?,?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);

            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,emailSession);
            preparedStatement.setString(3,otpSession);
            preparedStatement.setTimestamp(4, new Timestamp(System.currentTimeMillis()));

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "working";
    }
}
